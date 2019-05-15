package parser;

import typenscope.Func;
import typenscope.Symbol;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class lingCodeGenListener extends lingBorBaseListener {

    private static final String PATH_DIRECTORY = "src/main/java/codegen/";

    private static final String LL_FILE_TYPE = ".ll";

    private String fileName;

    private int numInterVar = 0;
    private int numPrintCall = 0;
    private int numCall = 0;
    private int numVar = 0;
    private int numOp = 0;
    private int numif = 0;

    private int numInterVarCopy;
    private int numPrintCallCopy;
    private int numCallCopy;
    private int numVarCopy;
    private int numOpCopy;
    private int numIfCopy;

    private int stateForFun = 0;
    private int stateForIf = 0;
    private String curFuncInputId;
    private String curFuncText = "";
    private List<String> funcList = new LinkedList<>();

    private BufferedWriter writer;

    HashMap<String, Symbol> symbolMap;
    HashMap<String, Symbol> funcVarMap;
    HashMap<String, Func> funcMap;
    HashMap<String, String> regSymbolMap = new HashMap<>();

    public lingCodeGenListener(String inputFileName) {
        fileName = PATH_DIRECTORY + inputFileName + LL_FILE_TYPE;
    }

    public void importMaps(HashMap<String, Symbol> symbolMap, HashMap<String, Func> funcMap) {
        this.symbolMap = symbolMap;
        this.funcMap = funcMap;
    }

    public String getTypeByName(String idName) {
        if (stateForFun == 0) {
            return symbolMap.get(idName).getType();
        } else {
            return funcVarMap.get(idName).getType();
        }
    }

    public String getTargetName(String idName) {
        String ret = "!";
        if (stateForFun != 0) {
            if (idName.equals(curFuncInputId)) {
                ret = "%" + idName + ".addr";
            } else if (funcVarMap.containsKey(idName)) {
                ret = "%" + idName;
            } else if (symbolMap.containsKey(idName)) {
                ret = "@" + idName;
            }
        } else {
            if (symbolMap.containsKey(idName)) {
                ret = "@" + idName;
            }
        }
        //System.out.println(ret+" "+idName+" "+curFuncInputId);
        return ret;
    }

    private void write(String str) {
        if (stateForFun != 0) {
            curFuncText += str;
        } else {
            try {
                writer.write(str);
            } catch (IOException e) {
                System.out.println("ERROR ! writing: " + str + "error: " + e);
            }
        }
    }

    @Override
    public void enterInput(lingBorParser.InputContext ctx) {
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            System.out.println("ERROR ! Open target output file failed: " + e);
        }


        String header = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\",align 1\n";
        write(header);

        // declare all global var in advance just as Clang does
        for (String name : symbolMap.keySet()) {
            String varName = name;
            String varType = getTypeByName(name);
            if (varType == "INT_LIT") {
                write(String.format("@%s = global i32 0, align 4\n", varName));
            } else if (varType == "ARRAY") {
                //ARRAY
            } else {
                //TUPLE
            }
        }

        String mainHeader = "\ndefine i32 @main() #0 {\nentry:\n";
        write(mainHeader);


    }

    private void allocateArray(String varName, int size) throws IOException {
        String output = String.format("  %%s = alloca [%d x i32], align 16", varName, size);
        writer.write(output);
    }

    @Override
    public void exitInput(lingBorParser.InputContext ctx) {
        try {
            writer.write("  ret i32 0\n}\n");
            if (numPrintCall > 0) {
                writer.write("declare i32 @printf(i8*, ...)\n");
            }
            for (int n = 0; n < funcList.size(); n++) {
                String body = funcList.get(n);
                if (body != "null") {
                    writer.write(body);
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("ERROR ! codegen cannot close output file: " + e);
        }
    }


    private String performArithmaticOp(lingBorParser.ExprContext ctx, String l, String r) {
        Integer left = Integer.parseInt(l);
        Integer right = Integer.parseInt(r);
        Integer ret = null;

        if (ctx.OP_DIV() != null) {
            ret = left / right;
        } else if (ctx.OP_MULT() != null) {
            ret = left * right;
        } else if (ctx.OP_MINUS() != null) {
            ret = left - right;
        } else if (ctx.OP_PLUS() != null) {
            ret = left + right;
        }
        return String.valueOf(ret);
    }

    private String performRegisterOp(lingBorParser.ExprContext ctx, String l, String r) {
        String opType = "";
        if (ctx.OP_DIV() != null) {
            opType = "sdiv";
        } else if (ctx.OP_MULT() != null) {
            opType = "mul";
        } else if (ctx.OP_MINUS() != null) {
            opType = "sub";
        } else if (ctx.OP_PLUS() != null) {
            opType = "add";
        }
        String ret = "%op" + numOp;
        write(String.format("  %s = %s nsw i32 %s, %s\n", ret, opType, l, r));
        numOp += 1;
        return ret;
    }

    private boolean isNumber(String str) {
        if (str.contains("%") || str.contains(("@"))) {
            return false;
        } else {
            return true;
        }
    }

    // if it's only arithmetic op between int_lit, get the answer, otherwise (id involved)
    // we may need to generate code on the run.
    private String evalExprRhs(lingBorParser.ExprContext ctx) {
        if (ctx.int_lit() != null) {
            return ctx.int_lit().INT_LIT().getSymbol().getText();
        } else if (ctx.id() != null) {
            String idName = ctx.id().ID().getSymbol().getText();
            if (!regSymbolMap.containsKey(idName)) {
                String regName = "%" + numVar;
                String targetName = getTargetName(idName);

                regSymbolMap.put(idName, regName);
                //String type = getTypeByName(idName);
                //I remember that no assign to array is permitted
                write(String.format("  %s = load i32, i32* %s, align 4\n", regName, targetName));
                numVar += 1;
                return regName;
            } else {
                return regSymbolMap.get(idName);
            }

        } else if (ctx.OP_COMMA() != null) {


        } else if (ctx.func_call() != null) {
            //I am only considering integer, this need to be altered if you are using tuple as input parameter
            String inReg = evalExprRhs(ctx.func_call().expr());
            String funcName = ctx.func_call().id().ID().getSymbol().getText();
            String callName = "%call" + numCall;
            write(String.format("  %s = call i32 @%s(i32 %s)\n", callName, funcName, inReg));
            this.numCall = this.numCall + 1;
            return callName;

        } else if (ctx.array_ele() != null) {


        } else if (ctx.tuple_ele() != null) {


        } else if (ctx.LPAR() != null) {
            // it means it is in the form of LPAR expr RPAR
            return evalExprRhs(ctx.expr(0));

        } else if (ctx.OP_PLUS() != null || ctx.OP_MINUS() != null
                || ctx.OP_MULT() != null || ctx.OP_DIV() != null) {
            //we can do this since the tree structure already put *,/ in the lower tree
            String left = evalExprRhs(ctx.expr(0));
            String right = evalExprRhs(ctx.expr(1));
            if (isNumber(left) && isNumber(right)) {
                return performArithmaticOp(ctx, left, right);
            } else {
                return performRegisterOp(ctx, left, right);
            }
        }
        return null;
    }

    private String evalExprLhs(lingBorParser.LhsContext ctx){
        int numItem = ctx.OP_COMMA().size()+1;
        if(numItem==1) {
            if (ctx.lhs_item(numItem - 1).id() != null) {
                String idName = ctx.lhs_item(0).id().ID().getSymbol().getText();
                if (!regSymbolMap.containsKey(idName)) {
                    String regName = "%" + numVar;
                    String targetName = getTargetName(idName);

                    regSymbolMap.put(idName, regName);
                    //String type = getTypeByName(idName);
                    //I remember that no assign to array is permitted
                    write(String.format("  %s = load i32, i32* %s, align 4\n", regName, targetName));
                    numVar += 1;
                    return regName;
                } else {
                    return regSymbolMap.get(idName);
                }

            } else if (ctx.lhs_item(numItem - 1).array_ele() != null) {


            } else if (ctx.lhs_item(numItem - 1).tuple_ele() != null) {

            }

        }
        return "!";
    }


    @Override public void enterDef(lingBorParser.DefContext ctx){

        stateForFun = 1;
        String funcName = ctx.id().ID().getSymbol().getText();
        String inputIdName = ctx.expr().id().ID().getSymbol().getText();
        curFuncInputId = inputIdName;
        funcVarMap = funcMap.get(funcName).getFuncVarMap();

        String type = funcMap.get(funcName).getInputType();
        System.out.println("entering func,input type: "+type);
        //now only support int_lit, need to support for tuple
        //ToDo
        write(String.format("\ndefine i32 @%s(i32 %s) {\nentry:\n",funcName,"%"+inputIdName));
        write(String.format("  %s.addr = alloca i32, align 4\n","%"+inputIdName));
        write(String.format("  store i32 %s, i32* %s.addr, align 4\n","%"+inputIdName,"%"+inputIdName));

        for (String idName : funcVarMap.keySet()){
            String varName = idName;
            if(varName.equals(inputIdName)) {
                continue;
            }
            String varType = getTypeByName(varName);

            if (varType=="INT_LIT"){
                write(String.format("  %s = alloca i32, align 4\n","%"+varName));
            } else if(varType=="ARRAY"){
                //ARRAY
            } else {
                //TUPLE
            }
        }

        numInterVarCopy = numInterVar;
        numPrintCallCopy = numPrintCall;
        numCallCopy = numCall;
        numVarCopy = numVar;
        numOpCopy = numOp;
        numIfCopy = numif;
        numInterVar = 0;
        numPrintCall = 0;
        numCall = 0;
        numOp = 0;
        numVar = 0;
        numif = 0;

    }

   @Override public void exitDef(lingBorParser.DefContext ctx){

        write("}\n");

        funcList.add(curFuncText);
        curFuncText = "";

        stateForFun = 0;
        numInterVar = numInterVarCopy;
        numPrintCall = numPrintCallCopy;
        numCall = numCallCopy;
        numOp = numOpCopy;
        numVar = numVarCopy;
        numif = numIfCopy;
   }

    @Override public void enterDecl(lingBorParser.DeclContext ctx) {
        //KW_GLOBAL id (ASSIGN expr)? SEMI
        if(ctx.KW_GLOBAL() != null) {
            if (ctx.ASSIGN() != null) {
                String outReg = evalExprRhs(ctx.expr(0));
                regSymbolMap.clear();

                String idName = ctx.id(0).ID().getSymbol().getText();
                String targetName = getTargetName(idName);
                if (getTypeByName(idName) == "INT_LIT") {
                    write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, targetName));
                } else {

                }
                //
            } else {


            }
        } else if (ctx.KW_LOCAL() != null){
            if (ctx.ASSIGN() != null) {
                String outReg = evalExprRhs(ctx.expr(0));
                regSymbolMap.clear();
                String idName = ctx.id(0).ID().getSymbol().getText();
                String targetName = getTargetName(idName);

                if (getTypeByName(idName) == "INT_LIT") {
                    //TODO ADD SUPPORT FOR ARRAY
                    write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, targetName));
                } else {

                }
                //
            } else {


            }

        } else if (ctx.KW_ARRAY() != null) {
            // TODO
        }
    }

    private String whichBoolOp(lingBorParser.Bool_exprContext ctx){
        String op = ctx.bool_op().getText();
        if(op.equals("<")){
            return "slt";
        } else if(op.equals(">")){
            return "sgt";
        } else if(op.equals("==")) {
            return "eq";
        } else if(op.equals("!=")){
            return "ne";
        } else if(op.equals("<=")){
            return "sle";
        } else if(op.equals(">=")){
            return "sge";
        } else {
            //not gonna happen
            return "";
        }
    }

    @Override public void enterStatement(lingBorParser.StatementContext ctx) {
        
        if(ctx.EXCHANGE()!=null) {
            write(String.format(" %s = alloca i32, align 4\n","%$tmp"+numInterVar));
            write(String.format("  store i32 %s, i32* %s, align 4\n","%"+numVar,"%$tmp"+numInterVar));

            numInterVar += 1;
            numVar += 1;

            //Todo we need to support multi lhs
            String left = evalExprLhs(ctx.lhs(0));
            String leftName = getTargetName(ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText());
            write(String.format("store i32 %s, i32* %s, align 4\n","%"+numVar,leftName));
            String right = evalExprLhs(ctx.lhs(1));
            String rightName = getTargetName(ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText());
            write(String.format("store i32 %s, i32* %s, align 4\n","%"+numVar,rightName));



        } else if(ctx.ASSIGN()!=null){
            String outOp = evalExprRhs(ctx.expr());
            regSymbolMap.clear();
            if(ctx.lhs(0).lhs_item().size()==1){
                String idName = ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText();
                String targetName = getTargetName(idName);
                write(String.format("  store i32 %s, i32* %s, align 4\n",outOp,targetName));
            } else {

            }
            //tbi for multiple lhs(multiple int, array not allowed)
            //maybe split into two sentences

        } else if(ctx.PRINT()!=null){
            String outOp = evalExprRhs(ctx.expr());
            String outFunc = String.format("  %s = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 ","%call"+numCall);
            regSymbolMap.clear();

            if (outOp == null){
            } else {
                outFunc = outFunc + outOp + ")\n";
            }

            numCall += 1;
            numPrintCall += 1;
            write(outFunc);

        } else if(ctx.RETURN()!=null) {
            String outOp = evalExprRhs(ctx.expr());
            regSymbolMap.clear();
            //ToDo add tuple support
            write(String.format("  ret i32 %s\n",outOp));

        } else if(ctx.bool_expr()!=null){
            stateForIf += 1;
            for(int i=0; i<ctx.bool_expr().size(); i++) {


                if(i>0){
                    write(String.format("if.else%d:\n",numif-1));
                }

                String regLeft = evalExprRhs(ctx.bool_expr(i).expr(0));
                String regRight = evalExprRhs(ctx.bool_expr(i).expr(1));
                String op = whichBoolOp(ctx.bool_expr(i));
                write(String.format("  %s = icmp %s i32 %s, %s\n","%cmp"+i,op,regLeft,regRight));
                write(String.format("  br i1 %s, label %s, label %s\n","%cmp"+numif,"%if.then"+numif,"%if.else"+numif));
                write(String.format("if.then%d: \n",i));
                numif += 1;

                enterStatement(ctx.statement(i));
                ctx.statement(i).removeLastChild();
                write("  br label %if.end\n");
            }

            if(ctx.KW_ELSE()!=null){
                write(String.format("if.else%d: \n",numif-1));
                enterStatement(ctx.statement(ctx.bool_expr().size()));
                write("  br label %if.end\n");
                write("if.end:\n");
                numif += 1;
                numVar += 1;
            }

        }
    }


    @Override public void enterFor_loop(lingBorParser.For_loopContext ctx) {

    }

    @Override public void exitFor_loop(lingBorParser.For_loopContext ctx) {

    }


}

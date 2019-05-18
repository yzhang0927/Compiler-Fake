package parser;

import com.ibm.icu.text.CaseMap;
import typenscope.Arr;
import typenscope.Func;
import typenscope.Intlit;
import typenscope.Symbol;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class lingCodeGenListener extends lingBorBaseListener {

    private static final String PATH_DIRECTORY = "src/main/java/codegen/";

    private static final String LL_FILE_TYPE = ".ll";

    private static final String FILE_HEADER = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\",align 1\n";

    private static final String MAIN_HEADER = "\ndefine i32 @main() #0 {\nentry:\n";

    private int IfReturned = 0;

    private int numArray = 0;
    private int numLoop = 0;
    private int numInterVar = 0;
    private int numPrintCall = 0;
    private int numCall = 0;
    private int numVar = 0;
    private int numOp = 0;
    private int numifLabel = 0;

    private int numArrayCopy;
    private int numLoopCopy;
    private int numInterVarCopy;
    private int numPrintCallCopy;
    private int numCallCopy;
    private int numVarCopy;
    private int numOpCopy;
    private int numIfLabelCopy;

    private int stateForFun = 0;
    private int stateForIf = 0;
    private Stack<String> curFuncForId = new Stack<>();
    private String curFuncInputId;
    private String curFuncText = "";
    private List<String> funcList = new LinkedList<>();

    private BufferedWriter writer;

    HashMap<String, Symbol> symbolMap;
    HashMap<String, Symbol> funcVarMap;
    HashMap<String, Func> funcMap;
    HashMap<String, String> regSymbolMap = new HashMap<>();

    public lingCodeGenListener(String inputFileName, HashMap<String, Symbol> symbolMap, HashMap<String, Func> funcMap) {
        String fileName = PATH_DIRECTORY + inputFileName + LL_FILE_TYPE;
        this.symbolMap = symbolMap;
        this.funcMap = funcMap;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }


    public String getTypeByName(String idName) {
        if (stateForFun == 0) {
            if(symbolMap.get(idName)==null)
                return "UNDEFINED";
            return symbolMap.get(idName).getType();
        } else {
            if(funcVarMap.get(idName)==null)
                return "UNDEFINED";
            return funcVarMap.get(idName).getType();
        }
    }

    public String getTargetName(String idName) {
        String ret = "!";
        if (stateForFun != 0) {
            if (idName.equals(curFuncInputId)) {
                ret = "%" + idName + ".addr";
            } else if (symbolMap.containsKey(idName)) {
                ret = "@" + idName;
            } else if (funcVarMap.containsKey(idName)) {
                ret = "%" + idName;
            }
        } else {
            if (symbolMap.containsKey(idName)) {
                ret = "@" + idName;
            } else {
                ret = "%" + idName;
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
            } catch (IOException ioe) {
                System.err.printf("error while printing %s%n", str);
                throw new RuntimeException(ioe);
            }
        }
    }

    @Override
    public void enterInput(lingBorParser.InputContext ctx) {
        write(FILE_HEADER);
        // declare all global var in advance just as Clang does
        // S\symbolMap contains all global Var
        for (String name : symbolMap.keySet()) {
            String varName = name;
            String varType = getTypeByName(name);
            switch (varType) {
                case "INT_LIT":
                    write(String.format("@%s = global i32 0, align 4\n", varName));
                    break;
                case "ARRAY":
                    allocateGlobalArray(varName, getArraySize(varName));
                    break;
                default:
                    System.out.println(Integer.parseInt(varType.split(",")[1]));
                    allocateGlobalArray(varName, Integer.parseInt(varType.split(",")[1]));
                    //only tuple will end up here, type checking has been performed,
                    //tuple type was in the form of "TUPLE,X"

            }
        }
        write(MAIN_HEADER);
    }

    /**
     * %a = alloca [10 x i32], align 16
     * @param arraySize
     */

    private void allocateLocalArray(String arrayName, int arraySize) {
        write(String.format("  %s = alloca [%d x i32], align 16\n", arrayName, arraySize));
    }

    // @b = common global [10 x i32] zeroinitializer, align 16, !dbg !6
    private void allocateGlobalArray(String arrayName, int arraySize) {
        String output = String.format("@%s = common global [%d x i32] zeroinitializer, align 16\n", arrayName, arraySize);
        write(output);
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
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
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
            opType = "mul nsw";
        } else if (ctx.OP_MINUS() != null) {
            opType = "sub nsw";
        } else if (ctx.OP_PLUS() != null) {
            opType = "add nsw";
        }
        String ret = "%op" + numOp;
        write(String.format("  %s = %s i32 %s, %s\n", ret, opType, l, r));
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
        if (ctx.OP_COMMA() != null) {
            return evalExprRhs(ctx.expr(0))+":"+evalExprRhs(ctx.expr(1));
            //It will give you a string 3:4:%varNum
            //a = 3,4,b
            //TODO Multi-element Tuple
        } else if (ctx.int_lit() != null) {
            return ctx.int_lit().INT_LIT().getSymbol().getText();
        } else if (ctx.id() != null) {
            String idName = ctx.id().ID().getSymbol().getText();
            //regSymbolMap, temp storage for
            if (!regSymbolMap.containsKey(idName)) {
                String regName = "%" + numVar;

                String targetName = getTargetName(idName);
                regSymbolMap.put(idName, regName);
                System.out.println(idName);
                String type = getTypeByName(idName);
                System.out.println(idName+":::"+type);

                if(type.split(",")[0].equals("TUPLE")) {

                } else {
                    //I remember that no assign to array is permitted
                    write(String.format("  %s = load i32, i32* %s, align 4\n", regName, targetName));
                    numVar += 1;
                }
                return regName;
            } else {
                return regSymbolMap.get(idName);
            }

        }  else if (ctx.func_call() != null) {
            // I am only considering integer, this need to be altered if you are using tuple as input parameter
            String inReg = evalExprRhs(ctx.func_call().expr());
            String funcName = ctx.func_call().id().ID().getSymbol().getText();
            String callName = "%call" + numCall;
            write(String.format("  %s = call i32 @%s(i32 %s)\n", callName, funcName, inReg));
            this.numCall = this.numCall + 1;
            return callName;

        } else if (ctx.array_ele() != null) {
            return evaluateArray(ctx.array_ele(),false);
        } else if (ctx.tuple_ele() != null) {
            //a = s.1, basically still a int
            return evaluateTuple(ctx.tuple_ele(),false);
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

    private String evaluateTuple(lingBorParser.Tuple_eleContext tuple_eleContext, boolean isLhs) {
        String tupleName = tuple_eleContext.id().ID().getText();
        int tupleSize = Integer.parseInt(getTypeByName(tupleName).split(",")[1]);
        String index = tuple_eleContext.int_lit().getText();
        int intIndex = Integer.parseInt(index);
        if (intIndex > tupleSize) {
            String errorMessage = String.format("tuple %s size %d index %s out of bound", tupleName, tupleSize, index);
            log("Runtime exception: " + errorMessage);
                return null;
        }

        String currArrIndex = "%arrayidx"+numArray++;
        write(String.format("  %s = getelementptr inbounds [%d x i32], [%d x i32]* %s, i64 0, i64 %s\n",
                currArrIndex,
                tupleSize,
                tupleSize,
                getTargetName(tupleName),
                index
        ));

        if(!isLhs) {
            String currRegister = "%" + numVar++;
            write(String.format("  %s = load i32, i32* %s\n", currRegister, currArrIndex));
            return currRegister;
        } else {
            return currArrIndex;
        }
    }

    private String evaluateArray(lingBorParser.Array_eleContext array_eleContext, boolean isLhs) {
        /**
         * array_ele : id LBRAK expr RBRAK;
         *
         * %0 = load i32, i32* getelementptr inbounds ([10 x i32], [10 x i32]* @b, i64 0, i64 1), align 4, !dbg !33
         *   store i32 %0, i32* %x, align 4, !dbg !32
         */

        String arrayName = array_eleContext.id().ID().getText();
        int arraySize = getArraySize(arrayName);
        String indexReg;
        //you will never know a[a[k]] has ever exceed its size before run time;
        if(array_eleContext.expr().int_lit()!=null) {
            indexReg= array_eleContext.expr().int_lit().getText();
            int intIndex = Integer.parseInt(indexReg);
            if (intIndex > arraySize) {
                String errorMessage = String.format("array %s size %d index %s out of bound", arrayName, arraySize, indexReg);
                log("Runtime exception: " + errorMessage);
                return null;
            }
        } else {
            String indexReg32 = evalExprRhs(array_eleContext.expr());
            indexReg = "%idxprom"+numArray;
            write(String.format("  %s = sext i32 %s to i64\n", indexReg,indexReg32));
        }
        String currArrIndex = "%arrayidx"+numArray++;
        write(String.format("  %s = getelementptr inbounds [%d x i32], [%d x i32]* %s, i64 0, i64 %s\n",
                currArrIndex,
                arraySize,
                arraySize,
                getTargetName(arrayName),
                indexReg
                ));

        if(!isLhs) {
            String currRegister = "%" + numVar++;
            write(String.format("  %s = load i32, i32* %s\n", currRegister, currArrIndex));
            return currRegister;
        } else {
            return currArrIndex;
        }
    }

    private String evalExprLhsItem(lingBorParser.Lhs_itemContext ctx){
        if (ctx.id() != null) {
            String idName = ctx.id().ID().getSymbol().getText();
            return getTargetName(idName);
        } else if (ctx.array_ele() != null) {
            return evaluateArray(ctx.array_ele(),true);
        } else if (ctx.tuple_ele() != null) {
            return evaluateTuple(ctx.tuple_ele(),true);
        }
        return "!";
    }
    private String evalExprLhs(lingBorParser.LhsContext ctx){
        int numItem = ctx.OP_COMMA().size()+1;
        if(numItem==1) {
            return evalExprLhsItem(ctx.lhs_item(0));
        } else {
            String regs = evalExprLhsItem(ctx.lhs_item(0));
            for (int i =1; i<numItem; i++){
                regs += ":"+evalExprLhsItem(ctx.lhs_item(i));
            }
            return regs;
        }
    }

    @Override
    public void enterDef(lingBorParser.DefContext ctx){
        stateForFun = 1;
        String funcName = ctx.id().ID().getSymbol().getText();
        String inputIdName = ctx.expr().id().ID().getSymbol().getText();
        curFuncInputId = inputIdName;
        funcVarMap = funcMap.get(funcName).getFuncVarMap();
        String type = funcMap.get(funcName).getInputType();
        System.out.println("entering func,input type: "+type);

        //TODO: now only support int_lit as input, need to support for tuple

        write(String.format("\ndefine i32 @%s(i32 %s) {\nentry:\n",funcName,"%"+inputIdName));
        write(String.format("  %s.addr = alloca i32, align 4\n","%"+inputIdName));
        write(String.format("  store i32 %s, i32* %s.addr, align 4\n","%"+inputIdName,"%"+inputIdName));

        for (String idName : funcVarMap.keySet()){
            if(idName.equals(inputIdName)||symbolMap.containsKey(idName)) {
                continue;
            }
            String varType = getTypeByName(idName);

            if (varType=="INT_LIT"){
                write(String.format("  %s = alloca i32, align 4\n","%"+idName));
            } else if(varType=="ARRAY"){
                int arraySize = getArraySize(idName);
                allocateLocalArray(getTargetName(idName), arraySize);
            } else {
                //tuple
                allocateLocalArray(getTargetName(idName), Integer.parseInt(varType.split(",")[1]));
            }
        }
        numArrayCopy = numArray;
        numInterVarCopy = numInterVar;
        numPrintCallCopy = numPrintCall;
        numCallCopy = numCall;
        numVarCopy = numVar;
        numOpCopy = numOp;
        numIfLabelCopy = numifLabel;

        numArray = 0;
        numInterVar = 0;
        numPrintCall = 0;
        numCall = 0;
        numOp = 0;
        numVar = 0;
        numifLabel = 0;
    }

   @Override
   public void exitDef(lingBorParser.DefContext ctx){
        write("  ret i32 0\n");
        write("}\n");

        funcList.add(curFuncText);
        curFuncText = "";

        stateForFun = 0;

        numArray = numArrayCopy;
        numInterVar = numInterVarCopy;
        numPrintCall = numPrintCallCopy;
        numCall = numCallCopy;
        numOp = numOpCopy;
        numVar = numVarCopy;
        numifLabel = numIfLabelCopy;
   }


   // Number is stored in here.

    @Override
    public void enterDecl(lingBorParser.DeclContext ctx) {
        //KW_GLOBAL id (ASSIGN expr)? SEMI
        if(ctx.KW_GLOBAL() != null) {
            String idName = ctx.id(0).ID().getSymbol().getText();
            if (ctx.ASSIGN() != null) {
                String outReg = evalExprRhs(ctx.expr(0));
                regSymbolMap.clear();

                String targetName = getTargetName(idName);
                if (getTypeByName(idName) == "INT_LIT") {
                    write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, targetName));
                } else if(getTypeByName(idName) == "ARRAY"){
                    //not gonna happen in any circumstances
                } else if(getTypeByName(idName).split(",")[0].equals("TUPLE")){
                    String lengthTuple = getTypeByName(idName).split(",")[1];
                    String[] regsLst = outReg.split(":");
                    for (int i =0;i<regsLst.length;i++){
                        write(String.format("  store i32 %s, i32* getelementptr inbounds ([%s x i32], [%s x i32]* %s, i64 0, i64 %d), align 16\n",
                                regsLst[i],
                                lengthTuple,
                                lengthTuple,
                                targetName,
                                i
                                ));
                    }
                }

            } else {
                if(getTypeByName(idName) == "ARRAY"){

                }
                // only when in func, you make global var inside as a local var
                // we can do nothing here since we can always get a global var with @reg

            }
        } else if (ctx.KW_LOCAL() != null){
            if (ctx.ASSIGN() != null) {
                String outReg = evalExprRhs(ctx.expr(0));
                regSymbolMap.clear();
                String idName = ctx.id(0).ID().getSymbol().getText();
                String targetName = getTargetName(idName);

                if (getTypeByName(idName) == "INT_LIT") {
                    write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, targetName));
                } else if(getTypeByName(idName).split(",")[0].equals("TUPLE")){
                    String lengthTuple = getTypeByName(idName).split(",")[1];
                    String[] regsLst = outReg.split(":");
                    for (int i =0;i<regsLst.length;i++){
                        write(String.format("  store i32 %s, i32* getelementptr inbounds ([%s x i32], [%s x i32]* %s, i64 0, i64 %d), align 16\n",
                                regsLst[i],
                                lengthTuple,
                                lengthTuple,
                                targetName,
                                i
                        ));
                    }
                }

            } else {

            }

        } else if (ctx.KW_ARRAY() != null) {
            if(ctx.ASSIGN()!=null) dealWithLoopAssign(ctx);
        }
    }

    private int getArraySize(String arrayName) {
        int arraySize = ((Arr) symbolMap.get(arrayName)).getSize();
//        log("getArraySize is " + arraySize);
        return arraySize;
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

    public void singleValueExchange(String regRight,String regLeft){

        String tempRegName =  "%tmp" + (numInterVar++);
        //load left expr into a reg
        write(String.format("  %s = alloca i32, align 4\n",tempRegName));
        String tempReg = "%"+ (numVar++);

        write(String.format("  %s = load i32, i32* %s\n",tempReg ,regRight));
        write(String.format("  store i32 %s, i32* %s, align 4\n", tempReg, tempRegName));

        tempReg = "%"+(numVar++);
        write(String.format("  %s = load i32, i32* %s\n",tempReg ,regLeft));
        write(String.format("  store i32 %s, i32* %s, align 4\n", tempReg, regRight));

        tempReg = "%"+(numVar++);
        write(String.format("  %s = load i32, i32* %s\n",tempReg ,tempRegName));
        write(String.format("  store i32 %s, i32* %s, align 4\n", tempReg, regLeft));

    }


    @Override
    public void enterStatement(lingBorParser.StatementContext ctx) {
        
        if(ctx.EXCHANGE()!=null) {
            // only element on both sides

            // store left reg content into temp var
            String regLeft = evalExprLhs(ctx.lhs(0));
            //write(String.format("  store i32 %s, i32* %s, align 4\n", regLeft, tempRegName));
            String regRight = evalExprLhs(ctx.lhs(1));
            //store right reg into left reg
            singleValueExchange(regLeft,regRight);

            /*
            //Todo we need to support multi lhs
            */

            /**
             * lhs_item :
             *     // variable
             *     id
             *     | tuple_ele  // tuple component reference
             *     | array_ele  ;
             */

        } else if(ctx.ASSIGN()!=null){

            String outReg = evalExprRhs(ctx.expr());
            regSymbolMap.clear();
            String inReg = evalExprLhs(ctx.lhs(0));

            if(outReg.split(":").length>1 && inReg.split(":").length==1) {
                String idName = ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText();
                int lengthTuple = Integer.parseInt(getTypeByName(idName).split(",")[1]);
                String targetName = getTargetName(idName);
                String[] regsLst = outReg.split(":");
                for (int i =0;i<regsLst.length;i++){
                    write(String.format("  store i32 %s, i32* getelementptr inbounds ([%s x i32], [%s x i32]* %s, i64 0, i64 %d), align 16\n",
                            regsLst[i],
                            lengthTuple,
                            lengthTuple,
                            targetName,
                            i
                    ));
                }
            } else if(outReg.split(":").length==1 && inReg.split(":").length>1) {
                String idName = ctx.expr().id().ID().getSymbol().getText();
                int lengthTuple = Integer.parseInt(getTypeByName(idName).split(",")[1]);
                String targetName = getTargetName(idName);
                String[] regsLst = inReg.split(":");
                for (int i =0;i<regsLst.length;i++) {
                    write(String.format("  %s = load i32, i32* getelementptr inbounds ([%d x i32], [%d x i32]* %s, i64 0, i64 %d), align 4\n",
                            "%"+numVar,
                            lengthTuple,
                            lengthTuple,
                            targetName,
                            i
                            ));
                    write(String.format("  store i32 %s, i32* %s, align 4\n","%"+numVar,regsLst[i]));
                    numVar++;
                }


            } else if(outReg.split(":").length>1 && inReg.split(":").length>1) {

            } else {
                write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, inReg));
            }

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

        } else if (ctx.RETURN() != null) {
            IfReturned=1;
            String outOp = evalExprRhs(ctx.expr());
            regSymbolMap.clear();
            write(String.format("  ret i32 %s\n",outOp));

        } else if (ctx.for_loop()!=null){
            String idName = ctx.for_loop().expr().id().ID().getSymbol().getText();
            curFuncForId.add(idName);
            if (ctx.for_loop().range()!= null) {
                String lowerBound = evalExprRhs(ctx.for_loop().range().expr(0));
                String upperBound = evalExprRhs(ctx.for_loop().range().expr(1));
                System.out.println(idName);
                String targetName = "%"+idName;

                write(String.format("  %s = alloca i32, align 4\n", targetName));
                write(String.format("  store i32 %s, i32* %s, align 4\n", lowerBound, targetName));
                write(String.format("  br label %s\n", "%for.cond" + numLoop));

                write(String.format("for.cond%d:\n", numLoop));
                write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));
                write(String.format("  %s = icmp slt i32 %s, %s\n", "%forcmp" + numLoop, "%" + numVar, upperBound));
                numVar += 1;
                write(String.format("  br i1 %s, label %s, label %s\n", "%forcmp" + numLoop, "%for.body" + numLoop, "%for.end" + numLoop));

                write(String.format("for.body%d:\n", numLoop));
                write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));
                numVar += 1;

                int numLoopCopy = numLoop;
                numLoop += 1;

                for (int i = 0; i < ctx.for_loop().statement().size(); ++i) {
                    enterStatement(ctx.for_loop().statement(i));
                }
                write(String.format("  br label %s\n", "%for.inc" + numLoopCopy));

                write(String.format("for.inc%d:\n", numLoopCopy));
                write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));
                write(String.format("  %s = add nsw i32 %s, 1\n", "%inc"+numLoopCopy, "%" + numVar));
                numVar += 1;
                write(String.format("  store i32 %s, i32* %s, align 4\n", "%inc"+numLoopCopy, targetName));
                write(String.format("  br label %s\n", "%for.cond" + numLoopCopy));
                write(String.format("for.end%d:\n", numLoopCopy));

            } else if (ctx.for_loop().array_id() != null) {

            }
            //popSymbolByName(idName);
            curFuncForId.remove(idName);
            ctx.removeLastChild();

        } else if (ctx.cond()!=null){

            String regLeft = evalExprRhs(ctx.cond().ifs().bool_expr().expr(0));
            String regRight = evalExprRhs(ctx.cond().ifs().bool_expr().expr(1));
            String op = whichBoolOp(ctx.cond().ifs().bool_expr());

            write(String.format("  %s = icmp %s i32 %s, %s\n","%ifcmp"+numifLabel,op,regLeft,regRight));
            write(String.format("  br i1 %s, label %s, label %s\n","%ifcmp"+numifLabel,"%if.then"+numifLabel,"%if.else"+numifLabel));
            write(String.format("if.then%d: \n",numifLabel));

            int numIfLabelCopy =numifLabel;
            numifLabel += 1;
            IfReturned = 0;

            for(int i = 0; i < ctx.cond().ifs().statement().size(); ++i) {
                enterStatement(ctx.cond().ifs().statement(i));
            }

            if(IfReturned==0) {
                write("  br label %if.end"+numIfLabelCopy+"\n");
            } else {
                IfReturned = 0;
            }

            exploreElsifs(ctx.cond().elsifs(),numIfLabelCopy);

            if(ctx.cond().elses()!=null){
                write(String.format("if.else%d: \n", numifLabel-1));

                for(int i = 0; i < ctx.cond().elses().statement().size(); ++i) {
                    enterStatement(ctx.cond().elses().statement(i));
                }

                if(IfReturned==0) {
                    write("  br label %if.end"+numIfLabelCopy+"\n");
                } else {
                    IfReturned = 0;
                }
            } else {
                write(String.format("if.else%d: \n", numifLabel-1));
                write("  br label %if.end"+numIfLabelCopy+"\n");
            }

            write(String.format("if.end"+numIfLabelCopy+":\n"));
            ctx.removeLastChild();
        }
    }

    private void exploreElsifs(lingBorParser.ElsifsContext ctx,int numIfLabelCopy){
        if (ctx!=null){

            write(String.format("if.else%d:\n",numIfLabelCopy));
            String regLeft = evalExprRhs(ctx.bool_expr().expr(0));
            String regRight = evalExprRhs(ctx.bool_expr().expr(1));
            String op = whichBoolOp(ctx.bool_expr());

            write(String.format("  %s = icmp %s i32 %s, %s\n","%cmp"+numifLabel,op,regLeft,regRight));
            write(String.format("  br i1 %s, label %s, label %s\n","%cmp"+numifLabel,"%if.then"+numifLabel,"%if.else"+numifLabel));
            write(String.format("if.then%d: \n",numifLabel));

            //Integer numIfLabelCopy1 =numifLabel;
            numifLabel += 1;
            IfReturned = 0;

            for(int i = 0; i < ctx.statement().size(); ++i) {
                enterStatement(ctx.statement(i));
            }
            if(IfReturned==0) {
                write("  br label %if.end"+numIfLabelCopy+"\n");
            } else {
                IfReturned = 0;
            }
            exploreElsifs(ctx.elsifs(),numIfLabelCopy);
        }
    }

    private void dealWithLoopAssign(lingBorParser.DeclContext ctx){

        String idNameArray = ctx.id(0).ID().getSymbol().getText();
        String idNameInput = ctx.id(1).ID().getSymbol().getText();
        int arraySize = getArraySize(idNameArray);

        String lowerBound = evalExprRhs(ctx.expr(0));
        String upperBound = evalExprRhs(ctx.expr(1));

        String targetName = getTargetName(idNameInput);

        write(String.format("  %s = alloca i32, align 4\n", targetName));
        write(String.format("  store i32 %s, i32* %s, align 4\n", lowerBound, targetName));
        write(String.format("  br label %s\n", "%for.cond" + numLoop));

        write(String.format("for.cond%d:\n", numLoop));
        write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));
        write(String.format("  %s = icmp slt i32 %s, %s\n", "%forcmp" + numLoop, "%" + numVar, upperBound));
        numVar += 1;
        write(String.format("  br i1 %s, label %s, label %s\n", "%forcmp" + numLoop, "%for.body" + numLoop, "%for.end" + numLoop));

        write(String.format("for.body%d:\n", numLoop));
        write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));


        numVar += 1;
        int numLoopCopy = numLoop;
        numLoop += 1;

        String indxReg = "%idxprom"+numArray;
        String arrayReg = "%arrayidx"+numArray++;

        String outReg = evalExprRhs(ctx.expr(2));
        write(String.format("  %s = sext i32 %s to i64\n", indxReg,"%"+numLoopCopy));

        write(String.format("  %s = getelementptr inbounds [%d x i32], [%d x i32]* %s, i64 0, i64 %s\n",
                arrayReg,
                arraySize,
                arraySize,
                getTargetName(idNameArray),
                indxReg));

        write(String.format("  store i32 %s, i32* %s, align 4\n", outReg, arrayReg));
        // tuple will not be allowed here anyway
        write(String.format("  br label %s\n", "%for.inc" + numLoopCopy));

        write(String.format("for.inc%d:\n", numLoopCopy));
        write(String.format("  %s = load i32, i32* %s, align 4\n", "%" + numVar, targetName));
        write(String.format("  %s = add nsw i32 %s, 1\n", "%inc"+numLoopCopy, "%" + numVar));
        numVar += 1;
        write(String.format("  store i32 %s, i32* %s, align 4\n", "%inc"+numLoopCopy, targetName));
        write(String.format("  br label %s\n", "%for.cond" + numLoopCopy));
        write(String.format("for.end%d:\n", numLoopCopy));

    }

    private void log(String string) {
        System.err.println(string);
    }

}

package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import typenscope.*;

import java.util.*;

public class lingListener extends lingBorBaseListener{

    private HashMap<String, Symbol> globalMap = new HashMap<>();
    private HashMap<String, Symbol> funcVarMap = new HashMap<>();
    private HashMap<String, Func> funcMap = new HashMap<>();

    private Stack<HashMap<String, Symbol>> localMapStack = new Stack<>();
    private Stack<HashMap<String,Symbol>> funcMapStack = new Stack<>();

    private int returnNum = -1;
    private int statusForLoop = 0;
    private int statusFunc = 0;

    private boolean isDefinedInFuncMap(String funcName){
        return funcMap.containsKey(funcName);
    }


    private boolean isDefinedInSymbolMap(String idName){
        if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
            if (localMapStack.peek().get(idName).isDefined()){ return true;}
        } else if (statusForLoop ==0 && statusFunc==0 && globalMap.containsKey(idName)){
            if (globalMap.get(idName).isDefined()){ return true;}
        } else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)) {
            if (funcVarMap.get(idName).isDefined()) { return true;}
        } else {
            if (funcVarMap.get(idName).isDefined()) {return true;}
        }
        return false;
    }

    public String typeOfSymbol(Symbol s) {
        if (s.getClass() == Intlit.class){
            return "INT_LIT";
        } else if (s.getClass() == Arr.class) {
            return "ARRAY";
        } else if (s.getClass() == Tuple.class) {
            return "TUPLE";
        } else {
            return "UNDEFINED";
        }
    }

    private String getType(String idName, HashMap<String, Symbol> symbolMap) {
        try {
            Symbol s = symbolMap.get(idName);
            return typeOfSymbol(s);
        } catch (NoSuchElementException en) {
            System.out.println(String.format("no such element:%s in the symbolmap", idName));
            return "UNDEFINED";
        }
    }

    private String getTypeByName(String idName) {
        if (statusForLoop == 0 && statusFunc == 0) {
            return getType(idName,globalMap);
        } else if (statusForLoop != 0 && statusFunc == 0 ) {
            return getType(idName,localMapStack.peek());
        } else if (statusForLoop == 0 && statusFunc!= 0 ) {
            return getType(idName, funcVarMap);
        } else{
            return getType(idName, funcVarMap);
        }
    }

    private Symbol getSymbolByName(String idName){
        if (statusForLoop == 0 && statusFunc == 0) {
            return globalMap.get(idName);
        } else if (statusForLoop != 0 && statusFunc == 0 ) {
            return localMapStack.peek().get(idName);
        } else if (statusForLoop == 0 && statusFunc!= 0 ) {
            return funcVarMap.get(idName);
        } else{
            return funcVarMap.get(idName);
        }
    }


    private int checkByContextTuple(lingBorParser.ExprContext ctx){
        if(ctx.OP_COMMA()==null){
            if (ctx.id()!=null &&!isDefinedInSymbolMap(ctx.id().ID().getSymbol().getText())) {
                System.out.println(String.format("Error,var:%s in Tuple is not defined",ctx.id().ID().getSymbol().getText()));
            } else if (ctx.array_ele()!=null){
                if(!isDefinedInSymbolMap(ctx.array_ele().id().ID().getSymbol().getText())){
                    System.out.println(String.format("Error, array var:%s is not defined",ctx.array_ele().id().ID().getSymbol().getText()));
                } else if(getTypeByName(ctx.array_ele().id().ID().getSymbol().getText())!="ARRAY"){
                    System.out.println(String.format("Error, array var:%s is not defined",ctx.array_ele().id().ID().getSymbol().getText()));
                }
            } else if (ctx.func_call()!=null) {
                if(!isDefinedInFuncMap(ctx.func_call().id().ID().getSymbol().getText())){
                    System.out.println(String.format("Error, func:%s is not defined",ctx.func_call().id().ID().getSymbol().getText()));
                }
            } else if (ctx.tuple_ele()!=null){
                if(!isDefinedInSymbolMap(ctx.tuple_ele().id().ID().getSymbol().getText())){
                    System.out.println(String.format("Error, tuple var:%s is not defined",ctx.tuple_ele().id().ID().getSymbol().getText()));
                } else if(getTypeByName(ctx.tuple_ele().id().ID().getSymbol().getText())!="TUPLE"){
                    System.out.println(String.format("Error, tuple var:%s is not defined",ctx.tuple_ele().id().ID().getSymbol().getText()));
                }
            }
            return 1;
        } else {
            return checkByContextTuple(ctx.expr(0))+checkByContextTuple(ctx.expr(1));
        }
    }

    private void checkByContextTupleEle(lingBorParser.Tuple_eleContext ctx) {
        if(ctx.id()!=null) {
            int line = ctx.id().ID().getSymbol().getLine();
            if (getTypeByName(ctx.id().ID().getSymbol().getText()) != "TUPLE") {
                System.out.println(String.format("ERROR! tuple var:%s on line %d is not defined", ctx.id().ID().getSymbol().getText(),line));

            } else if (Integer.parseInt(ctx.int_lit().INT_LIT().getSymbol().getText()) >
                    ((Tuple) getSymbolByName(ctx.id().ID().getSymbol().getText())).getLength()) {
                System.out.println(String.format("ERROR! tuple index exceeds the length of tuple:%s on line %d", ctx.id().ID().getSymbol().getText(),ctx.id().ID().getSymbol().getLine()));
            } else {

            }
        }

    }



    private void checkByContextArrayEle(lingBorParser.Array_eleContext ctx) {
        if(ctx.id()!=null) {
            if (getTypeByName(ctx.id().ID().getSymbol().getText()) != "ARRAY") {
                System.out.println(String.format("Error, array var%s is not defined", ctx.id().ID().getSymbol().getText()));
            }
        }

    }


    private void checkByContextFunction(lingBorParser.Func_callContext ctx) {
        if(ctx.id()!=null) {
            if(!isDefinedInFuncMap(ctx.id().ID().getSymbol().getText())) {
                System.out.println(String.format("Error, function %s is not defined", ctx.id().ID().getSymbol().getText()));
            } else {
                int lengthTuple = checkByContextTuple(ctx.expr());

            }

        }

    }

    public void CheckReturnDefStatement(lingBorParser.StatementContext ctx) {
        if (ctx.RETURN() != null) {
            if (this.returnNum == -1) {
                this.returnNum = checkByContextTuple(ctx.expr());
            } else if (this.returnNum != checkByContextTuple(ctx.expr())) {
                System.out.println(String.format("ERROR! Different numbers of return elements at line %d",
                        ctx.RETURN().getSymbol().getLine()));
            } else {// normal: equal number of return tuple size
            }
        } else {
            if (ctx.statement() != null) {
                List<lingBorParser.StatementContext> statementList = ctx.statement();
                int index = 0;
                while (index < ctx.statement().size()) {
                    CheckReturnDefStatement(statementList.get(index));
                    index += 1;
                }
            }
        }
    }

    @Override public void enterDef(lingBorParser.DefContext ctx) {

        if (this.funcMap.containsKey(ctx.id().ID().getSymbol().getText())) {
            if(ctx.body().statement()!=null){
                int index = 0;
                while(index<ctx.body().statement().size()){
                    CheckReturnDefStatement(ctx.body().statement().get(index));
                }
            } else {
                String idName = ctx.id().ID().getSymbol().getText();
                int line = ctx.id().ID().getSymbol().getLine();
                funcMap.put(idName,new Func(idName,line,this.returnNum));
            }
            this.statusFunc = 1;
        } else{
            System.out.println("this function name has been defined already.");
        }
    }

    @Override public void exitDef(lingBorParser.DefContext ctx) {
        this.returnNum = -1;
        this.statusFunc = 0;
    }


    private Symbol createByContext(String name, int line, String type) {
        if(type=="INT_LIT"){
            return new Intlit(name,line);
        } else if (type=="ARRAY"){
            return new Arr(name,line);
        } else if (type.split(",", 2)[0]=="TUPLE"){ ;
            return new Tuple(name,line,Integer.parseInt(type.split(",",2)[1]));
        } else {
            return new Symbol(name,line);
        }
    }

    private String inferenceByContext(lingBorParser.ExprContext ctx) {
        if (ctx.OP_COMMA() != null) {
            int numOfTuple = checkByContextTuple(ctx);
            return String.format("TUPLE,%d", numOfTuple);
        } else if (ctx.int_lit() != null) {
            return "INT_LIT";
        } else if (ctx.id() != null) {
            return getTypeByName(ctx.id().ID().getSymbol().getText());
        } else if (ctx.tuple_ele()!=null) {
            checkByContextTupleEle(ctx.tuple_ele());
            return "INT_LIT";
        } else if (ctx.array_ele()!=null) {
            checkByContextArrayEle(ctx.array_ele());
            return "INT_LIT";
        } else if (ctx.func_call()!=null){
            checkByContextArrayEle(ctx.array_ele());
            return "INT_LIT";
        } else if (ctx.OP_DIV()!=null || ctx.OP_MULT()!=null || ctx.OP_PLUS()!=null || ctx.OP_MINUS()!=null) {
            if(inferenceByContext(ctx.expr(0))=="INT_LIT" && inferenceByContext(ctx.expr(0))=="INT_LIT") {
                return "INT_LIT";
            }
        }
        return "UNDEFINED";

    }

    @Override public void enterDecl(lingBorParser.DeclContext ctx) {

        String idName;
        int line;

        //if first id exists. of course it exists
        if (ctx.id()!=null) {
            idName = ctx.id(0).ID().getSymbol().getText();
            line = ctx.id(0).ID().getSymbol().getLine();
        } else{
            System.out.println("error in declaration format");
            return;
        }

        // outside loop, outside function, only global allowed
        if (statusForLoop == 0 && statusFunc == 0) {
            if (ctx.KW_ARRAY()!=null){
                if(globalMap.containsKey(idName)&&!globalMap.get(idName).isDefined()){
                    globalMap.put(idName,new Arr(idName,line));
                    System.out.println(String.format("Success! The global array id:%s on %d has been defined",idName,line));
                } else{
                    System.out.println(String.format("ERROR! The global id:%s line %d has already been defined",idName,line));
                    return;
                }
                if(ctx.ASSIGN()!=null){
                   //ignore the initialization in array
                }
                return;
            }

            if (ctx.KW_LOCAL() != null) {
                System.out.println(String.format("ERROR! var:%s line %d, local only exists in code block and function",idName,line));
                return;

            } else if (ctx.KW_GLOBAL() != null) {
                if (globalMap.containsKey(idName)) {
                    System.out.println(String.format("ERROR! The global var:%s on line %d has been declared before", idName,line));
                    return;
                }

                if(ctx.ASSIGN()!=null){ //ASSIGN exists
                    System.out.println(String.format("Success! The global var:%s on line %d has been declared", idName,line));
                    globalMap.put(idName,createByContext(idName,line,inferenceByContext(ctx.expr(0))));
                } else {
                    globalMap.put(idName,new Symbol(idName,line));
                }
            }

            //	inside loop, outside function
        } else if (statusForLoop != 0 && statusFunc == 0 ) {
            // no declaration allowed here
            //	outside loop, inside function

        } else if (statusForLoop == 0 && statusFunc != 0 ) {
            // no function inside loop

        } else {

            //loop inside function
        }
    }




    @Override public void enterFor_loop(lingBorParser.For_loopContext ctx) {
        if(ctx.array_id()!=null){
            String idName = ctx.array_id().id().ID().getSymbol().getText();
            int line = ctx.array_id().id().ID().getSymbol().getLine();
            if(idName!="ARRAY"){
                System.out.println(String.format("ERROR, Here var:%s on line %d must be array",idName,line));
            }
        } else if (ctx.range()!=null){
            int line = ctx.range().OP_DOTDOT().getSymbol().getLine();
            if(inferenceByContext(ctx.range().expr(0))=="INT_LIT" && inferenceByContext(ctx.range().expr(1))=="INT_LIT"){

            }else{
                System.out.println(String.format("ERROR, var in range on line %d must be integr",line));
            }
        }

        if(ctx.expr().id()!= null) {
            String idName = ctx.expr().id().ID().getSymbol().getText();
            int idLine = ctx.expr().id().ID().getSymbol().getLine();
            Symbol idSymbol = new Symbol();
            idSymbol.setNameAndLine(idName,idLine);
            HashMap<String,Symbol> tmp = new HashMap<>();
            if(this.statusForLoop==0) {
                tmp.putAll(globalMap);
            } else {
                tmp.putAll(localMapStack.peek());
            }
            tmp.put(idName,idSymbol);
            localMapStack.push(tmp);
            this.statusForLoop += 1;

        } else {
            System.out.println("illegal expr found as foreach index var, id only!");
        }

    }

    @Override public void exitFor_loop(lingBorParser.For_loopContext ctx) {
        this.statusForLoop -= 1;
        localMapStack.pop();
    }

    @Override public void enterWhile_loop(lingBorParser.While_loopContext ctx) {
        HashMap<String,Symbol> tmp = new HashMap<>();
        if(this.statusForLoop==0) {
            tmp.putAll(globalMap);
        } else {
            tmp.putAll(localMapStack.peek());
        }
        localMapStack.push(tmp);
        this.statusForLoop += 1;
    }

    @Override public void exitWhile_loop(lingBorParser.While_loopContext ctx) {
        this.statusForLoop -= 1;
        localMapStack.pop();
    }


    @Override public void enterStatement(lingBorParser.StatementContext ctx) {
        String idName;

        if (statusForLoop == 0 && statusFunc == 0) {
            

            /*
            if (ctx.EXCHANGE()!=null){
                if(ctx.lhs(0)!=null && ctx.lhs(1)!=null){
                    //this.IsSameCategory(ctx.lhs(0).lhs_item(0),ctx.lhs(1).lhs_item(0));
                }
            } else if (ctx.ASSIGN()!=null&&ctx.lhs(0)!=null) {
                String idNameLeft = ctx.lhs(0).lhs_item(0).id().ID().getSymbol().getText();
                String typeLeft = this.getType(idNameLeft);
                if (typeLeft == "-1") {
                    System.out.println("lefthand item not defined");
                    //return;
                } else if (ctx.expr().id() != null) {
                    String idNameRight = this.getType(ctx.expr().id().ID().getSymbol().getText());
                    String typeRight = this.getType(idNameRight);
                    if (typeRight == "-1") {
                        System.out.println("righthand item not defined");
                    } else {

                    }
                }
            } else {
                System.out.println("error"); // not gonna happen
            }
            */
        } else if (statusForLoop != 0 && statusFunc == 0 ) {

        } else if (statusForLoop == 0 && statusFunc!= 0 ) {

        } else {

        }

    }

    @Override public void exitStatement(lingBorParser.StatementContext ctx) { }

    @Override public void exitBool_expr(lingBorParser.Bool_exprContext ctx) {
        if (ctx.expr()!=null){
            if (inferenceByContext(ctx.expr(0))=="INT_LIT" && inferenceByContext(ctx.expr(1))=="INT_LIT") {
            } else {
                System.out.println("ERROR! bool op only support INT_LIT instead of "+
                        inferenceByContext(ctx.expr(0))+" and "+ inferenceByContext(ctx.expr(1)));
            }
        }
    }

    @Override public void enterExpr(lingBorParser.ExprContext ctx) {
        // Once we find a expr during traversal sub tree of expr, we have to make sure it is defined beforehand

        if(ctx.id()!=null){
            String idName = ctx.id().ID().getSymbol().getText();
            int line  = ctx.id().ID().getSymbol().getLine();

            /*
            if(!isInSymbolMap(idName)){
                System.out.println(String.format("ID: %s used without declaration",idName));
            } else if(!isDefinedInSymbolMap(idName)){
                System.out.println(String.format("ID: %s used without initilization",idName));
            }
            */

        }
    }

    @Override public void exitExpr(lingBorParser.ExprContext ctx) { }

}

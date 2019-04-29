package parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import typenscope.Arr;
import typenscope.Intlit;
import typenscope.Symbol;
import typenscope.Tuple;

import java.util.*;

public class lingListener extends lingBorBaseListener{
    private HashMap<String, Symbol> globalMap = new HashMap<>();
    private HashMap<String, Symbol> funcVarMap = new HashMap<>();
    private HashMap<String, Symbol> funcMap = new HashMap<>();

    private Stack<HashMap<String, Symbol>> localMapStack = new Stack<>();
    private Stack<HashMap<String,Symbol>> funcMapStack = new Stack<>();
    private Stack<String> NonTouchableFor = new Stack<>();

    private int statusForLoop = 0;
    private int statusFunc = 0;

    private boolean isInSymbolMap(String idName){
        if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
            return true;
        } else if (statusForLoop == 0 && statusFunc==0 && globalMap.containsKey(idName)){
            return true;
        } else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)){
            return true;
        } else {//loop inside a function
            if(funcMapStack.peek().containsKey(idName)){
                return true;
            }
            return false;
        }
    }

    private boolean isDefinedInSymbolMap(String idName){
        if(statusForLoop!=0 && statusFunc==0 && localMapStack.peek().containsKey(idName)){
            if (localMapStack.peek().get(idName).isDefined()){ return true;}
        } else if (statusForLoop ==0 && statusFunc==0 && globalMap.containsKey(idName)){
            if (globalMap.get(idName).isDefined()){ return true;}
        } else if (statusFunc != 0 && statusForLoop ==0 && funcVarMap.containsKey(idName)) {
            if (funcVarMap.get(idName).isDefined()) { return true; }
        } else {
            if (funcMapStack.peek().get(idName).isDefined()) {return true;}
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
            return "-1";
        }
    }

    private String getType(String idName) {
        if (statusForLoop == 0 && statusFunc == 0) {
            return getType(idName,globalMap);
        } else if (statusForLoop != 0 && statusFunc == 0 ) {
            return getType(idName,localMapStack.peek());
        } else if (statusForLoop == 0 && statusFunc!= 0 ) {
            return getType(idName, funcVarMap);
        } else{
            return getType(idName, funcMapStack.peek());
        }
    }

    private boolean isSameType(String idName1,String idName2){
        return getType(idName1)==getType(idName2);
    }

    private Symbol getSymbolByName(String idName){
        if (statusForLoop == 0 && statusFunc == 0) {
            return globalMap.get(idName);
        } else if (statusForLoop != 0 && statusFunc == 0 ) {
            return localMapStack.peek().get(idName);
        } else if (statusForLoop == 0 && statusFunc!= 0 ) {
            return funcVarMap.get(idName);
        } else {
            return funcMapStack.peek().get(idName);
        }
    }

    private String inferenceByContext(lingBorParser.ExprContext ctx){
        if(ctx.OP_COMMA()!=null){
            return "TUPLE";
        } else if (ctx.int_lit()!=null){
            return "INT_LIT";
        } else if (ctx.id()!=null){

        }
    }



    @Override public void enterDecl(lingBorParser.DeclContext ctx) {

        String idName;
        int line;
        boolean isLegalDcrl = false;

        //if first id exists. //
        if (ctx.id()!=null) {
            idName = ctx.id(0).ID().getSymbol().getText();
            line = ctx.id(0).ID().getSymbol().getLine();
        } else{
            System.out.println("error in declaration format");
            return;
        }

        // outside loop, outside function, only global allowed
        if (statusForLoop == 0 && statusFunc == 0) {
            if (ctx.KW_LOCAL() != null) {
                System.out.println("local only exists in code block and function, it is not support here");
            } else if (ctx.KW_GLOBAL() != null) {
                if (globalMap.containsKey(idName)) {
                    System.out.println(String.format("The global var:%s has been declared before", idName));
                    return;
                }
                if(ctx.ASSIGN()!=null && ctx.expr()!=null){ //ASSIGN exists
                    if(ctx.expr()!=null){
                        //inferenceByContext =
                    }

                } else {
                    globalMap.put(idName, new Symbol(false, idName, line));
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


    @Override public void exitDecl(lingBorParser.DeclContext ctx) {

    }


    @Override public void enterDef(lingBorParser.DefContext ctx) {
        if (this.funcMap.containsKey(ctx.id(0))) {
            this.statusFunc = 1;
        } else{
            System.out.println("this function name has been defined already.");
        }
    }

    @Override public void exitDef(lingBorParser.DefContext ctx) {
        this.statusFunc = 0;
    }


    @Override public void enterFor_loop(lingBorParser.For_loopContext ctx) {

        if(ctx.expr().id()!= null) {
            String idForIndexName = ctx.expr().id().ID().getSymbol().getText();
            int idForIndexLine = ctx.expr().id().ID().getSymbol().getLine();
            Symbol idForIndexSymbol = new Symbol(true,idForIndexName,idForIndexLine);
            HashMap<String,Symbol> tmp = new HashMap<>();
            if(this.statusForLoop==0) {
                tmp.putAll(globalMap);
            } else {
                tmp.putAll(localMapStack.peek());
            }
            tmp.put(idForIndexName,idForIndexSymbol);
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

        } else if (statusForLoop != 0 && statusFunc == 0 ) {

        } else if (statusForLoop == 0 && statusFunc!= 0 ) {

        } else {

        }

    }


    @Override public void exitStatement(lingBorParser.StatementContext ctx) {

    }


    @Override public void enterExpr(lingBorParser.ExprContext ctx) {
        // Once we find a expr during traversal sub tree of expr, we have to make sure it is defined beforehand
        if(ctx.id()!=null){
            String idName = ctx.id().ID().getSymbol().getText();
            if(!isInSymbolMap(idName)){
                System.out.println(String.format("ID: %s used without declaration",idName));
            } else if(!isDefinedInSymbolMap(idName)){
                System.out.println(String.format("ID: %s used without initilization",idName));
            }
        } else if (){

        }
    }



    @Override public void exitExpr(lingBorParser.ExprContext ctx) { }



}

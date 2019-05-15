package parser;

import typenscope.Arr;
import typenscope.Intlit;
import typenscope.Symbol;

import java.util.HashMap;

public class ArrayDeclarationListener extends lingBorBaseListener {

    HashMap<String, Symbol> symbolMap;

    public ArrayDeclarationListener(HashMap<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }


    @Override public void enterDecl(lingBorParser.DeclContext ctx) {
        //KW_GLOBAL id (ASSIGN expr)? SEMI
        if (ctx.KW_ARRAY() != null) {
//            System.err.printf("~~~~~~~~~~~~~~~~~\nhit array declaration\n");
            handleArrayDeclaration(ctx);
        }
    }

    /**
     *
     * current implementation assumes the left bound to be 0;
     *
     *
     *
     * decl : KW_ARRAY id LBRAK expr OP_DOTDOT expr RBRAK ( id ASSIGN expr )? SEMI
     * the implementation disregards "( id ASSIGN expr )?"
     * expr:
     *     // *ascending* order of precedence: from least important to most important
     *      // tuple constuctor
     *
     *      expr ( OP_MULT | OP_DIV)  expr
     *     | expr ( OP_PLUS | OP_MINUS) expr
     *     | expr OP_COMMA expr
     *     // there is no more unary minus!!
     *     |  LPAR expr RPAR
     *     |  id
     *     |  int_lit
     *     |  func_call // function call, right-associative
     *     |  tuple_ele //tuple reference
     *     |  array_ele // array element reference
     *
     *  FIRST, only deal with int-lit here, move the next part to the next phase.
     */

    private void handleArrayDeclaration(lingBorParser.DeclContext context) {
//        log("context: " + context.toString());
        String currArrayName = context.id(0).ID().getSymbol().getText();
        Symbol currSymbol = symbolMap.get(currArrayName);
//        log("current array name is " + currArrayName);
        lingBorParser.ExprContext leftBound = context.expr(0);
        lingBorParser.ExprContext rightBound =  context.expr(1);

        int arraySize = checkArrayBounds(leftBound, rightBound);

//        log("symbol is " + currSymbol.toString());

//        log("arraysize is " + arraySize);

        symbolMap.replace(currArrayName, new Arr(currSymbol.getName(), currSymbol.getLine(), arraySize));

//        log("getArraySize is " + ((Arr) symbolMap.get(currArrayName)).getSize());
    }

    /**
     *
     * @param leftBound
     * @param rightBound
     * @return the size of the array
     */
    private int checkArrayBounds(lingBorParser.ExprContext leftBound, lingBorParser.ExprContext rightBound) {

        int intLeftBound = checkLeftBound(leftBound);

        if (rightBound.id() != null) {

            // Cannot quite handle id bound at the moment, need some extra work.

            String idName = rightBound.id().ID().getText();

//            log("name of the right side bound is " + idName);

            if ("INT_LIT".equals(symbolMap.get(idName).getType())) {
//                log("founds an int literal bound");
                Intlit intLitRightBound = (Intlit) symbolMap.get(idName);
//                log("int value is " + intLitRightBound.getVal());
            } else {
                log("Error! array bounds have to be integer");
            }
        } else if (rightBound.int_lit() != null) {
            int intRightBound = Integer.parseInt(rightBound.int_lit().getText());
//            log("right bound is " + intRightBound);

            // Now I have both bounds, I can compute the size
            return intRightBound - intLeftBound + 1;
        }
        return 0;
    }

    private int checkLeftBound(lingBorParser.ExprContext leftBound) {
        if (leftBound.id() == null && leftBound.int_lit() == null) {
            log("error with array bound!");
        }
        if (leftBound.id() != null) {
            /**
             * TODO
             * cannot check id now, need to do this in codeGenListener
             */

        } else if (leftBound.int_lit() != null) {
            int intLeftBound = Integer.parseInt(leftBound.int_lit().getText());
            if (intLeftBound != 1) {
                log("Invalid left bound of array");
            }
        }
        return 1;
    }

    private void log(String string) {
        System.err.println(string);
    }
}

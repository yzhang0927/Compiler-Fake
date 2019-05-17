package parser;

import typenscope.Arr;
import typenscope.Intlit;
import typenscope.Symbol;

import java.util.HashMap;

public class ArrayDeclarationListener extends lingBorBaseListener {

    private final HashMap<String, Symbol> symbolMap;

    public ArrayDeclarationListener(HashMap<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }

    @Override
    public void enterDecl(lingBorParser.DeclContext ctx) {
        if (ctx.KW_ARRAY() != null) {
            handleArrayDeclaration(ctx);
        }
    }

    private void handleArrayDeclaration(lingBorParser.DeclContext context) {
        String currArrayName = context.id(0).ID().getSymbol().getText();
        Symbol currSymbol = symbolMap.get(currArrayName);
        lingBorParser.ExprContext leftBound = context.expr(0);
        lingBorParser.ExprContext rightBound =  context.expr(1);
        int arraySize = checkArrayBounds(leftBound, rightBound);
        symbolMap.replace(currArrayName, new Arr(currSymbol.getName(), currSymbol.getLine(), arraySize));
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
            // TODO: Cannot quite handle id bound at the moment, need some extra work.
            String idName = rightBound.id().ID().getText();
            if ("INT_LIT".equals(symbolMap.get(idName).getType())) {
                Intlit intLitRightBound = (Intlit) symbolMap.get(idName);
            } else {
                log("Error! array bounds have to be integer");
            }
        } else if (rightBound.int_lit() != null) {
            int intRightBound = Integer.parseInt(rightBound.int_lit().getText());
            return intRightBound - intLeftBound + 1;
        }
        return 0;
    }

    private int checkLeftBound(lingBorParser.ExprContext leftBound) {
        if (leftBound.id() == null && leftBound.int_lit() == null) {
            log("error with array bound!");
        }
        if (leftBound.id() != null) {
            // TODO: cannot check id now, need to do this in codeGenListener
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

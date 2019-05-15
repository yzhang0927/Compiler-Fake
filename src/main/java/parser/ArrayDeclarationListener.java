package parser;

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
            System.err.printf("hit array declaration\n");
            handleArrayDeclaration(ctx);
        }
    }

    // decl : KW_ARRAY id LBRAK expr OP_DOTDOT expr RBRAK ( id ASSIGN expr )? SEMI
    // the implementation disregards "( id ASSIGN expr )?"
    private void handleArrayDeclaration(lingBorParser.DeclContext context) {
        log(context.toString());
        String currArrayName = context.id(0).ID().getSymbol().getText();
        Symbol currSymbol = symbolMap.get(currArrayName);
        log(currArrayName);
        lingBorParser.ExprContext exprContext =  context.expr(1);

        checkArrayBounds(exprContext);

        log(currSymbol.toString());
    }

    private void checkArrayBounds(lingBorParser.ExprContext exprContext) {
        if (exprContext.id() != null) {
            String idName = exprContext.id().ID().getText();
            if ("INT_LIT".equals(symbolMap.get(idName).getType())) {
//                symbolMap.get(idName).
            } else {
                System.err.println("Error! array bounds have to be integer");
            }
        }
    }

    private void log(String string) {
        System.err.println(string);
    }
}

package parser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

public class lingScannerParserCheckListener extends lingBorBaseListener {


    //public ReplaceExpr(CommonTokenStream tokens) {
    //    rewriter = new TokenStreamRewriter(tokens);
    //}

    @Override public void enterInt_lit(lingBorParser.Int_litContext ctx) {
        try {
            Integer.parseInt(ctx.INT_LIT().getSymbol().getText());

        } catch (NumberFormatException exp) {
            System.err.println("Scanner error! Integer too large");
            ctx.removeLastChild();

        }
    }

    @Override public void exitInt_lit(lingBorParser.Int_litContext ctx) { }

    @Override public void enterId(lingBorParser.IdContext ctx) { }

    @Override public void exitId(lingBorParser.IdContext ctx) { }

}

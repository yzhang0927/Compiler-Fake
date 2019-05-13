package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
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
            ctx.addChild(new TerminalNode() {
                @Override
                public Token getSymbol() {
                    return null;
                }

                @Override
                public ParseTree getParent() {
                    return null;
                }

                @Override
                public ParseTree getChild(int i) {
                    return null;
                }

                @Override
                public void setParent(RuleContext ruleContext) {

                }

                @Override
                public <T> T accept(ParseTreeVisitor<? extends T> parseTreeVisitor) {
                    return null;
                }

                @Override
                public String getText() {
                    return null;
                }

                @Override
                public String toStringTree(Parser parser) {
                    return null;
                }

                @Override
                public Interval getSourceInterval() {
                    return null;
                }

                @Override
                public Object getPayload() {
                    return null;
                }

                @Override
                public int getChildCount() {
                    return 0;
                }

                @Override
                public String toStringTree() {
                    return null;
                }
            });
        }
    }

    @Override public void exitInt_lit(lingBorParser.Int_litContext ctx) { }

    @Override public void enterId(lingBorParser.IdContext ctx) {
        // Place holder
        try {
            String id = ctx.ID().getSymbol().getText();
            //if(id.contains())

        } catch (NumberFormatException exp) {
            System.err.println("Scanner error! Integer too large");
            ctx.removeLastChild();
        }


    }

    @Override public void exitId(lingBorParser.IdContext ctx) { }

}

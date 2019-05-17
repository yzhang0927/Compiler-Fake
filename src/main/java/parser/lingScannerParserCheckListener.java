package parser;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lingScannerParserCheckListener extends lingBorBaseListener {

    //public ReplaceExpr(CommonTokenStream tokens) {
    //    rewriter = new TokenStreamRewriter(tokens);
    //}

    private boolean isError =false;

    public boolean hasError() {
        return isError;
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        isError = true;
    }

    @Override
    public void enterInt_lit(lingBorParser.Int_litContext ctx) {
        try {
            Integer.parseInt(ctx.INT_LIT().getSymbol().getText());
        } catch (NumberFormatException exp) {
            System.err.println("Warning ! Scanner error! Integer too large. Replaced with -1");
            CommonToken ct = new CommonToken((Token)ctx.getChild(0).getPayload());
            ct.setText("-1");
            ctx.removeLastChild();
            ctx.addChild(ct);
            System.out.println(ctx.INT_LIT().getSymbol().getText());
        }
    }

    @Override
    public void enterId(lingBorParser.IdContext ctx) {
        String id = ctx.ID().getSymbol().getText();
        String patternString = "^[a-zA-Z_]{1,80}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(id);

        if (!matcher.matches()){
            System.out.println("Warning ! Your id is too long, truncated to 80 bit.");
            id = id.substring(0, Math.min(id.length(), 80));
            CommonToken ct = new CommonToken((Token)ctx.getChild(0).getPayload());
            ct.setText(id);
            ctx.removeLastChild();
            ctx.addChild(ct);
            System.out.println(ctx.ID().getSymbol().getText());
        }

    }

    @Override
    public void exitId(lingBorParser.IdContext ctx) {
    }



}

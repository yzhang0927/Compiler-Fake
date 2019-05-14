package parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class lingCodeGenListener extends lingBorBaseListener {
    private String fileName = "src/main/java/codegen/output.ll";
    private int numPrintCall = 0;
    private int numCall = 0;
    private BufferedWriter writer;
    @Override
    public void enterInput(lingBorParser.InputContext ctx) {
        try {
            String header = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", "+
                    "align 1\ndefine i32 @main() #0 {\nentry:\n";
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(header);


            System.out.println("SUCCESS ! codegen created out file: " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR ! codegen cannot create out file: " + e);
        }
    }

    @Override
    public void exitInput(lingBorParser.InputContext ctx) {
        try {
            writer.write("ret i32 0\n}\n");
            if (numPrintCall>0){
                writer.write("declare i32 @printf(i8*, ...)\n");
            }
            writer.close();
        } catch (IOException e){

        }
    }

    private int evalExpr(lingBorParser.ExprContext ctx){
        if(ctx.int_lit()!=null){
            return Integer.parseInt(ctx.int_lit().INT_LIT().getSymbol().getText());
        }else if(ctx.id()!=null){

        }
        return 0;
    }


    @Override public void enterStatement(lingBorParser.StatementContext ctx) {
        if(ctx.ASSIGN()!=null){

        }

        if(ctx.PRINT()!=null){
            numPrintCall += 1;
            String outFunc = String.format("%call%d = call i32 (i8*, ...)"+
                    " @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0),"+
                    "i32 ",numCall);

            if (ctx.expr()!=null){
               int num = evalExpr(ctx.expr());

            }

        }
    }

}

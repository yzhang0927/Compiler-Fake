package parser;

import typenscope.Func;
import typenscope.Symbol;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class lingCodeGenListener extends lingBorBaseListener {
    private String fileName = "src/main/java/codegen/output.ll";
    private int numPrintCall = 0;
    private int numCall = 0;
    private BufferedWriter writer;

    HashMap<String, Symbol> symbolMap;
    HashMap<String, Func> funcMap;

    public void importMaps(HashMap<String, Symbol> symbolMap, HashMap<String, Func> funcMap){
        this.symbolMap = symbolMap;
        this.funcMap = funcMap;
    }

    @Override
    public void enterInput(lingBorParser.InputContext ctx) {
        try {
            String header = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", "+
                    "align 1\ndefine i32 @main() #0 {\nentry:\n";
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(header);

            // declare all global var in advance

            System.out.println("SUCCESS ! codegen created output file: " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR ! codegen cannot create output file: " + e);
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
            System.out.println("ERROR ! codegen cannot close output file: " + e);
        }
    }


    private int whichArithmaticOp(lingBorParser.ExprContext ctx,int left,int right){
        if(ctx.OP_DIV()!=null){
            return left/right;
        } else if (ctx.OP_MULT()!=null){
            return left*right;
        } else if (ctx.OP_MINUS()!=null){
            return left-right;
        } else if (ctx.OP_PLUS()!=null){
            return left+right;
        }
        return Integer.MIN_VALUE;
    }

    // if it's only arithmatic op between int_lit, get the answer, otherwise (id involved)
    // we may need to generate code on the run.
    private int evalExpr(lingBorParser.ExprContext ctx){
        if(ctx.int_lit() != null){
            return Integer.parseInt(ctx.int_lit().INT_LIT().getSymbol().getText());
        } else if(ctx.id() != null){

            //action tbi
        } else if(ctx.OP_COMMA() != null){

        } else if(ctx.func_call() != null){

        } else if(ctx.array_ele() != null){

        } else if(ctx.tuple_ele() != null){

        } else if(ctx.LPAR()!= null){
            // it means it is in the form of LPAR expr RPAR
            return evalExpr(ctx.expr(0));

        } else if(ctx.OP_PLUS() != null || ctx.OP_MINUS() != null
                || ctx.OP_MULT() != null ||ctx.OP_DIV() != null){
            //we can do this since the tree structure already put */ in the lower tree
            int left = evalExpr(ctx.expr(0));
            int right = evalExpr(ctx.expr(1));
            if (left!=Integer.MIN_VALUE && right!=Integer.MIN_VALUE){
                return whichArithmaticOp(ctx,left,right);
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override public void enterDecl(lingBorParser.DeclContext ctx) {
        //KW_GLOBAL id (ASSIGN expr)? SEMI
        if(ctx.KW_GLOBAL() != null){
            if(ctx.ASSIGN() != null) {
                // read from symbol table.
              evalExpr(ctx.expr(0));
            }
        }

    }

    @Override public void enterStatement(lingBorParser.StatementContext ctx) {
        if(ctx.ASSIGN()!=null){

        }

        if(ctx.PRINT()!=null){

            String outFunc = "%"+String.format("call%d = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 ",numCall);
            int num = evalExpr(ctx.expr());
            if (num == Integer.MIN_VALUE){

            } else {
                outFunc = outFunc + String.valueOf(num)+")\n";
            }

            numPrintCall += 1;
            numCall += 1;
            try {
                writer.write(outFunc);
            } catch (IOException e){
                System.out.println("ERROR ! codegen cannot create output file: " + e);
            }
        }
    }

}

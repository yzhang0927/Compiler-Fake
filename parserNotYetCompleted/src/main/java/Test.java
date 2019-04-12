import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


// You're going to need to implement these based on the grammar you've created


public class Test {
    public static void main(String[] args) {
        String addr = "testcases/p2test0.out2";
        //File file = new File(fileName);
        FileInputStream fis = null;

        try {
            // Open the input file stream
            fis = new FileInputStream(addr);
            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);
            // Create a lexer that feeds off of input CharStream
            TestLexer lexer = new TestLexer(input);
            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser that feeds off the tokens buffer
            TestParser parser = new TestParser(tokens);
            // Begin parsing at rule prog
            ParseTree tree = parser.input();
            // Close the input file
            fis.close();
            // Close the input file
            System.out.println(tree.toStringTree(parser));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

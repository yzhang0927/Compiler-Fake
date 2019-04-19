import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.lingBorLexer;
import parser.lingBorParser;
import scanner.*;
import static scanner.TestCompiler.testOneCase;

public class Test {

    public static void main(String[] args) {
        String addr = "testcases/p2test3";
        FakeCompilerScanner testScanner;
        testScanner = new FakeCompilerScanner(addr);
        testOneCase(testScanner);
        try {
            // Create a CharStream that reads from standard input
            CharStream input = CharStreams.fromFileName(addr+".out2");
            // Create a lexer that feeds off of input CharStream
            lingBorLexer lexer = new lingBorLexer(input);
            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser that feeds off the tokens buffer
            lingBorParser parser = new lingBorParser(tokens);
            // Begin parsing at rule prog
            ParseTree tree = parser.input();
            System.out.println(tree.toStringTree(parser));

            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            viewr.setScale(0.9);//scale a little
            panel.add(viewr);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(2000,1000);
            frame.setVisible(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

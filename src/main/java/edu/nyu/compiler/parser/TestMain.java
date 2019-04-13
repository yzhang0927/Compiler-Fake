package edu.nyu.compiler.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;

import javax.swing.*;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import edu.nyu.compiler.scanner.FakeCompilerScanner;
import edu.nyu.compiler.scanner.TestCompiler;

public class TestMain {
    private static final String TESTCASE_DIR = "testcases/p1test";
    private static final String TESTCASE_P2_DIR = "testcases/p2test";
    private static final int TESTCASE_FIRST = 1;
    private static final int TESTCASE_LAST = 5;
    private static final int TESTCASE_P2_LAST = 6;
    private static FakeCompilerScanner testScanner;

//    private static final String SCANNER_OUT_ADDR = "testcases/p1test";
    private static final String SCANNER_OUT2 = ".out2";


    public static void main(String[] args) {
        String[] arguments = new String[]{"txt"};
        TestCompiler.main(arguments);

        for (int i = TESTCASE_FIRST; i <= TESTCASE_LAST; ++i) {
            String effectiveAddr = TESTCASE_P2_DIR + i + SCANNER_OUT2;
            parseFile(effectiveAddr);
        }

    }

    private static void parseFile(String addr) {
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
            System.out.print(OutputParser.parse(tree.toStringTree(parser)));

            //show AST in GUI
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();

            TreeViewer viewr = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            viewr.setScale(1.5);//scale a little
            panel.add(viewr);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200,200);
            frame.setVisible(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

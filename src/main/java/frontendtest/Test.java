package frontendtest;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.*;
import typenscope.Func;
import typenscope.Symbol;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

    private static final String LINE_SEPARATION = "~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

    private static final String CODE_GEN_TEST_PHASE = "p4test";

    private static final String TXT_EXTENSION = ".txt";

    private static final String TESTCASE_PATH = "testcases/";

    private static final String EXTERNAL_TEST_CASE_PATH = TESTCASE_PATH + "code_gen_sample";

    private static final String EXTERNAL_TEST_CASE_FILE_EXTENSION = ".boris";

    private static final int P4_TESTCASE_SIZE = 5;

    private static final ArrayList<String> TESTCASES = new ArrayList<String>() {{
        add("assign");
        add("calc");
        add("funs");
        add("loops");
    }};

    public static void main(String[] args) {
        if (false) {
            runAllTestCases();
            runExternalTestCases();
        }

        int currentTestingIndex = 5;
        runOneTestCaseWithIndex(currentTestingIndex);
    }

    private static void runAllTestCases() {
        for (int i = 1; i <= P4_TESTCASE_SIZE; ++i) {
            runOneTestCaseWithIndex(i);
        }
    }

    private static void runOneTestCaseWithIndex(int i) {
        String caseFileName = CODE_GEN_TEST_PHASE + i;
        testCaseWithFileName(TESTCASE_PATH, caseFileName, TXT_EXTENSION);
    }

    private static void runExternalTestCases() {
        for (String testCaseName : TESTCASES) {
            String caseFileName = testCaseName;
            testCaseWithFileName(EXTERNAL_TEST_CASE_PATH, caseFileName,  EXTERNAL_TEST_CASE_FILE_EXTENSION);
        }
    }

    private static void testCaseWithFileName(String caseFilePath, String caseFileName, String inputExtenion) {
        System.out.printf("%sStarting frontendtest.Test with %s%n%s%n", LINE_SEPARATION, caseFileName, LINE_SEPARATION);
        boolean guiAST = false;
        try {
            testOneCase(caseFilePath, caseFileName, guiAST, inputExtenion);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    private static void testOneCase(String caseFilePath, String caseFileName, boolean guiAST, String inputExtention) throws IOException {
        HashMap<String, Symbol> symbolMap;
        HashMap<String, Func> funcMap;
        // Create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName(caseFilePath + caseFileName + inputExtention);
        // Create a lexer that feeds off of input CharStream
        lingBorLexer lexer = new lingBorLexer(input);
        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser that feeds off the tokens buffer
        lingBorParser parser = new lingBorParser(tokens);
        // Begin parsing at rule prog
        ParseTree tree = parser.input();

        System.out.println("-----Starting scanner and parser checking----");
        lingScannerParserCheckListener lsp = new lingScannerParserCheckListener();
        ParseTreeWalker.DEFAULT.walk(lsp, tree);
        System.out.println("-----Finished scanner and parser checking----");
        if(lsp.hasError()) {
            System.out.println("Error found, stopping");
            return;
        }

        System.out.println("-----Starting syntax checking-----");
        lingSyntaxCheckListener lstx = new lingSyntaxCheckListener();
        ParseTreeWalker.DEFAULT.walk(lstx, tree);
        System.out.println("\nFinal symbol and function map");

        lstx.printSymbolMap();
        symbolMap = lstx.getGlobalMap();
        lstx.printFuncMap();
        funcMap = lstx.getFuncMap();

        System.out.println("Has input file passed syntax check without error？: " + lstx.hasPassedSyntaxCheck());
        System.out.println("Total Number of syntax error: " + lstx.numSyntaxError());
        System.out.println("-----Finished syntax checking-----");
        /*
        if (!lstx.hasPassedSyntaxCheck()) {
            System.out.println("Error found, stopping");
            return;
        }*/

        System.out.println("-----Starting code gen-----");
        ArrayDeclarationListener arrayDeclarationListener = new ArrayDeclarationListener(symbolMap);
        ParseTreeWalker.DEFAULT.walk(arrayDeclarationListener, tree);
        lingCodeGenListener lcg = new lingCodeGenListener(caseFileName, symbolMap, funcMap);
        ParseTreeWalker.DEFAULT.walk(lcg, tree);
        System.out.println("-----Finished code gen-----");

        if (guiAST) {
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
        }
    }

}

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.*;
import scanner.*;
import static scanner.TestCompiler.testOneCase;

public class Test {

    public static void main(String[] args) throws IOException {
        String addr = "testcases/p3test3";

        // Create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName(addr+".txt");
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

        System.out.println("-----Starting syntax checking-----");
        lingSyntaxCheckListener lstx = new lingSyntaxCheckListener();
        ParseTreeWalker.DEFAULT.walk(lstx, tree);
        System.out.println("\nFinal symbol and function map");
        lstx.printSymbolMap();
        lstx.printFuncMap();
        System.out.println("Has input file passed syntax check without error？: "+lstx.hasPassedSyntaxCheck());
        System.err.println("Total Number of syntax error: "+lstx.numSyntaxError());
        System.out.println("-----Finished syntax checking-----");

        System.out.println("-----Starting code gen-----");
        lingCodeGenListener lcg = new lingCodeGenListener();
        ParseTreeWalker.DEFAULT.walk(lcg, tree);
        System.out.println("-----Finished code gen-----");


//        System.out.println(tree.toStringTree(parser));
//        JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),tree);
//        viewr.setScale(0.9);//scale a little
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(2000,1000);
//        frame.setVisible(true);

    }
}

package edu.nyu.compiler;

import edu.nyu.compiler.parser.CalcLexer;
import edu.nyu.compiler.parser.CalcParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        CharStream charStream = CharStreams.fromFileName("./test/sample.txt");
        CalcLexer calcLexer = new CalcLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(calcLexer);

        CalcParser calcParser = new CalcParser(commonTokenStream);

        ParseTree parseTree = calcParser.input();
        System.out.println("end");
    }
}

package edu.nyu.compiler.scanner;

import java.util.Scanner; 
import java.io.InputStream;

/**
 * This is the scanner class for the compiler design homework
 * @author Yu Zhang
 * @version 1.0.0
 */

class FakeCompilerScanner {

	private Token currentToken; 

	private LineInput currentLine; 

	private Scanner input;

	private int lineNumber; 

	public FakeCompilerScanner() {
		this(System.in); 
	}

	public FakeCompilerScanner(InputStream source) {
		input = new Scanner(source);
		lineNumber = 1; 
	}

	public Token nextToken() {
		currentLine = new LineInput(input.nextLine(), lineNumber++); 
		return currentToken; 
	}

	public boolean endOfFile() {
		return input.hasNextLine(); 
	}
}
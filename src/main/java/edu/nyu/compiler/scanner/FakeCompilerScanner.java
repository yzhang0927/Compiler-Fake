package edu.nyu.compiler.scanner;

import java.util.Scanner; 

/**
 * This is the scanner class for the compiler design homework
 * @author Yu Zhang
 * @version 1.0.0
 */

class FakeCompilerScanner {

	private Token currentToken; 

	private Scanner input;

	public FakeCompilerScanner() {
		this(System.in); 
	}

	public FakeCompilerScanner(InputStream source) {
		input = new Scanner(source);
	}

	public Token nextToken() {
		if (input.hasNext()) {

		} else {

		}
	}
}
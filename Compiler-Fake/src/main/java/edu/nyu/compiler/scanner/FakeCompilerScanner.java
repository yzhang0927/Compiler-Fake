package edu.nyu.compiler.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
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

	public FakeCompilerScanner(String inFileAddr) {
		File inFile = new File(inFileAddr);

		String encoding = "utf-8";
		try {
			input = new Scanner(inFile,encoding);
		} catch (FileNotFoundException e) {
			System.out.println("no such file: "+ inFileAddr +" EXITING");
			System.exit(0);
		}


		try {
			lineNumber = 1;
			currentLine = new LineInput(input.nextLine(),lineNumber);
		} catch (NoSuchElementException e) {
			System.out.println(inFileAddr+" is an empty file, EXITING");
			System.exit(0);
		}


	}

	public Token next() {
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine = new LineInput(input.nextLine(), ++lineNumber);
			currentLine.clearComment();
		}
		return currentLine.next();
	}

	public Token peek() {
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine = new LineInput(input.nextLine(), lineNumber++);
			currentLine.clearComment();
		}
		return currentLine.peek();
	}

	public int getLineNumber() {
		return this.lineNumber;
	}

	public String getLine() {
		return currentLine.getLine();
	}

	public boolean endOfFile() {
		return !input.hasNextLine();
	}
}
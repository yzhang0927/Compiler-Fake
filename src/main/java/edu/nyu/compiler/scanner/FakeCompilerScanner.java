package edu.nyu.compiler.scanner;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This is the scanner class for the compiler design homework
 * @author Yu Zhang
 * @version 1.0.0
 */

class FakeCompilerScanner {

	private Token currentToken; 

	private LineInput currentLine;
	public PrintWriter out;
	private Scanner input;
	private int lineNumber;
	private static final String ENCODING = "utf-8";

	public FakeCompilerScanner() {
		lineNumber = 1;
		input = new Scanner(System.in, ENCODING); 
		out = new PrintWriter(System.out, true); 
		currentLine = new LineInput(input.nextLine(), lineNumber, out);
	}

	public FakeCompilerScanner(String inFileAddr) {

		File in = new File(inFileAddr+".txt");
		

		try {
			out = new PrintWriter(inFileAddr + ".out");
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
			throw new RuntimeException("IOException: " + ioe.getMessage(), ioe); 
		}

		try {
			input = new Scanner(in, ENCODING);
		} catch (FileNotFoundException e) {
			System.err.println("no such file: "+ inFileAddr);
			throw new RuntimeException("no such file: " + inFileAddr, e); 
		}

		try {
			lineNumber = 1;
			currentLine = new LineInput(input.nextLine(), lineNumber, out);
		} catch (NoSuchElementException e) {
			System.err.println(inFileAddr + " is an empty file, EXITING");
			throw new RuntimeException(inFileAddr + " is an empty file, EXITING", e); 
		}
	}

	public Token next(){
		if (currentLine.endOfLine()){

		}
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine = new LineInput(input.nextLine(), ++lineNumber,out);
			currentLine.clearComment();
		}

		return currentLine.next();
	}

	public Token peek(){
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine = new LineInput(input.nextLine(), ++lineNumber,out);
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

	public void finishOutput() {
		out.close();
	}
}
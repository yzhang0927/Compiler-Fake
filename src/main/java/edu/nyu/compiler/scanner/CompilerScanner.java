package edu.nyu.compiler.scanner;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This is the scanner class for the compiler design
 * @author YI SHI & YU ZHANG
 * @version 1.5
 */

class CompilerScanner {

	private Token currentToken; 

	private LineInput currentLine;
	public PrintWriter out;
	private Scanner input;
	private int lineNumber;
	public CompilerScanner() {

	}

	public CompilerScanner(String inFileAddr) {

		File in = new File(inFileAddr+".txt");
		String encoding = "utf-8";

		try {
			out = new PrintWriter(inFileAddr+".out");
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}

		try {
			input = new Scanner(in,encoding);
		} catch (FileNotFoundException e) {
			System.out.println("no such file: "+ inFileAddr +" EXITING");
			System.exit(0);
		}

		try {
			lineNumber = 1;
			currentLine = new LineInput(input.nextLine(),lineNumber,out);
		} catch (NoSuchElementException e) {
			System.out.println(inFileAddr+" is an empty file, EXITING");
			System.exit(0);
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
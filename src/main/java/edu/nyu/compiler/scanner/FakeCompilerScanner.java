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
	public PrintWriter printWriterOutPut;
	private Scanner inputScanner;
	private int lineNumber;
	private static final String ENCODING = "utf-8";

	public FakeCompilerScanner() {
		lineNumber = 1;
		inputScanner = new Scanner(System.in, ENCODING);
		printWriterOutPut = new PrintWriter(System.out, true);
		currentLine = new LineInput(inputScanner.nextLine(), lineNumber, printWriterOutPut);
	}

	public FakeCompilerScanner(String inFileAddr) {

		File inputFile = new File(inFileAddr+".txt");

		try {
			printWriterOutPut = new PrintWriter(inFileAddr + ".out");
		} catch (IOException ioe) {
			throw new RuntimeException("IOException: " + ioe.getMessage(), ioe);
		}

		try {
			inputScanner = new Scanner(inputFile, ENCODING);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("no such file: " + inFileAddr, e);
		}

		try {
			lineNumber = 1;
			currentLine = new LineInput(inputScanner.nextLine(), lineNumber, printWriterOutPut);
		} catch (NoSuchElementException e) {
			throw new RuntimeException(inFileAddr + " is an empty file", e);
		}
	}

	public Token next(){
		if (currentLine.endOfLine()){

		}
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine = new LineInput(inputScanner.nextLine(), ++lineNumber, printWriterOutPut);
			currentLine.clearComment();
		}

		return currentLine.next();
	}

	public boolean endOfFile() {
		return !inputScanner.hasNextLine();
	}

	public void finishOutput() {
		printWriterOutPut.close();
	}
}
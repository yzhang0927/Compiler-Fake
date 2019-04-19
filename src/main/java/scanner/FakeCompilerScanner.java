package scanner;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This is the scanner class for the compiler design homework
 * @author Yu Zhang
 * @version 1.0.0
 */

public class FakeCompilerScanner {

	private Token currentToken;

	private LineInputLight currentLine;
	public PrintWriter printWriterOutPut;
	public PrintWriter printTokenForParser;
	private Scanner inputScanner;
	private int lineNumber;
	private static final String ENCODING = "utf-8";

	public FakeCompilerScanner() {
		lineNumber = 1;
		inputScanner = new Scanner(System.in, ENCODING);
		printWriterOutPut = new PrintWriter(System.out, true);
		printTokenForParser = new PrintWriter(System.out, true);
		currentLine = new LineInputLight(inputScanner.nextLine(), lineNumber, printWriterOutPut,printTokenForParser);
	}

	public FakeCompilerScanner(String inFileAddr) {

		File inputFile = new File(inFileAddr+".txt");
		try {
			printTokenForParser = new PrintWriter(inFileAddr + ".out2");
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
			currentLine = new LineInputLight(inputScanner.nextLine(), lineNumber, printWriterOutPut, printTokenForParser);
		} catch (NoSuchElementException e) {
			throw new RuntimeException(inFileAddr + " is an empty file, EXITING", e);
		}
	}

	public String next(){
		if (currentLine.endOfLine() || currentLine.isFlagComment()) {
			currentLine.printTokenForParser();
			currentLine = new LineInputLight(inputScanner.nextLine(), ++lineNumber, printWriterOutPut,printTokenForParser);
			currentLine.clearComment();
		}
		return currentLine.next();
	}

	public void nextLast(){

		while (!currentLine.endOfLine() && !currentLine.isFlagComment()) {
			currentLine.next();
		}
		currentLine.printTokenForParser();
	}

	public boolean endOfFile() {
		return !inputScanner.hasNextLine();
	}

	public void finishOutput() {
		printWriterOutPut.close();
		printTokenForParser.close();

	}
}
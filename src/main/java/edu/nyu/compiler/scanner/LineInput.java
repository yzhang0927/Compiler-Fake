package edu.nyu.compiler.scanner;

import java.util.Scanner; 

class LineInput {

    private final int lineNumber; 

    private Token currToken; 

    private Scanner input;

    public LineInput(String currLine, int lineNumber) {
        input = new Scanner(currLine); 
        this.lineNumber = lineNumber; 
    }

    public Token nextToken() {
        return currToken; 
    }

    public int getLineNumber() {
        return lineNumber; 
    }
	
}
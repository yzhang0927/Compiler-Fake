package edu.nyu.compiler.scanner;

import java.util.Scanner; 

class LineInput {

    private final int lineNumber; 

    private Token currToken; 

    private final String currLine; 

    private int currPos; 

    private TokenContext currContext; // This is the context switch

    public LineInput(String currLine, int lineNumber) {
        this.currLine = currLine; 
        this.lineNumber = lineNumber; 
    }

    public Token nextToken() {
        while(!endOfLine()) {
            char currChar = currLine.charAt(currPos++);
            if (currChar == ' ') {
                continue; 
            } else if (isNumber(currChar)) {
                currKWType = ReservedKeyWord.INT_LIT; 
            } else if (isNumber(currChar)) {
                currKWType = ReservedKeyWord.ID; 
            }
        }

        return currToken; 
    }

    private boolean isNumber(char possibleNum) {
        return (possibleNum >= '0' && possibleNum <= '9');
    }

    private boolean isLetter(char possibleLetter) {
        return (possibleLetter >= 'A' && possibleLetter <= 'Z') || (possibleLetter >= 'a' && possibleLetter <= 'z') || (possibleLetter == '_');
    }

    public int getLineNumber() {
        return lineNumber; 
    }

    public boolean endOfLine() {
        return currPos == currLine.length();
    }
}
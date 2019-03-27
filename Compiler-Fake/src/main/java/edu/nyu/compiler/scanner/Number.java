package edu.nyu.compiler.scanner; 

public class Number extends Token {
    public Number(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
    }

    @Override public boolean validate(char prevChar) {
        try {
            Integer.parseInt(getToken()); 
            return true; 
        } catch (NumberFormatException exp) {
            System.err.println("integer too large");
            return false; 
        }
    }

}
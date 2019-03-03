package edu.nyu.compiler.scanner; 

public class Number extends Token {
    public Number(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos, ReservedKeyWord.INT_LIT);  
    }

    @Override public boolean validate(Token prevToken) {
        try {
            Integer.parseInt(getToken()); 
            return true; 
        } catch (NumberFormatException exp) {
            return false; 
        }
    }
}
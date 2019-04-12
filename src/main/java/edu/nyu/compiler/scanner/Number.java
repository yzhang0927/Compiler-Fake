package edu.nyu.compiler.scanner; 

public class Number extends Token {
    private int value;
    public Number(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
        this.value = -1;
    }

    public int getValue() {
        return value;
    }

    @Override public boolean validate(char prevChar) {
        try {
            value = Integer.parseInt(getToken());
            return true; 
        } catch (NumberFormatException exp) {
            System.err.println("integer too large");
            return false; 
        }
    }
}
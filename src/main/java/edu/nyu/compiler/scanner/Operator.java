package edu.nyu.compiler.scanner; 

public abstract class Operator extends Token {
    public Operator(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
        super(token, lineNum, startCharPos, finishCharPos, kwType);  
    }
}
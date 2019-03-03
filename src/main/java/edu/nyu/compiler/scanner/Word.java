package edu.nyu.compiler.scanner; 

public abstract class Word extends Token {
    public Word(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
        super(token, lineNum, startCharPos, finishCharPos, kwType);  
    }
}
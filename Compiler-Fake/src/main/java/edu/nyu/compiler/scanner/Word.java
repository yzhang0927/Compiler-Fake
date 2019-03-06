package edu.nyu.compiler.scanner; 

public abstract class Word extends Token {
    public Word(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);

    }
}
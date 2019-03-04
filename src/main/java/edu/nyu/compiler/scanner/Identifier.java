package edu.nyu.compiler.scanner; 

public class Identifier extends Word {
    public Identifier(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
        super(token, lineNum, startCharPos, finishCharPos, kwType);  
    }
}
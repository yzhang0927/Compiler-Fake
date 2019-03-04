package edu.nyu.compiler.scanner; 

public class KeyWord extends Word {
    public KeyWord(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
        super(token, lineNum, startCharPos, finishCharPos, kwType);  
    }
}
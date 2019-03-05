package edu.nyu.compiler.scanner; 

public class GreedyOperator extends Token {

    // We need a hashMap here for non - deterministic Operators
    public GreedyOperator(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
    }

    // Assume you make decision after going one step head.
    public ReservedKeyWord getTokenType(){
        for (ReservedKeyWord me : ReservedKeyWord.values()) {
            if (me.getKeywordString().equals(this.getToken()))
                return me;
        }
        System.out.println("not found");
        return null;
    }

    @Override
    public boolean validate(char tk) {
        for (ReservedKeyWord me : ReservedKeyWord.values()) {
            if (me.getKeywordString().equals(this.getToken()))
                return true;
        }
        System.out.println("not found");
        return false;
    }
}

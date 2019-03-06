package edu.nyu.compiler.scanner; 

public class NonGreedyOperator extends Token {


    public NonGreedyOperator(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
    }

    public boolean validate(char tk) {
        if (KeyList.NonGreedyOperatorList.contains(this.getToken())){
            return true;
        }
        else{
            return false;
        }
    }

    public ReservedKeyWord getTokenType(){
        for (ReservedKeyWord me : ReservedKeyWord.values()) {
            if (me.getKeywordString().equals(this.getToken()))
                return me;
        }
        System.out.println("not found");
        return null;
    }
}

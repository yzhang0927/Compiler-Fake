package edu.nyu.compiler.scanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class KeyWord extends Word {
    private enum ReservedKey {

        KW_ARRAY("array"),
        KW_TUPLE("tuple"),
        KW_LOCAL("local"),
        KW_GLOBAL("global"),
        KW_DEFUN("defun"),
        KW_END("end"),
        KW_WHILE("while"),
        KW_DO("do"),
        KW_IF("if"),
        KW_THEN("then"),
        KW_ELSIF("elsif"),
        KW_ELSE("else"),
        KW_FOREACH("foreach"),
        KW_IN("in"),
        RETURN("return"),
        PRINT("print");

        String keywordString;

        private ReservedKey(String keywordString) {
            this.keywordString = keywordString;
        }

        private String getKeywordString() {
            return this.keywordString;
        }

    }

    public KeyWord(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
    }

    public boolean validate(char tk){
        for (ReservedKey me : ReservedKey.values()) {
            if (me.getKeywordString().equals(this.getToken()))
                return true;
        }
        return false;
    }

    public ReservedKeyWord getTokenType(){
        for (ReservedKeyWord me : ReservedKeyWord.values()) {
            if (me.getKeywordString().equals(this.getToken()))
                return me;
        }
        System.err.println("key word not found");
        return null;
    }
}
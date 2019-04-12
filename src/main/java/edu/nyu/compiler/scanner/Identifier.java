package edu.nyu.compiler.scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identifier extends Word {
    public Identifier(String token, int lineNum, int startCharPos, int finishCharPos) {
        super(token, lineNum, startCharPos, finishCharPos);
    }

    @Override public boolean validate(char prevChar) {
        String patternString = "^[a-zA-Z_]{1,80}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(getToken());

        if (!matcher.matches()){
            System.err.printf("ID on line %d, from char %d to %d, is not valid, Id should be less than 80 char",
                    getLineNum(), getStartCharPos(), getFinishCharPos());
            setToken("$too$long$ID");
        }

        return true;
    }
}
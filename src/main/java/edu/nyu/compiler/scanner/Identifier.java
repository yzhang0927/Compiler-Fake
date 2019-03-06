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

        if (matcher.matches()){
            return true;
        }
        else{
            System.out.println("ID not vaild, too long");
            return false;
        }
    }
}
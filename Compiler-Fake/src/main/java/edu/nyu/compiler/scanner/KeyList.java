package edu.nyu.compiler.scanner;
import java.util.HashSet;

public abstract class KeyList{

    public static final HashSet<String> GreedyOperatorList = new HashSet<String>() {{
        add("-");
        add("*");
        add(">");
        add("<");
        add("=");
        add("!");
        add(".");
    }};

    public static final HashSet<String> NonGreedyOperatorList = new HashSet<String>() {{
        add("[");
        add("]");
        add("(");
        add(")");
        add("+");
        add("/");
        add(";");
        add(",");
    }};

    public static final HashSet<String> KeyWordList = new HashSet<String>() {{
        add("end");
        add("while");
        add("do");
        add("if");
        add("then");
        add("elseif");
        add("else");
        add("foreach");
        add("in");
        add("return");
        add("print");
        add("array");
        add("tuple");
        add("local");
        add("global");
        add("defun");
    }};
}
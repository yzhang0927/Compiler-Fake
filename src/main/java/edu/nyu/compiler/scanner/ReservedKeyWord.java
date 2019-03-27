package edu.nyu.compiler.scanner; 

public enum ReservedKeyWord {

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
    PRINT("print"),

    LBRAK("["),
    RBRAK("]"),
    SEMI(";"),
    LPAR("("),
    RPAR(")"),
    OP_COMMA(","),

    OP_DOT("."),
    ASSIGN("="),
    EXCHANGE("<->"),
    OP_DOTDOT(".."),
    OP_LESS("<"),
    OP_GREATER(">"),
    OP_LESSEQUAL("<="),
    OP_GREATEREQUAL(">="),
    OP_EQUAL("=="),
    OP_NOTEQUA("!="),
    OP_PLUS("+"),
    OP_MINUS("-"),
    OP_MULT("*"),
    OP_DIV("/"),
    OP_UMINUS("-"),
    ID("INPUT_DEPENDENT_KEYWORD"),
    INT_LIT("INPUT_DEPENDENT_KEYWORD");

    private final String keywordString;

    ReservedKeyWord(String keywordString) {
        this.keywordString = keywordString; 
    }

    public String getKeywordString() {
        return keywordString; 
    }

}
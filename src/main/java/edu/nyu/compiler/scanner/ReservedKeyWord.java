package edu.nyu.compiler.scanner; 

import java.util.HashMap; 

public enum ReservedKeyWord {

    KW_ARRAY("array"),
    OP_DOTDOT(".."),
    LBRAK("["),
    RBRAK("]"),
    SEMI(";"),
    KW_TUPLE("tuple"),
    KW_LOCAL("local"),
    KW_GLOBAL("global"),
    KW_DEFUN("defun"), 
    LPAR("("),
    RPAR(")"),
    OP_COMMA(","),
    KW_END("end"),
    KW_WHILE("while"),
    KW_DO("while"),
    KW_IF("if"),
    KW_THEN("then"),
    KW_ELSIF("elsif"),
    KW_ELSE("else"),
    KW_FOREACH("foreach"),
    KW_IN("in"),
    OP_DOT("."),
    RETURN("return"),
    PRINT("print"),
    ASSIGN("="),
    EXCHANGE("<->"),
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
    ID(INPUT_DEPENDENT_KEYWORD),
    INT_LIT(INPUT_DEPENDENT_KEYWORD);

    private static final String INPUT_DEPENDENT_KEYWORD = "input"; 
    private final String keywordString; 

    private ReservedKeyWord(String keywordString) {
        this.keywordString = keywordString; 
    }
}
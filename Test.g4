grammar Test;
/*
@header {
    package edu.nyu.compiler.parser;
}
*/
start_symbol: input;

ID : 'ID';
OP_DOT: 'OP_DOT';
OP_COMMA: 'OP_COMMA';
OP_PLUS: 'OP_PLUS';
INT_LIT: 'INT_LIT';
OP_MINUS: 'OP_MINUS';
OP_DIV: 'OP_DIV';
OP_MULT: 'OP_MULT';
OP_DOTDOT: 'OP_DOTDOT';
LBRAK: 'LBRAK';
RBRAK: 'RBRAK';
LPAR: 'LPAR';
RPAR: 'RPAR' ;
KW_ARRAY:'KW_ARRAY';
KW_TUPLE:'KW_TUPLE';
KW_LOCAL:'KW_LOCAL';
KW_GLOBAL: 'KW_GLOBAL';
KW_DEFUN: 'KW_DEFUN';
SEMI: 'SEMI';
DEFUN: 'DEFUN';
KW_END: 'KW_END';
KW_IF: 'KW_IF';
KW_THEN: 'KW_THEN';
KW_DO: 'KW_DO';
KW_WHILE: 'KW_WHILE';
KW_ELSIF: 'KW_ELSIF';
KW_ELSE: 'KW_ELSE';
KW_FOREACH: 'KW_FOREACH';
KW_IN: 'KW_IN';
KW_FOR: 'KW_FOR';
PRINT: 'PRINT';
RETURN: 'RETURN';
ASSIGN: 'ASSIGN';
FOR: 'FOR';
EXCHANGE: 'EXCHANGE';
OP_LESS: 'OP_LESS';
OP_EQUAL: 'OP_EQUAL';
OP_GREATER: 'OP_GREAT';
OP_NOTEQUA: 'OP_NOTEQUA';
OP_LESSEQUAL: 'OP_LESSEQUAL';
OP_GREATEREQUAL: 'OP_GREATEREQUAL';


input : (( statement | decl | def )NEWLINE)* ;

NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;


decl : KW_ARRAY ID LBRAK expr OP_DOTDOT expr RBRAK ( ASSIGN expr )? SEMI
     | KW_TUPLE ID ASSIGN expr ( OP_COMMA expr)+ SEMI
     | KW_LOCAL ID ASSIGN expr SEMI
     | KW_GLOBAL ID ASSIGN expr SEMI ;

// function definition; no way to specify types of parameters (yet?)
def : KW_DEFUN ID LPAR ID ( OP_COMMA ID )* RPAR body KW_END KW_DEFUN ;

body : ( statement | decl )*   ; // no nested function definitions

statement : lhs ASSIGN expr SEMI  // assignment
          | lhs EXCHANGE lhs SEMI // exchange
	  | KW_WHILE bool_expr  KW_DO statement* KW_END KW_WHILE
	  | KW_IF bool_expr KW_THEN statement*
	    (KW_ELSIF bool_expr KW_THEN statement)*
	    (KW_ELSE statement)? KW_END KW_IF
	  | KW_FOREACH expr KW_IN (range | ID) KW_DO statement* KW_END ID //I think the professor has not give us KW_FOR
	  //we keep array id as an ID
	  | RETURN expr SEMI
	  | PRINT expr SEMI
       ;

array_id: ID;
range : expr OP_DOTDOT expr ;
bool_expr : expr bool_op expr ; // can make it more complicated by adding logical operators such as NOT, AND, OR, XOR

bool_op : OP_LESS | OP_GREATER | OP_EQUAL | OP_NOTEQUA | OP_LESSEQUAL | OP_GREATEREQUAL ;

// left hand side of an assignment
lhs : lhs_item ( OP_COMMA lhs_item )* ;

lhs_item :
    // variable
    ID
    |ID OP_DOT INT_LIT  // tuple component reference
    | ID LBRAK expr RBRAK  ; // array element reference


expr :
    // *ascending* order of precedence: from least important to most important
    expr OP_COMMA expr // tuple constuctor
    | expr ( OP_PLUS | OP_MINUS |OP_MULT | OP_DIV ) expr
    // there is no more unary minus!!
    |  LPAR expr RPAR
    |  ID
    |  ID expr // function call, right-associative
    |  ID OP_DOT INT_LIT// tuple reference
    |  ID LBRAK expr RBRAK // array element refe\rence
    ;




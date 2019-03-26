grammar Test;
/*
@header {
    package edu.nyu.compiler.parser;
}
*/
start_symbol: input

expr = // *ascending* order of precedence: from least important to most important
    expr OP_COMMA expr // tuple constuctor
    | expr ( OP_PLUS | OP_MINUS ) expr
    | expr ( OP_MULT | OP_DIV  ) expr
    // there is no more unary minus!!
    | LPAR expr RPAR
    | ID
    | ID expr // function call, right-associative
    | ID OP_DOT INT_LIT // tuple reference
    | ID LBRAK expr RBRAK // array element reference

input = ( statement | decl | def )*

decl = KW_ARRAY ID LBRAK expr OP_DOTDOT expr RBRAK ( ASSIGN expr )? SEMI
     | KW_TUPLE ID ASSIGN expr ( COMMA expr)+ SEMI
     | KW_LOCAL ID ASSIGN expr SEMI
     | KW_GLOBAL ID ASSIGN expr SEMI

// function definition; no way to specify types of parameters (yet?)
def = KW_DEFUN ID LPAR ID ( OP_COMMA ID )* RPAR body KW_END KW_DEFUN

body = ( statement | decl )* // no nested function definitions

statement = lhs ASSIGN expr SEMI  // assignment
          | lhs EXCHANGE lhs SEMI // exchange
	  | KW_WHILE bool_expr  KW_DO statement* KW_END KW_WHILE
	  | KW_IF bool_expr KW_THEN statement*
	    (KW_ELSIF bool_expr KW_THEN statement)*
	    (KW_ELSE statement)? KW_END KW_IF
	  | KW_FOREACH x KW_IN (range | ID) KW_DO statement* KW_END KW_FOR
	  //we keep array id as an ID
	  | RETURN expr SEMI
	  | PRINT expr SEMI
	  

bool_expr = expr bool_op expr  // can make it more complicated by adding logical operators such as NOT, AND, OR, XOR

bool_op = OP_LESS | OP_GREATER | OP_EQUAL | OP_NOTEQUA | OP_LESSEQUAL | OP_GREATEREQUAL

// left hand side of an assignment
lhs =  lhs_item ( OP_COMMA lhs_item )*

lhs_item =
      ID // variable
    | ID OP_DOT INT_LIT  // tuple component reference
    | ID LBRAK expr RBRAK // array element reference

range = expr OP_DOTDOT expr

KW_ARRAY = 'array'
ID = '[0-9a-zA-Z_]+'
LBRAK = '['
RBRAK = ']'
SEMI = ';'
KW_TUPLE = 'tuple'
KW_LOCAL = 'local'
KW_GLOBAL = 'global'
KW_DEFUN = 'defun'
LPAR = '('
RPAR = ')'

KW_END = 'end'
KW_WHILE = 'while'
KW_DO = 'do'
KW_IF = 'if'
KW_THEN = 'then'
KW_ELSIF = 'elsif'
KW_ELSE = 'else'
KW_FOREACH = 'foreach'
KW_FOR = 'for'
KW_IN = 'in'

OP_COMMA = ','
OP_DOT = '.'
OP_DOTDOT =  '..'
OP_MULT = '*'
OP_DIV = '/'
OP_PLUS = '+'
OP_MINUS = '-'
OP_LESS = '<'
OP_GREATER = '>'
OP_NOTEQUEA = '!='
OP_EQUAL = '='
OP_LESSEQUAL = '<='
OP_GREATEREQUAL = '>='
EXCHANGE = '<->'
ASSIGN = '='
INT_LIT = '[0-9]{1,12}' //prof says will define precisely later, so made it easy as such
RETURN = 'return'
PRINT = 'print'

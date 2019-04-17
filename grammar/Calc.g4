grammar Calc;

start_symbol: input;

ID : 'ID'; //TBI
OP_DOT: '.';
OP_COMMA: ',';
OP_PLUS: '+';
INT_LIT: 'INT_LIT'; //TBI
OP_MINUS: '-';
OP_DIV: '/';
OP_MULT: '*';
OP_DOTDOT: '..';
LBRAK: '[';
RBRAK: ']';
LPAR: '(';
RPAR: ')' ;
KW_ARRAY:'array';
KW_LOCAL:'local';
KW_GLOBAL: 'global';
KW_DEFUN: 'defun';
SEMI: ';';
KW_END: 'end';
KW_IF: 'if';
KW_THEN: 'then';
KW_DO: 'do';
KW_WHILE: 'while';
KW_ELSIF: 'elsif';
KW_ELSE: 'else';
KW_FOREACH: 'foreach';
KW_IN: 'in';
PRINT: 'print';
RETURN: 'return';
ASSIGN: '=';
FOR: 'for';
EXCHANGE: '<->';
OP_LESS: '<';
OP_EQUAL: '==';
OP_GREATER: '>';
OP_NOTEQUA: '!=';
OP_LESSEQUAL: '<=';
OP_GREATEREQUAL: '>=';


WS : ( ' ' | '\t' | '\r' | '\n' )+ -> channel(HIDDEN);
input : ( statement | decl | def )* ;

decl : KW_ARRAY ID LBRAK expr OP_DOTDOT expr RBRAK ( ASSIGN expr )? SEMI
     | KW_LOCAL ID ASSIGN expr SEMI
     | KW_GLOBAL ID (ASSIGN expr)? SEMI ; //NEW CHANGES

// function definition; no way to specify types of parameters (yet?)
def : KW_DEFUN ID LPAR ID ( OP_COMMA ID )* RPAR body KW_END KW_DEFUN ;

body : ( statement | decl )*   ; // no nested function definitions

statement : lhs ASSIGN expr SEMI  // assignment
          | lhs EXCHANGE lhs SEMI // exchange
	  | KW_WHILE bool_expr  KW_DO statement* KW_END KW_WHILE
	  | KW_IF bool_expr KW_THEN statement*
	    (KW_ELSIF bool_expr KW_THEN statement)*
	    (KW_ELSE statement)? KW_END KW_IF
	  | KW_FOREACH expr KW_IN (range | ID) KW_DO statement* KW_END FOR //I think the professor has not give us KW_FOr
	  //we keep array id as an ID
	  | RETURN expr SEMI
	  | PRINT expr SEMI
       ;


array_id: ID;
range : expr OP_DOTDOT expr ;
bool_expr : expr bool_op expr ; // can make it more complicated by adding logical operators such as NOT, AND, OR, XOR

bool_op : OP_LESS | OP_GREATER | OP_EQUAL | OP_NOTEQUA | OP_LESSEQUAL | OP_GREATEREQUAL ;

lhs : lhs_item ( OP_COMMA lhs_item )* ;

lhs_item :
    // variable
    ID
    | ID OP_DOT INT_LIT  // tuple component reference
    | ID LBRAK expr RBRAK  ; // array element reference

expr :
    // *ascending* order of precedence: from least important to most important
    expr OP_COMMA expr // tuple constuctor
    | expr ( OP_MULT | OP_DIV)  expr
    | expr ( OP_PLUS | OP_MINUS) expr
    // there is no more unary minus!!
    |  LPAR expr RPAR
    |  ID
    |  INT_LIT
    |  ID expr // function call, right-associative
    |  ID OP_DOT INT_LIT// tuple reference
    |  ID LBRAK expr RBRAK // array element refe\rence
    ;
grammar lingBor;

start_symbol: input;

OP_DOT: '.';
OP_COMMA: ',';
OP_PLUS: '+';

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

INT_LIT: [0-9]+;
int_lit: INT_LIT;

ID: [a-zA-Z_]+;
id : ID;

WS : ( ' ' | '\t' | '\r' | '\n' )+ -> channel(HIDDEN);
LINE_COMMENT: '***' ~[\r\n]* -> channel(HIDDEN);

input : ( statement | decl | def )* ;

decl : KW_ARRAY id LBRAK expr OP_DOTDOT expr RBRAK ( id ASSIGN expr )? SEMI
     | KW_LOCAL id (ASSIGN expr)? SEMI
     | KW_GLOBAL id (ASSIGN expr)? SEMI ;

// function definition;
def : KW_DEFUN id LPAR expr RPAR body KW_END KW_DEFUN ;

body : ( statement | decl )*   ; // no nested function definitions

for_loop: KW_FOREACH expr KW_IN (range | array_id) KW_DO statement* KW_END FOR; //We should change expr to id

while_loop: KW_WHILE bool_expr  KW_DO statement* KW_END KW_WHILE;

statement : lhs ASSIGN expr SEMI
          | lhs EXCHANGE lhs SEMI
	      | cond
	      | for_loop
	      | while_loop
	      | RETURN expr SEMI
	      | PRINT expr SEMI
          ;

array_id: id;

cond: ifs elsifs? elses? KW_END KW_IF;

ifs:  KW_IF bool_expr KW_THEN statement*;
elsifs: (KW_ELSIF bool_expr KW_THEN statement*) elsifs?;
elses: (KW_ELSE statement*);

range : expr OP_DOTDOT expr ;

bool_expr : expr bool_op expr ; // can make it more complicated by adding logical operators such as NOT, AND, OR, XOR

bool_op : OP_LESS | OP_GREATER | OP_EQUAL | OP_NOTEQUA | OP_LESSEQUAL | OP_GREATEREQUAL ;

lhs : lhs_item ( OP_COMMA lhs_item )* ;

tuple_ele : id OP_DOT int_lit;
array_ele : id LBRAK expr RBRAK;
func_call : id LPAR expr RPAR
          | id expr ;

lhs_item :
    // variable
    id
    | tuple_ele  // tuple component reference
    | array_ele  ; // array element reference

expr:
    // *ascending* order of precedence: from least important to most important
     // tuple constuctor

     expr ( OP_MULT | OP_DIV)  expr
    | expr ( OP_PLUS | OP_MINUS) expr
    | expr OP_COMMA expr
    // there is no more unary minus!!
    |  LPAR expr RPAR
    |  id
    |  int_lit
    |  func_call // function call, right-associative
    |  tuple_ele //tuple reference
    |  array_ele // array element refe\rence
    ;


public class OutputParser {
    public String OutputParser(String in) {
        return parse(in);
    }

    private String parse(String in) {
        String out = "";
        int tmpIndent = 0;
        int flag = 0;
        String currToken = null;
        for (int i = 1; i < in.length() - 1; i++) {
            if (in.charAt(i) == '(') {
                tmpIndent += 2;
                flag = 1;
            } else if (in.charAt(i) == ')') {
                tmpIndent -= 2;
                flag = 2;
            }

            if (flag != 0) {
                out += '\n';
                for (int j = 0; j < tmpIndent; j++) {
                    out += ' ';
                }
                out += in.charAt(i);
            }
        }
        return out;
            /* my out for p2test0
            : (input (statement KW_IF (bool_expr (expr ID) (bool_op OP_EQUAL) (expr (expr LPAR (expr (expr ID) OP_DIV (expr INT_LIT)) RPAR) OP_MULT (expr INT_LIT))) KW_THEN KW_THEN (statement PRINT (expr INT_LIT) SEMI) KW_ELSE (statement KW_ELSE PRINT (expr INT_LIT) SEMI) KW_END KW_IF))

            May be we should use p1test0.out as check table, so that we can add value after token type as fllowing


            a = ((((b)-3*4)))

            Output (I use dots to emphasize indentation):

            (assign
            ..ID:a
            ..(-
            ..  ID:b
            ....(*
            ......LIT:3
            ......LIT:4
            ....)
            ..)
            */

        }
    }




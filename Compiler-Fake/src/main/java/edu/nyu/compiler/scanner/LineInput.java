package edu.nyu.compiler.scanner;

import java.io.PrintWriter;
import java.util.ArrayList;

class LineInput {

    private final int lineNumber;

    private Token currToken; 
    private boolean flagComment;
    private final String currLine;

    private PrintWriter outStreamForPar;
    private PrintWriter outStream;
    private int currPos = 0;
    private int startPos = 0;
    private TokenContext currContext = null; // This is the context switch
    ArrayList<String> tokenStorage;

    public LineInput(String currLine, int lineNumber, PrintWriter outStream, PrintWriter outStreamForPar) {
        this.currLine = currLine;
        this.lineNumber = lineNumber;
        this.outStream = outStream;
        this.outStreamForPar = outStreamForPar;
        this.tokenStorage= new ArrayList<String>();
        System.out.println("~~~~~~>Line content<~~~~~~");
        System.out.println(currLine);
        System.out.println("~~~~~~^Line content^~~~~~~");
    }

    public Token next() {

        while(!endOfLine()) {
            char currChar = currLine.charAt(currPos++);

            currContext = getContextType(currChar);
            if (currContext == TokenContext.Space) {
                startPos = currPos;
                continue;
            }

            if (currContext == TokenContext.Unidentified) {
                startPos = currPos;
                outStream.printf("unidentified character %c at line: %d, col: %d%n%n",currChar,lineNumber,currPos);
                System.out.printf("unidentified character %c at line: %d, col: %d%n%n",currChar,lineNumber,currPos);
                continue;

            } else if (currContext == TokenContext.NonGreedyOperator) {
                NonGreedyOperator possibleToken = new NonGreedyOperator(String.valueOf(currChar),lineNumber,startPos,currPos);
                //already checked
                possibleToken.setKWType(possibleToken.getTokenType());
                currToken = possibleToken;
                break;

            } else if (currContext == TokenContext.GreedyOperator) {
                //*
                if (currChar == '*') {
                    if ( currPos + 1 < currLine.length()
                            && currLine.charAt(currPos) == '*'
                            && currLine.charAt(currPos+1)=='*') {
                        //comment encountered, break loop.
                        String comment = currLine.substring(currPos-1,currLine.length()) ;
                        outStream.println(String.format("comment: \"%s\" from char %d to %d on line: %d\n",comment,startPos,currLine.length(),lineNumber));
                        System.out.println(String.format("comment: \"%s\" from char %d to %d on line: %d\n",comment,startPos,currLine.length(),lineNumber));
                        this.flagComment = true;
                        break;

                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("*",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '!') {
                    if (currPos < currLine.length() && currLine.charAt(currPos) =='=') {
                        currPos ++;
                        GreedyOperator possibleToken = new GreedyOperator ("!=",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;

                        break;
                    }
                    else {
                        System.out.println(String.format("unidentified character ! at line: %d, col: %d\n",lineNumber,currPos));
                        outStream.println(String.format("unidentified character ! at line: %d, col: %d\n",lineNumber,currPos));
                        startPos = currPos;
                        continue;
                    }

                } else if (currChar == '<') {

                    if (currPos+1 < currLine.length() && currLine.charAt(currPos)=='-' && currLine.charAt(currPos+1)=='>') {
                        currPos += 2;
                        GreedyOperator possibleToken = new GreedyOperator ("<->",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    } else if (currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        currPos ++;
                        GreedyOperator possibleToken = new GreedyOperator ("<=",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("<",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '>') {
                    if ( currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        currPos ++;
                        GreedyOperator possibleToken = new GreedyOperator (">=",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator (">",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '=') {

                    if (currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        currPos ++;
                        GreedyOperator possibleToken = new GreedyOperator ("==",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("=",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '.') {

                    if (currPos < currLine.length() && currLine.charAt(currPos) == '.') {
                        currPos ++;
                        GreedyOperator possibleToken = new GreedyOperator ("..",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator (".",lineNumber,startPos,currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '-') {
                    if (currPos == 0 || currLine.charAt(currPos-1) == '(' ||
                            currLine.charAt(currPos-1) == '[' || currLine.charAt(currPos-1) == '+' ||
                            currLine.charAt(currPos-1) == '-' || currLine.charAt(currPos-1) == '<' ||
                            currLine.charAt(currPos-1) == '>' || currLine.charAt(currPos-1) == '=' ||
                            currLine.charAt(currPos-1) == '*' || currLine.charAt(currPos-1) == '/') {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("-",lineNumber,startPos,currPos);
                        possibleToken.setKWType(ReservedKeyWord.OP_UMINUS);
                        currToken =  possibleToken;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("-",lineNumber,startPos,currPos);
                        possibleToken.setKWType(ReservedKeyWord.OP_MINUS);
                        currToken =  possibleToken;
                        break;
                    }

                } else {
                    System.err.println("something wrong with greedy op");
                    throw new RuntimeException("GreedyOperator is failing somehow"); 
                }

            } else {
                //number or letter
                TokenContext lastContext = currContext;

                while (currPos < currLine.length() && currContext == lastContext) {
                    currContext = getContextType(currLine.charAt(currPos++));
                }
                String possibleTokenString;
                if (currPos < currLine.length()) {
                    currPos--;
                }
                if (currPos >= currLine.length() && currContext != lastContext) {
                    currPos--;
                }
                possibleTokenString = currLine.substring(startPos, currPos);

                if (lastContext == TokenContext.Number) {
                    Number possibleToken = new Number(possibleTokenString, lineNumber, startPos, currPos);
                    if (possibleToken.validate(' ')) {
                        possibleToken.setKWType(ReservedKeyWord.INT_LIT);
                        currToken = possibleToken;
                        break;
                    }
                } else {
                    if (isKeyWord(possibleTokenString)) {
                        KeyWord possibleToken = new KeyWord(possibleTokenString, lineNumber, startPos, currPos);
                        possibleToken.setKWType(possibleToken.getTokenType());
                        currToken = possibleToken;
                        break;
                    } else {
                        Identifier possibleToken = new Identifier(possibleTokenString, lineNumber, startPos, currPos);
                        if (possibleToken.validate(' ')) {
                            possibleToken.setKWType(ReservedKeyWord.ID);
                            currToken = possibleToken;
                            break;
                        }
                    }

                }
            }
        }

        startPos = currPos;
        printTokenInfo(currToken);
        addTokenToStorage(currToken);
        return currToken;
    }

    public Token peek() {
        int backupPos = currPos;
        Token nextToken = this.next();
        currPos = backupPos;
        return nextToken;
    }

    private TokenContext getContextType(char c) {
        TokenContext context;
        if (c==' ') {
            context = TokenContext.Space;
        } else if (isNonGreedyOperator(c)) {
            context = TokenContext.NonGreedyOperator;
        } else if (isGreedyOperator(c)) {
            context = TokenContext.GreedyOperator;
        } else if (isLetter(c)) {
            context = TokenContext.Word;
        } else if (isNumber(c)) {
            context = TokenContext.Number;
            //currKWType = ReservedKeyWord.INT_LIT;
        } else {
            context = TokenContext.Unidentified;
        }
        return context;
    }

    public void printTokenForParser(){
        if (this.tokenStorage.size()>0) {
            String outLinePar = this.tokenStorage.get(0);
            for (int i = 1; i < this.tokenStorage.size(); i++) {
                outLinePar += ' ';
                outLinePar += this.tokenStorage.get(i);
            }
            outStreamForPar.println(outLinePar);
            System.out.println(outLinePar);
        }
    }

    public void addTokenToStorage(Token token){
        if (token!=null){ this.tokenStorage.add(token.getKwType().name());}
    }
    public void printTokenInfo(Token token) {
        if (token != null){
            String tokenName = token.getKwType().name();
            System.out.println(tokenName);
            System.out.println(String.valueOf(token.getStartCharPos())+' '+ String.valueOf(token.getFinishCharPos()));
            outStream.println(String.format("%s on line %d, from char %d to %d",tokenName,lineNumber,token.getStartCharPos(),token.getFinishCharPos()));

        }
        System.out.println("\n");
    }

    private boolean isNumber(char possibleNum) {
        return (possibleNum >= '0' && possibleNum <= '9');
    }

    private boolean isLetter(char possibleLetter) {
        return (possibleLetter >= 'A' && possibleLetter <= 'Z') || (possibleLetter >= 'a' && possibleLetter <= 'z') || (possibleLetter == '_');
    }

    private boolean isOperator(char possibleOperator) {
        return isGreedyOperator(possibleOperator) || isNonGreedyOperator(possibleOperator);
    }

    private boolean isNonGreedyOperator(char possibleOperator) {
        return KeyList.NonGreedyOperatorList.contains(String.valueOf(possibleOperator));
    }

    private boolean isGreedyOperator(char possibleOperator) {
        return KeyList.GreedyOperatorList.contains(String.valueOf(possibleOperator));
    }

    private boolean isKeyWord(String possibleKeyWord) {
        return KeyList.KeyWordList.contains(String.valueOf(possibleKeyWord));
    }

    public int getLineNumber() {
        return lineNumber; 
    }

    public String getLine() {
        return this.currLine;
    }

    public boolean endOfLine() {
        return currPos >= currLine.length();
    }

    public boolean isFlagComment() {
        return this.flagComment;
    }

    public void clearComment() {
        this.flagComment = false;
    }
}
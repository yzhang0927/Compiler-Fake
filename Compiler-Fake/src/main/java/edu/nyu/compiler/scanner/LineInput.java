package edu.nyu.compiler.scanner;

import java.util.Scanner;
import java.util.List;

class LineInput {

    private final int lineNumber;

    private Token currToken; 
    private boolean flagComment;
    private final String currLine;

    private int currPos = 0;
    private int startPos = 0;
    private TokenContext currContext = null; // This is the context switch
    private List<Token> tokenStorage;

    public LineInput(String currLine, int lineNumber) {
        this.currLine = currLine;
        this.lineNumber = lineNumber;
    }

    public Token next() {
        ReservedKeyWord currKWType;
        while(!endOfLine()) {
            TokenContext lastContext = currContext;
            char currChar = currLine.charAt(currPos++);

            if (currChar == ' ') { continue; }

            currContext = getContextType(currChar);

            if (currContext == TokenContext.Unidentified) {
                System.out.println(String.format("unidentified character scanned at line: %d, col: %d",lineNumber,currPos));

            } else if (currContext == TokenContext.NonGreedyOperator) {
                NonGreedyOperator possibleToken =
                        new NonGreedyOperator(String.valueOf(currChar),lineNumber,startPos,currPos);
                //already checked
                possibleToken.setkwType(possibleToken.getTokenType());
                currToken = possibleToken;
                break;

            } else if (currContext == TokenContext.GreedyOperator) {
                //*
                if (currChar == '*') {
                    if ( currPos+1 < currLine.length() && currLine.charAt(currPos)=='*' && currLine.charAt(currPos+1)=='*') {
                        //comment encountered, break loop.
                        System.out.println("comment on line: " + lineNumber);
                        this.flagComment = true;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("*",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }
                } else if (currChar == '!') {
                    if (currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        GreedyOperator possibleToken = new GreedyOperator ("!=",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos ++;
                        break;
                    }
                    else {
                        System.out.println("solo ! is illegal");
                    }

                } else if (currChar == '<') {

                    if (currPos+1 < currLine.length() && currLine.charAt(currPos)=='=' && currLine.charAt(currPos+1)=='>') {
                        GreedyOperator possibleToken = new GreedyOperator ("<=>",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos += 2;
                        break;
                    } else if (currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        GreedyOperator possibleToken = new GreedyOperator ("<=",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos += 1;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("<",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '>') {

                    if ( currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        GreedyOperator possibleToken = new GreedyOperator (">=",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos += 1;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator (">",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '=') {

                    if (currPos < currLine.length() && currLine.charAt(currPos)=='=') {
                        GreedyOperator possibleToken = new GreedyOperator ("==",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos ++;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator ("=",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }

                } else if (currChar == '.') {

                    if (currPos < currLine.length() && currLine.charAt(currPos)=='.') {
                        GreedyOperator possibleToken = new GreedyOperator ("..",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        currPos ++;
                        break;
                    } else {
                        NonGreedyOperator possibleToken = new NonGreedyOperator (".",lineNumber,startPos,currPos);
                        possibleToken.setkwType(possibleToken.getTokenType());
                        currToken =  possibleToken;
                        break;
                    }
                }

                else {
                    System.out.println("sth wrong with greedy op");
                }
                startPos = currPos;

            } else {
                //number or letter
                if (currPos >= currLine.length() && lastContext == null) {
                    lastContext = currContext;
                }
                if (lastContext != null && (lastContext != currContext|| currPos >= currLine.length())) {
                    //switching or endline detected.
                    String possibleTokenString = currLine.substring(startPos, currPos-1);
                    //go back one slot.
                    currPos--;
                    //Number
                    if (lastContext == TokenContext.Number) {
                        Number possibleToken = new Number(possibleTokenString, lineNumber, startPos, currPos-1);
                        if (possibleToken.validate(' ')) {
                            possibleToken.setkwType(ReservedKeyWord.INT_LIT);
                            currToken = possibleToken;
                            break;
                        }
                    }

                    //Word
                    else if (lastContext == TokenContext.Word) {
                        //rule out keywords first
                        if (isKeyWord(possibleTokenString)) {
                            KeyWord possibleToken = new KeyWord(possibleTokenString, lineNumber, startPos, currPos-1);
                            possibleToken.setkwType(possibleToken.getTokenType());
                            currToken = possibleToken;
                            break;
                        }
                        //id
                        else {
                            Identifier possibleToken = new Identifier(possibleTokenString, lineNumber, startPos, currPos-1);
                            if (possibleToken.validate(' ')) {
                                possibleToken.setkwType(ReservedKeyWord.ID);
                                currToken = possibleToken;
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("sth wrong with number and word");
                    }
                }
            }
            startPos = currPos;
        }
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
        if (isNonGreedyOperator(c)) {
            context = TokenContext.NonGreedyOperator;
        } else if (isGreedyOperator(c)) {
            context = TokenContext.GreedyOperator;
        } else if (isLetter(c)) {
            context = TokenContext.Word;
        } else if (isNumber(c)) {
            context = TokenContext.Number;
            //currKWType = ReservedKeyWord.INT_LIT;
        } else{
            context = TokenContext.Unidentified;
            System.out.println(String.format("unidentified character%c at line: %d, col: %d",c,lineNumber,currPos-1));
        }
        return context;
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
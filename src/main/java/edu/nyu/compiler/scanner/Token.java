package edu.nyu.compiler.scanner; 

public class Token {
	private final int startCharPos; 
	private final int finishCharPos; 
	private final int lineNum; 
	private final String token; 

	public Token(String token, int lineNum, int startCharPos, int finishCharPos) {
		this.token = token; 
		this.lineNum = lineNum; 
		this.startCharPos = startCharPos; 
		this.finishCharPos = finishCharPos; 
	}

	public boolean isToken(String possibleToken) {
		return true; 
	}

	public String beautify() {
		return String.format("%s in line %d from %d to %d", token, lineNum, startCharPos, finishCharPos);
	}
}
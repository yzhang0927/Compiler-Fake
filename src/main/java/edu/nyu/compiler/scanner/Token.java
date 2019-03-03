package edu.nyu.compiler.scanner; 

public abstract class Token {
	private final int startCharPos; 
	private final int finishCharPos; 
	private final int lineNum; 
	private final String token; 
	private final ReservedKeyWord kwType; 

	public Token(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
		this.token = token; 
		this.lineNum = lineNum; 
		this.startCharPos = startCharPos; 
		this.finishCharPos = finishCharPos; 
		this.kwType = kwType; 
	}

	public String beautify() {
		return String.format("%s in line %d from char no. %d to %d", token, lineNum, startCharPos, finishCharPos);
	}

	public String getToken() {
		return token; 
	}

	public abstract boolean validate(Token prevToken); 
}
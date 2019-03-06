package edu.nyu.compiler.scanner; 

public abstract class Token {
	private final int startCharPos; 
	private final int finishCharPos; 
	private final int lineNum; 
	private final String token; 
	private ReservedKeyWord kwType;

	public Token(String token, int lineNum, int startCharPos, int finishCharPos) {
		this.token = token; 
		this.lineNum = lineNum; 
		this.startCharPos = startCharPos; 
		this.finishCharPos = finishCharPos; 
		this.kwType = null;
		System.out.println(this.token);
	}

	public String beautify() {
		return String.format("%s in line %d from char no. %d to %d", token, lineNum, startCharPos, finishCharPos);
	}

	public String getToken() {
		return token; 
	}
	public ReservedKeyWord getKwType() { return kwType; }

	public int getStartCharPos() { return startCharPos; }
	public int getFinishCharPos() { return finishCharPos; }
	public void setkwType(ReservedKeyWord kw){
		this.kwType = kw;
	}
	public abstract boolean validate(char prevChar);
}
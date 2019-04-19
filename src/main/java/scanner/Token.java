package scanner;

public abstract class Token {
	private final int startCharPos; 
	private final int finishCharPos; 
	private final int lineNum; 
	private String token;
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

	public ReservedKeyWord getTokenType(){
		for (ReservedKeyWord me : ReservedKeyWord.values()) {
			if (me.getKeywordString().equals(this.getToken()))
				return me;
		}
		System.out.println("not found");
		return null;
	}

	protected void setToken(String newToken) {
		this.token = newToken;
	}

	public String getToken() {
		return token; 
	}
	public ReservedKeyWord getKwType() { return kwType; }

	protected int getLineNum() {
		return lineNum;
	}

	public int getStartCharPos() { return startCharPos; }
	public int getFinishCharPos() { return finishCharPos; }
	public void setKWType(ReservedKeyWord kw){
		this.kwType = kw;
	}
	public abstract boolean validate(char prevChar);
}
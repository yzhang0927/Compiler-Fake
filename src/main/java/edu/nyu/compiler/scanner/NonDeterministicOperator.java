package edu.nyu.compiler.scanner; 

public class DeterministicOperator extends Operator {

	// We need a hashMap here for deterministic Operators

	public DeterministicOperator(String token, int lineNum, int startCharPos, int finishCharPos, ReservedKeyWord kwType) {
        super(token, lineNum, startCharPos, finishCharPos, kwType);  
    }
}
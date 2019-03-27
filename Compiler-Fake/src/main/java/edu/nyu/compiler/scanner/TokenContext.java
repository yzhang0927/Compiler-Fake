package edu.nyu.compiler.scanner; 

public enum TokenContext {
	Number, 
	GreedyOperator,
	NonGreedyOperator,
	Word,
	Space,
	Unidentified
}
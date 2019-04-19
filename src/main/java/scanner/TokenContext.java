package scanner;

public enum TokenContext {
	Number, 
	GreedyOperator,
	NonGreedyOperator,
	Word,
	Space,
	Unidentified
}
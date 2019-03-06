package edu.nyu.compiler.scanner;
import java.io.File;
import java.util.List;

class Test {
	public static void main(String[] args) {
		FakeCompilerScanner testScanner = new FakeCompilerScanner("p1test5.txt");
		printTokenInfo(testScanner.next());
        while (!testScanner.endOfFile()) {
			printTokenInfo(testScanner.next());
        }
	}

	public static void printTokenInfo(Token token) {
		if (token != null){
			System.out.println(token.getKwType());
			System.out.println(String.valueOf(token.getStartCharPos())+' '+ String.valueOf(token.getFinishCharPos()));
		} else {
			System.out.println("no more tokens on this line");
		}
		System.out.println("\n");
	}
}
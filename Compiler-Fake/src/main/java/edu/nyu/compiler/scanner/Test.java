package edu.nyu.compiler.scanner;
import java.io.File;
import java.util.List;

class Test {
	public static void main(String[] args) {

		//FakeCompilerScanner testScanner = new FakeCompilerScanner("p1test1.txt");
		//GreedyOperator test = new GreedyOperator("*", 1, 1, 4);
		//System.out.println(test.validate('d'));
		FakeCompilerScanner testScanner = new FakeCompilerScanner("p1test2.txt");

        while (!testScanner.endOfFile()) {

			System.out.println("~~~~~~>Line content<~~~~~~");
			System.out.println(testScanner.getLine());
			System.out.println("~~~~~~^Line content^~~~~~~");
			Token temp = testScanner.next();

			if (temp != null){
				System.out.println(temp.getToken());
			} else {
				System.out.println("no more tokens on this line");
			}

			System.out.println("\n");
        }



	}
}
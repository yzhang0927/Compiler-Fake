package edu.nyu.compiler.scanner;
import java.io.File;
import java.util.List;

class Test {
	public static void main(String[] args) {
		KeyWord test = new KeyWord("print", 1, 1, 4);
		System.out.println(test.validate('d'));

		NonGreedyOperator test2 = new NonGreedyOperator("(", 1, 1, 4);
		System.out.println(test2.validate('d'));

		FakeCompilerScanner testScanner = new FakeCompilerScanner("p1test3.txt");
		Token temp = testScanner.next();
		if (temp != null){
			System.out.println(temp.getKwType());
			System.out.println(' '+ String.valueOf(temp.getStartCharPos())+' '+ String.valueOf(temp.getFinishCharPos()));
		} else {
			System.out.println("no more tokens on this line");
		}
		System.out.println('\n');

        while (!testScanner.endOfFile()) {
			temp = testScanner.next();
			if (temp != null){
				System.out.println(temp.getKwType());
				System.out.println(' '+ String.valueOf(temp.getStartCharPos())+' '+ String.valueOf(temp.getFinishCharPos()));
			} else {
				System.out.println("no more tokens on this line");
			}

			System.out.println("\n");
        }



	}
}
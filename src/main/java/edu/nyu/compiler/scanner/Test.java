package edu.nyu.compiler.scanner;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

class Test {
	public static void main(String[] args){
		FakeCompilerScanner testScanner = new FakeCompilerScanner("p1test6");

		try {testScanner.next();} catch (NoSuchElementException e) {
		}
        while (!testScanner.endOfFile()) {
			testScanner.next();
        }
        //try to get last context switch
        try { testScanner.next();} catch (NoSuchElementException e) {
		}
		testScanner.finishOutput();
	}


}
package edu.nyu.compiler.scanner;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

class Test {
    private static final String TESTCASE_DIR = "testcases/p1test";
    private static final int TESTCASE_FIRST = 1; 
    private static final int TESTCASE_LAST = 5; 

    public static void main(String[] args){
        for (int i = TESTCASE_FIRST; i <= TESTCASE_LAST; ++i) {
            testOneCase(TESTCASE_DIR + Integer.toString(i)); 
        }
    }

    private static void testOneCase(String testCaseDirectory) {
        FakeCompilerScanner testScanner = new FakeCompilerScanner(testCaseDirectory);

        try {
            testScanner.next();
        } catch (NoSuchElementException e) {}

        while (!testScanner.endOfFile()) {
            testScanner.next();
        }
        
        //try to get last context switch
        try { 
            testScanner.next();
        } catch (NoSuchElementException e) {}

        testScanner.finishOutput();
    }
}
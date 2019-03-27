package edu.nyu.compiler.scanner;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

class Test {
    private static final String TESTCASE_DIR = "testcases/p1test";
    private static final int TESTCASE_FIRST = 1; 
    private static final int TESTCASE_LAST = 5; 
    private static FakeCompilerScanner testScanner; 

    public static void main(String[] args){
        if (args == null || args.length < 1 || args[0] == null) {
            throw new IllegalArgumentException("Null Input"); 
        }

        if ("txt".equals(args[0])) {
            for (int i = TESTCASE_FIRST; i <= TESTCASE_LAST; ++i) {
                testScanner = new FakeCompilerScanner(TESTCASE_DIR + i);
                testOneCase(); 
            }
        } else if ("command".equals(args[0])) {
            testScanner = new FakeCompilerScanner();
            testOneCase(); 
        } else {
            throw new IllegalArgumentException("first arg should be either 'txt' or 'command'"); 
        }
    }

    private static void testOneCase() {
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
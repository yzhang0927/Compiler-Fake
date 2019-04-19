package scanner;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class TestCompiler {
    private static final String TESTCASE_DIR = "testcases/p1test";
    private static final String TESTCASE_P2_DIR = "testcases/p2test";
    private static final int TESTCASE_FIRST = 1;
    private static final int TESTCASE_LAST = 5;
    private static final int TESTCASE_P2_LAST = 6;
    private static FakeCompilerScanner testScanner; 

    public static void main(String[] args){
        if (args == null || args.length < 1 || args[0] == null) {
            throw new IllegalArgumentException("Null Input"); 
        }

        if ("txt".equals(args[0])) {
            for (int i = TESTCASE_FIRST; i <= TESTCASE_LAST; ++i) {
                testScanner = new FakeCompilerScanner(TESTCASE_DIR + i);
                testOneCase(testScanner);
            }
            /* Testcase p2 */
            for (int i = TESTCASE_FIRST; i <= TESTCASE_P2_LAST; ++i) {
                testScanner = new FakeCompilerScanner(TESTCASE_P2_DIR + i);
                testOneCase(testScanner);
            }
        } else if ("command".equals(args[0])) {
            testScanner = new FakeCompilerScanner();
            testOneCase(testScanner);
        } else {
            throw new IllegalArgumentException("first arg should be either 'txt' or 'command'"); 
        }
    }

    public static void testOneCase(FakeCompilerScanner testScanner) {
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
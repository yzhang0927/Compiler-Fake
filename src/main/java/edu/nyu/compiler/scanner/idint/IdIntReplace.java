package edu.nyu.compiler.scanner.idint;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class IdIntReplace {

    private static final String TOO_LONG_ID_REPLACEMENT = "$ID$TOO$LONG";
    private static final String OUT_OF_BOUND_INT_REPLACEMENT = "-1";
    private static final String NUM_REGEX = "\\d+";
    private static final String TXT = ".txt";
    private static final String INT_ID_OUT = ".iio";

    public static void replaceFile(List<String> filePaths) throws IOException {
        for (String filePath : filePaths) {
            File file = new File(filePath + TXT);
            InputStream inputStream = new FileInputStream(file);
            PrintStream printStream = new PrintStream(filePath + INT_ID_OUT);
            replace(inputStream, printStream);
            printStream.flush();
            printStream.close();
            inputStream.close();
        }
    }

    /**
     * replace the invalid ID and number from the inputstream
     * and output the replaced stream to the printstream
     * @param inputStream
     * @param printStream
     */
    public static void replace(InputStream inputStream, PrintStream printStream) {
        Scanner scanner = new Scanner(inputStream);
        int countTooLongID = 0;
        String currOutputString;
        while (scanner.hasNext()) {
            currOutputString = scanner.next();
            if (currOutputString.length() > 80) {
                currOutputString = TOO_LONG_ID_REPLACEMENT + countTooLongID++;
            } else if (currOutputString.matches(NUM_REGEX)) {
                try {
                    Integer.parseInt(currOutputString);
                } catch (NumberFormatException nfe) {
                    currOutputString = OUT_OF_BOUND_INT_REPLACEMENT;
                }
            }
            printStream.append(currOutputString + " ");
        }
    }
}

package edu.nyu.compiler.scanner.idint;

import java.io.InputStream;
import java.util.Scanner;

public class IdIntReplace {
    public void replace(InputStream stream) {
        Scanner scanner = new Scanner(stream);
        while (scanner.hasNext()) {
            if (scanner.next().length() > 80) {

            }
        }
    }
}

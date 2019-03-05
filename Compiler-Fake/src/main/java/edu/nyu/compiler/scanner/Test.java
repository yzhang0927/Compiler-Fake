package edu.nyu.compiler.scanner;
import java.io.File;
import java.util.List;

class Test {
	public static void main(String[] args) {
		File file = new File("src/test.txt");
		FakeCompilerScanner testScanner = new FakeCompilerScanner();

		String testText = "*** this test file contains all the legal tokens in the language, I believe\n" +
				"*** this is a comment\n" +
				"*** all keywords\n" +
				"array\n" +
				"defun\n" +
				"do\n" +
				"else\n" +
				"elsif\n" +
				"end\n" +
				"foreach\n" +
				"global\n" +
				"if\n" +
				"in\n" +
				"local\n" +
				"print\n" +
				"return\n" +
				"then\n" +
				"tuple\n" +
				"while\n" +
				"*** all operators and other punctuation\n" +
				"!=\n" +
				"(\n" +
				")\n" +
				"*\n" +
				"+\n" +
				",\n" +
				"-\n" +
				".\n" +
				"..\n" +
				"/\n" +
				";\n" +
				"<\n" +
				"<->\n" +
				"<=\n" +
				"=\n" +
				"==\n" +
				">\n" +
				">=\n" +
				"[\n" +
				"]\n" +
				"*** numbers\n" +
				"0\n" +
				"000\n" +
				"30\n" +
				"47\n" +
				"*** too large a value\n" +
				"9999999999999999999999\n" +
				"*** you decide what to do with this: the number is long but not large\n" +
				"0000000000000000000000\n" +
				"*** ID\n" +
				"_\n" +
				"a\n" +
				"aa\n" +
				"aba\n" +
				"abdac\n" +
				"_I_am_ID\n" +
				"_I_might_be_considered_too_long *** OK to produce a warning here, or not to\n" +
				"*** the ID below is DEFINITELY too long\n" +
				"this_is_a_definitely_way_too_long_ID_no_questions_about_it_yeah_yeah_yeah_yeah_yeah_yeah_yeah";


		String test2 = "*** scanner test 2\n" +
				"*** this comment contains something that looks like legal code: a=1; b=a+b;\n" +
				"*** but it's still just a comment!!!!\n" +
				"\n" +
				"*** this is just garbage...\n" +
				"####!@#%^}}{\n" +
				"\\\n" +
				"\\\\!#@!$\n" +
				"*** end of garbage";

        while (!testScanner.endOfFile()) {
        }
	}
}
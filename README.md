# Compiler Design Second Phase Parser

- It would be best for you to use IntelliJ to run this project
  - If you are using intelliJ, idea should be able to recognize the main.iml file and generate all the dependency for you
 
- If it's not working for you, you can manually add all the dependencies
  - Go to project structure, and select dependency, and add new, and add ./lib/antlr-4.7.2-complete.jar as a dependency
  - Inside project structure, select src/main/java as the source folder
  - invoke the main method in the TestMain class, and you will be able to see how we generated parsetrees for the testcases input.  

# Compiler Design First Phase Scanner

- To Compile
  - You have to type the two following commands one by one
  - BUT First, you need to change the current working directory to the root folder /Compiler-Fake
  - $ mkdir target
  - $ javac -sourcepath src/main/java/ -d target src/main/java/edu/nyu/compiler/scanner/Test.java 

- Test Cases
  - Testcases live in the folder /testcases
  - There are 5 testcases which are written, and the [6th testcase](testcases/p1test6.txt) is empty 

- To Run
  - Run with built in testcases $ java -cp target edu.nyu.compiler.scanner.Test txt
  - Run with command line input $ java -cp target edu.nyu.compiler.scanner.Test command
    - Then you have to `ctrl + c` to exit the program. Sorry that I didn't build a graceful way out.. 

- Now to look at the code from the Entry Point
  - The program's entry point is [Test](src/main/java/edu/nyu/compiler/scanner/TestCompiler.java)
  - Then it instantiates a Scanner at [FakeCompilerScanner](src/main/java/edu/nyu/compiler/scanner/FakeCompilerScanner.java)
  - Then the scanner reads each line and delegates the task of figuring out each line's input to [LineInput](src/main/java/edu/nyu/compiler/scanner/LineInput.java)

- A little on the algorithm
  - So we observed that there are three types of context, number, word(id & keyword), operators. Whenever the scanner encounters certain kinds of characters, it switches from one context to another and attempt to break whatever it eats in last into sensible pieces and validates whatever it eats. 
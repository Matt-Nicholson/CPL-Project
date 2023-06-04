package SCL;





import SCL.LexicalAnalyzer;
import SCL.SyntaxAnalyzer;
import java.io.*;






public class Interpreter {

	
	
	
	
	
	
	public static void main(String[] args ) {

        // check to see if argument was provided correctly for filename.ext
        if (args.length == 0) {
            System.out.println("Error: No filename was given.  Syntax: Interpreter [filename.ext]");
        } else {

            // create a file object using the filename provided by command line
            File file = new File(args[0]);

            // check to see if file exists
            if (!file.isFile()) {
                System.out.println("Error: No filename exists at: " + file.toString());
            } else {

                // create Lexical Analyzer object to scan files with
                LexicalAnalyzer lexer = new LexicalAnalyzer();

                lexer.analyze(file);
                // create Syntax Analyzer object to parse tokens
                SyntaxAnalyzer parser = new SyntaxAnalyzer(lexer);

                parser.parse();


                // show resulting token list after lexical analysis of the file
                // DisplayTokens(tokens);

            }
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
}

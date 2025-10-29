package piglatin;
import java.util.Scanner;
public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();
        int numLines = input.getLineCount();
        for (int i = 0; i < numLines; i++) {
            String line = input.getLine(i);          
            String translatedLine = translate(line); 
            translatedBook.appendLine(translatedLine);
        }
        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";
        if(input.length()==0){
            return "";
        }
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            String Word = scanner.next();
            if(result.length()>0){
                result = result + "";
            }
            result = result + translateWord(Word);
        }
        scanner.close();


        if(result.length()==0){
            return "";
        }
        
        

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";
        String vowels = "AEIOUYaeiouy";


        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        result = input; // delete this line
        if(input.length()==0){
            return "";
        }
        //find the first vowel
        //divide the string into two parts which is the part before the vowel and after the vowel
        //and have a result of the string + ay

        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}

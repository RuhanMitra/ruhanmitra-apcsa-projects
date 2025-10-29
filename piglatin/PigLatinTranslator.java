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
                result = result + " ";
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
        char lastChar = input.charAt(input.length() - 1);
        boolean hasPunct = !Character.isLetterOrDigit(lastChar);
        String punctuation = hasPunct ? String.valueOf(lastChar) : "";
        if (hasPunct) {
            input = input.substring(0, input.length() - 1);
        }
        boolean isCapital = Character.isUpperCase(input.charAt(0));
        String lowerWord = input.toLowerCase();

        int vowelIndex = -1;
        for (int i = 0; i < lowerWord.length(); i++) {
            if (vowels.indexOf(lowerWord.charAt(i)) >= 0) {
                vowelIndex = i;
                break;
            }
        }

        if (vowelIndex == 0) {
            result = lowerWord + "ay";
        } else if (vowelIndex > 0) {
            result = lowerWord.substring(vowelIndex) + lowerWord.substring(0, vowelIndex) + "ay";
        } else {
            result = lowerWord + "ay";
        }

        if (isCapital && result.length() > 0) {
            result = Character.toUpperCase(result.charAt(0)) + result.substring(1).toLowerCase();

        }

        result = result + punctuation;
        return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)

}

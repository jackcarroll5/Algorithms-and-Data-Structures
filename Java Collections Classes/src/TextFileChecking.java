import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TextFileChecking {

    public static void main(String[] args) {

     Set<String> dictionary = TextFileChecking.createDictionary();






    }

    public static Set<String> createDictionary()
    {
        Set<String> dictionary = new HashSet<>();
        Set<String> dictionaryAlt = new TreeSet<>();

        String fileName = "words_alpha.txt";
        String word;

        try {
            Scanner in = new Scanner(new File(fileName));
            // Use any characters other than a-z, A-Z as delimiters
            in.useDelimiter("[^a-zA-Z]+");
            while (in.hasNext()) {
                word = in.next().toLowerCase();
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } //Add and contains

   return dictionary;
    }
}

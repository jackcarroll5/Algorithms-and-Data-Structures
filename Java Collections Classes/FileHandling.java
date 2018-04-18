import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "Test.txt";
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
        }
    }
}
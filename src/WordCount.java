import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("98-0.txt");
        Scanner scanner = new Scanner(file);

        int wordCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // get next line from the file
            String[] wordsInLine = line.split(" "); // for example, "Hello world" becomes ["Hello", "world"]
            wordCount += wordsInLine.length;
        }
         System.out.print("File consist " + wordCount + " words");
    }
}

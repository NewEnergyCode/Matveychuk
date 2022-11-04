import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, File> bookLibrary = new HashMap<>();
        bookLibrary.put("ГИД JAVA", new File("src/Library/ГИД JAVA.txt"));
        bookLibrary.put("New Book", new File("src/Library/New Book.txt"));
        bookLibrary.put("Verse", new File("src/Library/Verse.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        if (bookLibrary.containsKey(bookName)) {

            CountingWordsInBook countingWordsInBook = new CountingWordsInBook();
            countingWordsInBook.uniqueWordsCounter(bookLibrary.get(bookName));
            countingWordsInBook.sortBooksAndPrintMorePorulare();

        } else {
            System.out.println("Your book is not found!");
        }
    }
}




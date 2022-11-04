import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Map<String, File> bookLibrary = new HashMap<>();
        bookLibrary.put("ГИД JAVA", new File("src/Library/ГИД JAVA.txt"));
        bookLibrary.put("New Book", new File("src/Library/New Book.txt"));
        bookLibrary.put("Verse", new File("src/Library/Verse.txt"));

        Map<String, String> bookStatistic = new HashMap<>();
        bookStatistic.put("ГИД JAVA", "src/Library/New Book_statistic.txt");
        bookStatistic.put("New Book", "src/Library/Verse_statistic.txt");
        bookStatistic.put("Verse", "src/Library/ГИД JAVA_statistic.txt");
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




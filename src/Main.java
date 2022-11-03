import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, File> bookLibrary = new HashMap<>();
        bookLibrary.put("ГИД JAVA", new File("src/Library/ГИД JAVA.txt"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        if (bookLibrary.containsKey(bookName)) {
            CountingWordsInBook cwb = new CountingWordsInBook();
            CountingWordsInBook countingWordsInBook = new CountingWordsInBook();
            countingWordsInBook.uniqueWordsCounter(bookLibrary.get("ГИД JAVA"));
            countingWordsInBook.sortBySize();
//            System.out.println(countingWordsInBook.uniqueWordsCounter(bookLibrary.get("ГИД JAVA")));
        }else {
            System.out.println("Your book is not found!");
        }
    }
}




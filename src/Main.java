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

        CountingWordsInBook cwb = new CountingWordsInBook();

        Map<String, File> bookLibrary = new HashMap<>();
        bookLibrary.put("ГИД JAVA", new File("src/Library/ГИД JAVA.txt"));

        CountingWordsInBook countingWordsInBook = new CountingWordsInBook();
        System.out.println(countingWordsInBook.uniqueWordsCounter(bookLibrary.get("ГИД JAVA")));

    }
}




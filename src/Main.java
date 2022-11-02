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


//        try (FileReader fileReader = new FileReader(bookLibrary.get("ГИД JAVA"));
//             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
//            Map<String, Integer> uniqueWords = new HashMap<>();
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] words = cwb.removeExtraCharacters(line);
//
//                for (String s : words) {
//                    if (s.length() < 3) continue;
//                    if (uniqueWords.containsKey(s)) uniqueWords.put(s, uniqueWords.get(s) + 1);
//                    else uniqueWords.put(s, 1);
//                }
//
//            }
//            System.out.println(uniqueWords);
//        } catch (IOException e) {
//            System.out.println("File not found!");
//            throw new RuntimeException(e);
//        }

    }
}




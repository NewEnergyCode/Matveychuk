import java.io.*;
import java.util.*;

public class CountingWordsInBook {
    private static final String bookDividersForSplit = "•!,[].{}:;«»/`'’()<>?*|\"~•";
    private final Map<String, Integer> uniqueWords = new HashMap<>();
    private String path;

    public void uniqueWordsCounter(File file) {
        if (file.getName().equals("Verse.txt")) path = "src/Library/Verse_statistic.txt";
        else if (file.getName().equals("New Book.txt")) path = "src/Library/New Book_statistic.txt";
        else if (file.getName().equals("ГИД JAVA.txt")) path = "src/Library/ГИД JAVA_statistic.txt";
        System.out.println(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = removeExtraCharacters(line);

                for (String s : words) {
                    if (s.length() < 3) continue;
                    if (uniqueWords.containsKey(s)) uniqueWords.put(s, uniqueWords.get(s) + 1);
                    else uniqueWords.put(s, 1);
                }
            }
        } catch (IOException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
        sortBooksAndPrintMorePopulare();
    }


    public String[] removeExtraCharacters(String line) {
        for (Character s : bookDividersForSplit.toCharArray()) {
            line = line.replace(s.toString(), "");
        }
        return line.toLowerCase().split(" ");
    }

    public void sortBooksAndPrintMorePopulare() {

        List<Map.Entry<String, Integer>> sortAmount = new ArrayList<>(uniqueWords.entrySet());
        sortAmount.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        }.reversed());
        printFirstTenWords(sortAmount);
    }

    public void printFirstTenWords(List<Map.Entry<String, Integer>> list) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);

            int a = 0;
            int b = 0;

            for (Map.Entry<String, Integer> entry : list) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(a + 1 + ". " + key + ": " + value);
                String aa = "\n" + (a + 1) + ". " + key + ": " + value;
                try {
                    fileOutputStream.write(aa.getBytes());
                } catch (IOException e) {
                    System.out.println("File not found!");
                    throw new RuntimeException(e);
                }
                a++;
                if (a > 9)
                    break;
            }
            for (Map.Entry<String, Integer> i : list) {
                if (i.getValue().equals(1)) b++;
            }
            System.out.println("Uniqueness words: " + b);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        }
    }

}

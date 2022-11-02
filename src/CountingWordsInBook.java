import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountingWordsInBook {
    private static final String bookDividersForSplit = "•!,[].{}:;«»/`'’()<>?*|\"~•";

    Map<String, Integer> uniqueWords = new HashMap<>();

    public Map<String, Integer> uniqueWordsCounter(File file) {
//        Map<String, Integer> uniqueWords = new HashMap<>();
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
        return uniqueWords;
    }


    public String[] removeExtraCharacters(String line) {
        for (Character s : bookDividersForSplit.toCharArray()) {
            line = line.replace(s.toString(), "");
        }
        return line.toLowerCase().split(" ");
    }


    public List<BooksLibrary> sortBySize(File file) {

        List<BooksLibrary> sortBySize = new ArrayList<>();
        for (String num : uniqueWords.keySet()) {
            sortBySize.addAll(uniqueWords.get(num));
        }
        Collections.sort(sortBySize, new Comparator<BooksLibrary>() {
            @Override
            public int compare(BooksLibrary o1, BooksLibrary o2) {
                return o1.getAmountwords() - o2.getAmountwords();
            }

        });


        return sortBySize;
    }


}

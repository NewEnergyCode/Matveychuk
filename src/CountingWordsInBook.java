public class CountingWordsInBook {
    private static final String bookDividersForSplit = "•!,[].{}:;«»/`'’()<>?*|\"~•";







    public String[] removeExtraCharacters(String line) {
        for (Character s : bookDividersForSplit.toCharArray()) {
            line = line.replace(s.toString(), "");
        }
        return line.toLowerCase().split(" ");
    }
}

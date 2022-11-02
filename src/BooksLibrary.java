import java.io.File;


public class BooksLibrary {

    private String name;

    private Integer amountwords;

    public BooksLibrary(String name, Integer amountwords) {
        this.name = name;

        this.amountwords = amountwords;
    }

    public Integer getAmountwords() {
        return amountwords;
    }

    public void setAmountwords(Integer amountwords) {
        this.amountwords = amountwords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "BooksLibrary{" +
                "name='" + name + '\'' +
                '}';
    }
}

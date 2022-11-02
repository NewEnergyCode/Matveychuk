import java.io.File;


public class BooksLibrary {

    private String name;

    private File file = new File ("src/Library");

    public BooksLibrary(String name, File file) {
        this.name = name;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "BooksLibrary{" +
                "name='" + name + '\'' +
                ", file=" + file +
                '}';
    }
}
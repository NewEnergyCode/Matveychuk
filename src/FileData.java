import java.util.ArrayList;

public class FileData extends ArrayList<FileData> {

    private  String fileName;
    private int sizeInByte;
    private  String path;

    public FileData(String fileName, int sizeInByte, String path) {
        this.fileName = fileName;
        this.sizeInByte = sizeInByte;
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getSizeInByte() {
        return sizeInByte;
    }

    public void setSizeInByte(int sizeInByte) {
        this.sizeInByte = sizeInByte;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", sizeInByte=" + sizeInByte +
                ", path='" + path + '\'' +
                '}';
    }
}

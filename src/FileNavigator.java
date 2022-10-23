import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {
    Map<String, ArrayList<FileData>> fileListMap = new HashMap<>();

    public void add(String path, FileData fileData) {
        if (!fileListMap.containsKey(path)) {
            fileListMap.put(path, new ArrayList<FileData>());
            fileListMap.get(path).add(fileData);
        } else {
            fileListMap.get(path).add(fileData);
        }
        System.out.println(fileListMap.containsKey(path));
        System.out.println(fileListMap.get(path));
    }


    public ArrayList<FileData> find(String path) {
        for (FileData s : fileListMap.get(path)) {
            if (fileListMap.containsKey(path)) {
                return fileListMap.get(path);
            }
        }
        return null;
    }
}






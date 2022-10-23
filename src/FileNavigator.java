import javax.management.ObjectName;
import java.util.*;

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

    public List<FileData> filterBySize(int size) {
        System.out.println("your key: " + fileListMap.values());
        List<FileData> sizeBite = new ArrayList<>();
        for (String key : fileListMap.keySet()) {
            for (FileData s : fileListMap.get(key)) {
                if (s.getSizeInByte() <= size) {
                    sizeBite.add(s);
                }
            }
        }
        return sizeBite;
    }

    public void remove(String path) {
        for (FileData s : fileListMap.get(path)) {
            if (fileListMap.containsKey(path)) {
                fileListMap.remove(path);
                System.out.println(fileListMap);

            }
        }

    }

    public List<FileData> sortBySize() {

        List<FileData> sortBySize = new ArrayList<>();
        for (String key : fileListMap.keySet()) {
            sortBySize.addAll(fileListMap.get(key));
        }
        Collections.sort(sortBySize, new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                return o1.getSizeInByte() - o2.getSizeInByte();
            }
        });


        return sortBySize;
    }

}









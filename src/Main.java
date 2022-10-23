import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        FileNavigator fileNavigator = new FileNavigator();

        FileData firstFileData = new FileData("FirstFileforExample", 1, "c:/path/add");
        FileData secondFileData = new FileData("SecondFileforExample", 3, "c:/path/add/one");
        FileData thirdFileData = new FileData("ThirdFileforExample", 5, "c:/path/add");
        FileData fourthFileData = new FileData("FourthFileforExample", 14, "c:/path/add/one");


        fileNavigator.add(firstFileData.getPath(), firstFileData);
        fileNavigator.add(secondFileData.getPath(), secondFileData);
        fileNavigator.add(thirdFileData.getPath(), thirdFileData);
        fileNavigator.add(fourthFileData.getPath(), fourthFileData);
        System.out.println("""
                In entered`s you path situated next list: \n""" +
                fileNavigator.find("c:/path/add/one"));

        System.out.println("""
                In entered`s you sizes are next files: \n""" +
                fileNavigator.filterBySize(4));

//        fileNavigator.remove("c:/path/add");
        System.out.println("""
                Before sorts: \n""" + fileNavigator.fileListMap +
                "\nAfter sorts: \n" +
                fileNavigator.sortBySize());

    }
}


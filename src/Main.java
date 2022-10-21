public class Main {

    public static void main(String[] args) {


        FileNavigator fileNavigator = new FileNavigator();

        FileData firstFileData = new FileData("FirstFileforExample", 1, "c:/path/add");
        FileData secondFileData = new FileData("SecondFileforExample", 3, "c:/path/add/one");
        FileData thirdFileData = new FileData("ThirdFileforExample", 5, "c:/path/add");


        fileNavigator.add("c:/path/add", firstFileData);
        fileNavigator.add("c:/path/addd", secondFileData);
        fileNavigator.add("c:/path/add", thirdFileData);
    }
}

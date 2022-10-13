package HomeWork9.User;

import java.util.Scanner;

public class Cat extends User {
    public static String name;


    @Override
    public String userInfo() {
        System.out.println("Enter cat`s name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        return name;
    }

}

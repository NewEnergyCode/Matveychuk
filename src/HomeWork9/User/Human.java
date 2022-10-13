package HomeWork9.User;

import java.util.Scanner;

public class Human extends User {
    public static String name;

    @Override
    public String userInfo() {
        System.out.println("Enter human`s name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        return name;

    }

}

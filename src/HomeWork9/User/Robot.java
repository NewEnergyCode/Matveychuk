package HomeWork9.User;

import java.util.Scanner;

public class Robot extends User {
    public static String name;
    public static int magnitude;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Robot.name = name;
    }

    @Override
    public String userInfo() {
        System.out.println("Enter robot`s name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        return name;
    }

}

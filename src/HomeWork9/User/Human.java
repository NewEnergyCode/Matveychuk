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

    @Override
    public User overcomeWall() {

        Obstacle wall = new Wall();
        wall.magnitude();

        System.out.println("Human " + name + " overcoming " + Wall.magnitude + " cm.");

        return null;
    }

    public User overcomeTread() {
        Obstacle tread = new Treadmill();
        tread.magnitude();
        System.out.println("Human " + name + " overcoming " + Treadmill.magnitude + " cm.");
        return null;
    }
}

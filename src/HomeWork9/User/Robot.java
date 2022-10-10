package HomeWork9.User;

import java.util.Scanner;

public class Robot extends User {
    public static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Robot.name = name;
    }

    @Override
    public String userInfo() {
        System.out.println("Enter robot`s name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

return name;
    }

    @Override
    public User overcomeWall() {

        Obstacle wall = new Wall();
        wall.magnitude();
        if (Wall.magnitude < 50){
            System.out.println(name + " Game over");
                }else {

            System.out.println("Robot " + name + " overcoming wall " + Wall.magnitude + " cm.");
        }
//        System.out.println("Robot " + name + " overcoming " + Wall.magnitude + " cm.");

        return null;
    }

    public User overcomeTread() {
        Obstacle tread = new Treadmill();
        tread.magnitude();
        if (Treadmill.magnitude < 50){
            System.out.println("User robot " + name + " Game over. " + name + "run " + Treadmill.magnitude);
        }else {

            System.out.println("Robot " + name + " overcoming treadmill " + Treadmill.magnitude + " cm.");
        }
        return null;
    }
}

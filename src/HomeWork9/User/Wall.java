package HomeWork9.User;

import java.util.Scanner;

public class Wall extends Obstacle {
    public static int magnitude;

    @Override
    public String overcomeWall(String user) {

        Obstacle wall = new Wall();

        wall.magnitude();

        if (magnitude <= 220 && magnitude >= 50) {
            System.out.println(user + " overcoming wall " + magnitude + " cm.");
            Obstacle tread = new Treadmill();
            tread.overcomeTreadmill(user);
        } else {
            System.out.println(user + " jump " + magnitude + " cm. Game over");

        }

        return null;
    }

    @Override
    public String overcomeTreadmill(String user) {
        return null;
    }


    @Override
    public String magnitude() {
        System.out.println("Enter wall`s magnitude: ");
        Scanner scanner = new Scanner(System.in);
        magnitude = scanner.nextInt();
        return null;
    }


}

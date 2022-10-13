package HomeWork9.User;

import java.util.Scanner;

public class Treadmill extends Obstacle {
    public static int magnitude;


    @Override
    public String magnitude() {
        System.out.println("Enter treadmill`s magnitude: ");
        Scanner scanner = new Scanner(System.in);
        magnitude = scanner.nextInt();

        return null;
    }

    @Override
    public String overcomeWall(String name) {
        return null;
    }

    @Override
    public String overcomeTreadmill(String user) {
        Obstacle treadmill = new Treadmill();

        treadmill.magnitude();

        if (magnitude <= 220 && magnitude >= 50) {
            System.out.println(user + " overcoming treadmill " + magnitude + " m.");
        } else {
            System.out.println(user + " run " + magnitude + " m. Game over");

        }
        return null;
    }
}

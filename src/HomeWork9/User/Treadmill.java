package HomeWork9.User;

import java.util.Scanner;

public class Treadmill extends Obstacle {
    public static int magnitude;


    @Override
    public void magnitude() {
        System.out.println("Enter treadmill`s magnitude: ");
        Scanner scanner = new Scanner(System.in);
        magnitude = scanner.nextInt();

    }
}

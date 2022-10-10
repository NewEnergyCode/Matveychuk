package HomeWork9.User;

import java.util.Scanner;

public class Wall extends Obstacle {

    public static int magnitude;


    @Override
    public void magnitude() {
        System.out.println("Enter wall`s magnitude: ");
        Scanner scanner = new Scanner(System.in);
        magnitude = scanner.nextInt();

    }


}

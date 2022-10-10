package HomeWork9;

import java.util.Scanner;

public class Triangle implements GeometricFigure {
    double h;
    double side;

    @Override
    public double calculateFigureArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter triangle h: ");
        h = scanner.nextDouble();
        System.out.print("Enter triangle side: ");
        side = scanner.nextDouble();
        double sTriangle = (0.5 * side) * h;
        return sTriangle;
    }
}

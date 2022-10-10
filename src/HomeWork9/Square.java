package HomeWork9;

import java.util.Scanner;

public class Square implements GeometricFigure {

    double side1;
    double side2;

    @Override
    public double calculateFigureArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first square side: ");
        side1 = scanner.nextDouble();
        System.out.print("Enter second square side: ");
        side2 = scanner.nextDouble();
        double sSquare = side1 * side2;
        return sSquare;
    }
}

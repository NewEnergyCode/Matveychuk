package HomeWork9;

import java.util.Scanner;

public class Circle implements GeometricFigure {
    double radius;

    @Override
    public double calculateFigureArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

}

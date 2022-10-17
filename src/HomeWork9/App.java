package HomeWork9;


public class App {

    public static double sumGeometricFigure;

    public static void main(String[] args) {



        GeometricFigure[] shapes = {new Circle(), new Triangle(), new Square()};


        for (GeometricFigure s: shapes) {
            
        sumGeometricFigure = sumGeometricFigure + s.calculateFigureArea();
        }
        System.out.print("The sum of the areas of figures: " + sumGeometricFigure);


    }
}


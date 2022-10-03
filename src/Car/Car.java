package Car;

public class Car {

    public static void start() {

        startElectricity();

        startCommand();

        startFuelSystem();
    }

    private static void startElectricity() {
        System.out.println("Start engine.");
    }

    private static void startCommand(){
        System.out.println("Select radio.");
    }

    private static void startFuelSystem(){
        System.out.println("Start moving.");
    }
}



package Car;

public class Car {

    public void start() {

        startElectricity();

        startCommand();

        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start engine.");
    }

    private void startCommand() {
        System.out.println("Select radio.");
    }

    private void startFuelSystem() {
        System.out.println("Start moving.");
    }
}

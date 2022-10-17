package HomeWork7;

public class Animal {
    private String name;
    private int swimDistance;
    private int runDistance;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Animal() {
        count++;
    }

    public void swimming(String name, int swimDistance) {
        count++;
        System.out.println("You " + name + "swim" + swimDistance + " metres ");
    }

    public void running(String name, int runDistance) {
        count++;
        System.out.println("You " + name + "run" + runDistance);
    }
}

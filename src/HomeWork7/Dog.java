package HomeWork7;

public class Dog extends Animal {

    private static int count;
    public Dog() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public void running(String name, int runDistance) {
//        count++;
        if (runDistance > 500) {
            System.out.println(runDistance + " metres it is Unreal!");
        } else {
            System.out.println("You dog " + name + " run " + runDistance + " metres ");
        }
    }

    public void swimming(String name, int swimDistance) {
//        count++;
        if (swimDistance > 10) {
            System.out.println(swimDistance + " metres it is Unreal!");
        } else {
            System.out.println("You dog " + name + " swim " + swimDistance + " metres ");
        }
    }
}

package HomeWork7;

public class Cat extends Animal {
    private static int count;
    public Cat() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public void running(String name, int runDistance) {
//        count++;
        if (runDistance > 200) {
            System.out.println(runDistance + " metres it is Unreal!");
        } else {
            System.out.println("You cat " + name + " run " + runDistance + " metres ");

        }
        }

    public void swimming (String name,int swimDistance){
//        count++;
        if (swimDistance > 0) {
            System.out.println("You cat " + name + " can not swim");
        } else {
            System.out.println("You cat " + name + " run " + swimDistance + " metres ");

        }

    }
}

package HomeWork9.User;

public abstract class User {


    public int magnitude;
    private static String name;

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String userInfo();




}

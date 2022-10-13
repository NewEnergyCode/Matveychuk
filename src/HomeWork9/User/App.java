package HomeWork9.User;

public class App {

    public static void main(String[] args) {

        Obstacle[] obstacles = new Obstacle[]{new Wall(), new Treadmill()};


        User[] users = new User[]{new Robot(), new Cat(), new Cat(), new Human()};


        for (int y = 0; y <= users.length - 1; y++) {

            String name = users[y].userInfo();

            for (int i = 0; i <= obstacles.length - 1; i++) {
                obstacles[i].overcomeWall(name);

            }

        }
    }

}



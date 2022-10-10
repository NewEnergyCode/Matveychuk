package HomeWork9.User;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Wall();
        obstacles[1] = new Treadmill();


        User[] users = new User[3];
        users[0] = new Robot();
        users[1] = new Cat();
        users[2] = new Human();


        for (int y = 0; y <= users.length - 1; y++) {
            users[y].userInfo();

            for (int i = 0; i <= obstacles.length - 1; i++) {

                users[y].overcomeWall();
//                obstacles[i].magnitude();
                if (Wall.magnitude < 50) {
                    break;
                }
                users[y].overcomeTread();
                if (Treadmill.magnitude < 500) {
                    break;
                }
            }

        }
    }

//        User robot = new Robot();
//        robot.userInfo();
//        robot.overcomeWall();


}



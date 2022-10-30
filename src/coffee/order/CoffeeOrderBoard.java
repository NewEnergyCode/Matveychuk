package coffee.order;

import java.util.LinkedList;
import java.util.Scanner;

public class CoffeeOrderBoard {


    public static void main(String[] args) {

        LinkedList<Order> coffeOrderBoarb = new LinkedList<>();
        coffeOrderBoarb.addLast(addOrder());
        coffeOrderBoarb.addLast(addOrder());
        coffeOrderBoarb.addLast(addOrder());
        coffeOrderBoarb.addLast(addOrder());
        coffeOrderBoarb.addLast(addOrder());


        System.out.println(delivery(coffeOrderBoarb));
        System.out.println(deliverySpecial(coffeOrderBoarb));
        System.out.println(coffeOrderBoarb);
    }

    public static Order addOrder() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client name: ");

        return new Order(scanner.nextLine(), Order.getCount());
    }

    public static LinkedList<Order> delivery(LinkedList<Order> coffeOrderBoarb) {

               coffeOrderBoarb.pollFirst();

        return coffeOrderBoarb;
    }

    public static LinkedList<Order> deliverySpecial(LinkedList<Order> coffeOrderBoarb) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client number: ");
        coffeOrderBoarb.remove(scanner.nextInt()-1);

        return coffeOrderBoarb;
    }

}

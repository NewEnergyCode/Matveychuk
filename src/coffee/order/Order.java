package coffee.order;

public class Order {

    private String nameClient;
    private int numberClientOrder;
    private static int count=1;


    public static int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Order(String nameClient, Integer numberClientOrder) {
        this.nameClient = nameClient;
        this.numberClientOrder = numberClientOrder;
        count++;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getNumberClientOrder() {
        return numberClientOrder;
    }

    public void setNumberClientOrder(int numberClientOrder) {
        this.numberClientOrder = numberClientOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameClient='" + nameClient + '\'' +
                ", numberClientOrder=" + numberClientOrder +
                '}';
    }
}

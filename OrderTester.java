package Homework_5;
public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);
        orderQueue.addOrder("Customer 1", "01/04/2024", 5);
        orderQueue.addOrder("Customer 2", "02/04/2024", 5);
        orderQueue.addOrder("Customer 3", "03/04/2024", 8);

        System.out.println(orderQueue);

        orderQueue.sellRemainingStock();

        System.out.println(orderQueue);

        orderQueue.addStock(10);
        orderQueue.addOrder("Customer 4", "04/04/2024", 3);
        orderQueue.addOrder("Customer 5", "05/04/2024", 3);
        orderQueue.addOrder("Customer 6", "06/04/2024", 5);

        orderQueue.sellRemainingStock();

        System.out.println(orderQueue);
    }
}

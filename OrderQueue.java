package Homework_5;
public class OrderQueue {
    private LinkedQueue<CustomerOrder> orderQueue;
    private int stock;
    public OrderQueue() {
        this.orderQueue = new LinkedQueue<>();
        this.stock = 0;
    }

    public OrderQueue(int stock) {
        this.orderQueue = new LinkedQueue<>();
        this.stock = stock;
    }

    public void addOrder(String name, String date, int quantity) {
        CustomerOrder newOrder = new CustomerOrder(name, date, quantity);
        orderQueue.enqueue(newOrder);
    }

    public void addStock(int additionalStock) {
        stock += additionalStock;
    }

    public void fulfillOrder() {
        if (!orderQueue.isEmpty()) {
            CustomerOrder currentOrder = orderQueue.getFront();
            currentOrder.shipProduct();
            stock--;
            if (currentOrder.quantity == 0) {
                orderQueue.dequeue();
            }
        }
    }

    public void sellRemainingStock() {
        while (stock > 0 && !orderQueue.isEmpty()) {
            fulfillOrder();
        }
    }

    public String toString() {
        return Integer.toString(orderQueue.getFront().quantity);
    }

    // Getters and setters if needed
}

package Homework_5;
public class CustomerOrder {
    int quantity;

    public CustomerOrder() {
        this.quantity = 0;
    }

    public CustomerOrder(String name, String date, int quantity) {
        this.quantity = quantity;
    }

    public void shipProduct() {
        if (quantity > 0) {
            quantity--;
        }
    }

    // Getters and setters if needed
}


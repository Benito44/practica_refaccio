import java.util.List;

public class Order {
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        // REFACTOR 5: Metode Inline Temp
        return subtotal + (subtotal * taxRate);
        /*
        double tax = subtotal * taxRate;
        return subtotal + tax;
         */
    }
}

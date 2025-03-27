class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking #: " + trackingNumber + ")";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "01/04/2025");
        ShippedOrder shipped = new ShippedOrder("ORD002", "02/04/2025", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "03/04/2025", "TRK789012", "2025-04-05");

        order.displayOrderDetails();
        System.out.println();
        shipped.displayOrderDetails();
        System.out.println();
        delivered.displayOrderDetails();
    }
}

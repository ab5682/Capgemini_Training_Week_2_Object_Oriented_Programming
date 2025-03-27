import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("  - " + name + " ($" + price + ")");
    }
}

class Order {
    private static int nextId = 1;
    private int orderId;
    private List<Product> products = new ArrayList<>();

    public Order() {
        this.orderId = nextId++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order #" + orderId + " contains:");
        for (Product p : products) {
            p.display();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderId());
    }

    public void displayOrders() {
        System.out.println("\nOrders placed by " + name + ":");
        for (Order o : orders) {
            o.displayOrderDetails();
            System.out.println("  Total: $" + o.calculateTotal());
        }
    }
}

public class ProblemSix {
    public static void main(String[] args) {
        Product phone = new Product("Smartphone", 699.99);
        Product laptop = new Product("Laptop", 1299.50);
        Product earbuds = new Product("Wireless Earbuds", 149.75);

        Customer john = new Customer("John Doe");

        Order order1 = new Order();
        order1.addProduct(phone);
        order1.addProduct(earbuds);

        Order order2 = new Order();
        order2.addProduct(laptop);

        john.placeOrder(order1);
        john.placeOrder(order2);

        john.displayOrders();
    }
}

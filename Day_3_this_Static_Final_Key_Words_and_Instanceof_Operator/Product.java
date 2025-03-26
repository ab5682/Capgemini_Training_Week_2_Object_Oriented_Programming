public class Product {
    static double discount = 10.0;

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    String productName;
    double price;
    int quantity;
    final String productID;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: INR " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Not a Product instance.");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2, "120532");
        p1.displayDetails(p1);
        updateDiscount(25);
        p1.displayDetails(p1);
    }
}

import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (18%)";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax (5%)";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}

public class ProblemTwo {
    public static void calculateFinalPrice(List<Product> products) {
        System.out.println("=== Final Price Calculation ===");
        for (Product product : products) {
            product.displayProductInfo();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                System.out.println("Tax Info: " + taxable.getTaxDetails());
            } else {
                System.out.println("Tax Info: Not Taxable");
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.printf("Discount: $%.2f\n", discount);
            System.out.printf("Tax: $%.2f\n", tax);
            System.out.printf("Final Price: $%.2f\n", finalPrice);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics(101, "Laptop", 1000));
        productList.add(new Clothing(102, "Jacket", 200));
        productList.add(new Groceries(103, "Apples", 50));

        calculateFinalPrice(productList);
    }
}

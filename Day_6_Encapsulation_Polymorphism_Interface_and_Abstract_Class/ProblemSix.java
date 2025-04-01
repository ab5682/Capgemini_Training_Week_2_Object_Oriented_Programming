interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private double discount = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item     : " + itemName);
        System.out.println("Price    : ₹" + price);
        System.out.println("Quantity : " + quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        return baseTotal - getDiscount();
    }

    @Override
    public void applyDiscount(double percentage) {
        double discount = (getPrice() * getQuantity()) * (percentage / 100);
        setDiscount(discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: ₹" + getDiscount();
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private final double additionalCharge = 20.0; // per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = (getPrice() + additionalCharge) * getQuantity();
        return baseTotal - getDiscount();
    }

    @Override
    public void applyDiscount(double percentage) {
        double base = (getPrice() + additionalCharge) * getQuantity();
        double discount = base * (percentage / 100);
        setDiscount(discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: ₹" + getDiscount() + " (Including ₹" + additionalCharge + " extra charge per item)";
    }
}
public class ProblemSix {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[3];
        order[0] = new VegItem("Paneer Butter Masala", 180, 2);
        order[1] = new NonVegItem("Chicken Biryani", 220, 1);
        order[2] = new NonVegItem("Fish Fry", 150, 2);

        ((Discountable) order[0]).applyDiscount(10); 
        ((Discountable) order[1]).applyDiscount(5);  
        ((Discountable) order[2]).applyDiscount(7);  

        System.out.println("=== Order Summary ===");
        double grandTotal = 0;

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("Total    : ₹" + item.calculateTotalPrice());
            System.out.println("----------------------");
            grandTotal += item.calculateTotalPrice();
        }

        System.out.println("Grand Total: ₹" + grandTotal);
    }
}

import java.util.*;
public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty){
        if(qty>0){
            quantity += qty;
            System.out.println(qty + " " + itemName + "(s) added to the cart.");
        }
        else{
            System.out.println("Invalid quantity to add.");
        }
    }
    public void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Invalid quantity to remove.");
        }
    }
    public double totalCost(){
        return price * quantity;
    }

    public void displayCartDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 80000.0, 1);

        item1.displayCartDetails();
        item1.addItem(2);
        item1.displayCartDetails();
        item1.removeItem(1);
        item1.displayCartDetails();
    }
}
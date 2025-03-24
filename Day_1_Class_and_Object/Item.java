import java.util.*;
public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display(){
        System.out.println("Item Code - " + itemCode);
        System.out.println("Item Name - " + itemName);
        System.out.println("Price - " + price);
    }

    public double totalCost(int quantity){
        return price * quantity;
    }

    public static void main(String[] args){
        Item item1 = new Item(192, "Apple", 30);
        item1.display();
        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: " + item1.totalCost(quantity));
    }
    
}

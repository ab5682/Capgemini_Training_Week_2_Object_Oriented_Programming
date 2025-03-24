import java.util.*;
public class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("Mobile brand - " + brand);
        System.out.println("Mobile model - " + model);
        System.out.println("Price - " + price);
    }

    public static void main(String[] args){
        MobilePhone mob = new MobilePhone("Apple", "iphone 16e", 60000);
        mob.display();
    }
}


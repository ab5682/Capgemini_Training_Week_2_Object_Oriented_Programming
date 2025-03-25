import java.util.*;
public class Circle{
    double radius;

    public Circle(){
        radius = 3.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double areaCricle(){
        return Math.PI * radius * radius;
    }

    public void display(){
        System.out.println("Radius - " + radius);
        System.out.println("Area - " + areaCricle());
    }

    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(7.5);
        System.out.println("Circle 1 :");
        circle1.display();
        System.out.println("Circle 2 : ");
        circle2.display();
    }
}
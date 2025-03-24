import java.util.*;
public class Employee{
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee name - " + name);
        System.out.println("Employee id - " + id);
        System.out.println("Salary - " + salary);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("Aadarsh", "RA2111029010019",1000000);
        emp1.displayDetails();
    }
}
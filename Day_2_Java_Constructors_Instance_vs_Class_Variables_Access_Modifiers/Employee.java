import java.util.*;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: INR " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: INR " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 60000);
        e1.displayEmployeeDetails();
        e1.setSalary(65000);
        System.out.println("Updated Salary: INR " + e1.getSalary());

        Manager m1 = new Manager(102, "HR", 80000, "Recruitment");
        m1.displayManagerDetails();
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); 
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
    }

    
}

public class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    String name;
    final int id;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println("Name: " + e.name);
            System.out.println("ID: " + e.id);
            System.out.println("Designation: " + e.designation);
        } else {
            System.out.println("Not an Employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Aadarsh", 293, "COA");
        emp1.displayDetails(emp1);
        displayTotalEmployees();
    }
}

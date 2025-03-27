class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: INR " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentorName;

    public Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentorName);
    }
}

public class EmployeeManagementSys {
    public static void main(String[] args) {
        Manager m = new Manager("Aniket", 101, 90000, 5);
        Developer d = new Developer("Bobby", 102, 80000, "Java");
        Intern i = new Intern("Aadarsh", 103, 30000, "Satyaprakash");

        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println();
        i.displayDetails();
    }
}

import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String name;
    private List<Faculty> facultyList = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void display() {
        System.out.println("  Department: " + name);
        for (Faculty f : facultyList) {
            System.out.print("    ");
            f.display();
        }
    }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void display() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.display();
        }
    }

    public void destroy() {
        System.out.println("Destroying university and all its departments...");
        departments.clear(); 
    }
}

public class ProblemFour {
    public static void main(String[] args) {

        Faculty john = new Faculty("John Smith");
        Faculty alice = new Faculty("Alice Johnson");

        University uni = new University("Greenfield University");

        Department csDept = new Department("Computer Science");
        Department mathDept = new Department("Mathematics");

        csDept.addFaculty(john); 
        mathDept.addFaculty(alice);

        uni.addDepartment(csDept);
        uni.addDepartment(mathDept);

        System.out.println("=== Initial University Structure ===");
        uni.display();

        System.out.println("\n=== Faculty Exists Independently ===");
        Faculty mike = new Faculty("Mike Thomson");
        mike.display(); 

        uni.destroy();

        System.out.println("\n=== After University Deletion ===");
        uni.display(); 
    }
}

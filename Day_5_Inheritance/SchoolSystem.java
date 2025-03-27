class Per {
    String name;
    int age;

    public Per(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Per {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Per {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Per {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Rajesh", 40, "Mathematics");
        Student student = new Student("Prakash", 16, "10th Grade");
        Staff staff = new Staff("Mukesh", 35, "Maintenance");

        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}

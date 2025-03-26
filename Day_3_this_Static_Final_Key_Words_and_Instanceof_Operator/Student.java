public class Student {
    static String universityName = "SRM University";
    static int totalStudents = 0;
    String name;
    final int rollNumber;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void display(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Not a Student instance.");
        }
    }

    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated to: " + s.grade);
        } else {
            System.out.println("Not a Student instance.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aadarsh", 119, "Final Year");
        Student s2 = new Student("Chiku", 1029, "Third Year");
        displayTotalStudents();
        s1.display(s1);
        s2.display(s2);
    }
}

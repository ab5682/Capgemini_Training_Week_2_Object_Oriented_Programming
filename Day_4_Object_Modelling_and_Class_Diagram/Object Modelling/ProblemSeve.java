import java.util.*;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teachCourse(Course course) {
        course.assignProfessor(this);
        System.out.println("Professor " + name + " is assigned to course " + course.getTitle());
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " has enrolled in " + course.getTitle());
    }

    public void listCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("  - " + c.getTitle());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String title;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(String title) {
        this.title = title;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getTitle() {
        return title;
    }

    public void listDetails() {
        System.out.println("\nCourse: " + title);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("  - " + s.getName());
        }
    }
}

public class ProblemSeve {
    public static void main(String[] args) {
        Professor profSmith = new Professor("Dr. Smith");
        Professor profBrown = new Professor("Dr. Brown");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        profSmith.teachCourse(math);
        profBrown.teachCourse(cs);

        alice.enrollCourse(math);
        alice.enrollCourse(cs);
        bob.enrollCourse(cs);

        alice.listCourses();
        bob.listCourses();

        math.listDetails();
        cs.listDetails();
    }
}

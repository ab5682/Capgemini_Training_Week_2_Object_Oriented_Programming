import java.util.*;

class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        student.enrollInCourse(this);
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.name);
        }
    }
}

public class ProblemThree {
    public static void main(String[] args) {
        School school = new School("SRM School");

        Student s1 = new Student("Aadarsh");
        Student s2 = new Student("Deepanshu");

        school.addStudent(s1);
        school.addStudent(s2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(s1);
        science.enrollStudent(s1);
        science.enrollStudent(s2);

        s1.viewCourses();
        s2.viewCourses();

        math.displayStudents();
        science.displayStudents();
    }
}

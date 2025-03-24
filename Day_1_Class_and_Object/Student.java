import java.util.*;
public class Student{
    String name;
    String rollNumber;
    int marks;

    public Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade(){
        if(marks>=90){
            return "A+";
        }else if(marks>=80 && marks<90){
            return "A";
        }else if(marks>=70 && marks<80){
            return "B";
        }else if(marks>=60 && marks<70){
            return "C";
        }else if(marks>=50 && marks<60){
            return "D";
        }else{
            return "F";
        }
    }

    public void display(){
        System.out.println("Student name - " + name);
        System.out.println("Student Roll Number - " + rollNumber);
        System.out.println("Marks - " + marks);
        System.out.println("Grade - " + calculateGrade());
    }

    public static void main(String[] args){
        Student student1 = new Student("Aadarsh", "RA2111029010019", 92);
        student1.display();
    }
}



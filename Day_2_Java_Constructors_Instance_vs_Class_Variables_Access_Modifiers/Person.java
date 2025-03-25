import java.util.*;
public class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person previosPerson){
        this.name = previosPerson.name;
        this.age = previosPerson.age;
    }

    public void display(){
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
    }

    public static void main(String[] args){
        Person person1 = new Person("Aadarsh",21);
        Person person2 = new Person(person1);
        person1.display();
        person2.display(); 
    }
}

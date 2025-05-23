class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Animal is making sound.");
    }
}

class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " barks");
    }
}

class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " meows");
    }
}

class Bird extends Animal{
    public Bird(String name , int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " Chirps");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        Animal dog = new Dog("Kevin", 4);
        Animal cat = new Cat("Peter",2);
        Animal bird = new Bird("Pullu", 3);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
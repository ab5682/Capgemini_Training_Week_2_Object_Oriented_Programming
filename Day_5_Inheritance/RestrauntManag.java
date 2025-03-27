interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepares meals.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        super.displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serves food and assists customers.");
    }
}

public class RestrauntManag {
    public static void main(String[] args) {
        Worker chef = new Chef("Aadarsh", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Krish", 202, 5);

        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}

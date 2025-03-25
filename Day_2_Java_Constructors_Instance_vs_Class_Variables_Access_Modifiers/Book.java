import java.util.*;
public class Book{
    String title;
    String author;
    double price;

    //Default Constructor
    public Book(){
        title = "David Copperfield";
        author = "Charles Dickens";
        price = 1000;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String name, String author){
        this(name, author,1000);
    }

    public void display(){
        System.out.println("Book Title - " + title);
        System.out.println("Author - " + author);
        System.out.println("Price - INR " + price);
    }

    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book("Java", "James Gosling", 2000);
        Book book3 = new Book("My life", "Aadarsh");
        System.out.println("Book 1 -");
        book1.display();
        System.out.println("Book 2 -");
        book2.display();
        System.out.println("Book 3 -");
        book3.display();

    }
}
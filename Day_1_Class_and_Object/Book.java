import java.util.*;
public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Book title - " + title);
        System.out.println("Author of Book - " + author);
        System.out.println("Book price - " + price);
    }

    public static void main(String[] args){
        Book book1 = new Book("Java", "James Gosling", 2000);
        book1.display();
    }
}

import java.beans.JavaBean;
import java.util.*;
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;    

    public LibraryBook(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully: " + title);
            return true;
        } else {
            System.out.println("Book is not available: " + title);
            return false;
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR " + price);
        System.out.println("Available: " + isAvailable);
    }

    public static void main(String[] args){
        LibraryBook book1 = new LibraryBook("Java", "James", 1000);
        book1.display();
        book1.borrowBook();
        book1.display();
        book1.returnBook();
        book1.display();
    }
}

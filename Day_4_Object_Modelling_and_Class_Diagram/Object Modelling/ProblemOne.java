import java.util.ArrayList;
import java.util.List;

class Book{
    String title;
    String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void display(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }
}

class Library{
    String libraryName;
    List<Book> books = new ArrayList<>();

    public Library(String libraryName){
        this.libraryName = libraryName;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book book : books) {
            book.display();
        }
    }
}

public class ProblemOne{
    public static void main(String[] args){
        Book b1 = new Book("HARLEY", "David");
        Book b2 = new Book("Royal", "Enfield");
        Book b3 = new Book("Kawasaki", "Ninja");

        Library l1 = new Library("Bikes");
        Library l2 = new Library("Racing Bikes");

        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b3);

        l1.displayBooks();
        l2.displayBooks();
    }
}
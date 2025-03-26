public class Book {
    static String libraryName = "Aadarsh's Library";
    String title;
    String author;
    final String isbn;

    public Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName(){
        System.out.println("Library Name - " + libraryName);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Not a Book instance.");
        }
    }

    public static void main(String[] args) {    
        Book book1 = new Book("Java", "James Gosling", "2341234");
        System.out.println("Book 1 Details : - ");
        book1.displayLibraryName();
        book1.displayDetails(book1);
        
    }
}

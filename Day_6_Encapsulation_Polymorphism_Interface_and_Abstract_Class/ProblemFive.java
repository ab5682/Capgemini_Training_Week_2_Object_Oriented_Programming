interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = "";
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isReserved) {
            System.out.println("Borrower: " + borrower);
        } else {
            System.out.println("Available: Yes");
        }
    }

    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            this.borrower = borrowerName;
            System.out.println(title + " reserved for " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 21;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }
}

public class ProblemFive {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Magazine("M202", "National Geographic", "Various"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");
        }

        items[0].reserveItem("Alice");
        items[0].getItemDetails();
    }
}

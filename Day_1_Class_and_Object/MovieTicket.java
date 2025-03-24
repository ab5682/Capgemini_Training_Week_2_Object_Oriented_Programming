import java.util.*;
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    public MovieTicket(String movieName, int seatNumber, double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    public void book(){
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for " + movieName + " (Seat: " + seatNumber + ")");
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    public void display(){
        System.out.println("Movie Name - " + movieName);
        System.out.println("Seat Number - " + seatNumber);
        System.out.println("Price - " + price);
    }

    public static void main(String[] args){
        MovieTicket movie1 = new MovieTicket("Inception", 21, 150);
        movie1.display();
        movie1.book();
        movie1.display();
    }
}

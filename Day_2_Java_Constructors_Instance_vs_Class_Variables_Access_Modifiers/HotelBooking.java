import java.util.*;
public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking(){
        guestName = "Guest";
        roomType = "Single Bed";
        nights = 1;
    }
    public HotelBooking(String guestName , String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking previousBooking){
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    public void display(){
        System.out.println("Guest Name - " + guestName);
        System.out.println("Room Type - " + roomType);
        System.out.println("Nights - " + nights);
    }

    public static void main(String[] args){
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Aadarsh", "Double Bed", 4);
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("\tHotel Booking 1 - " );
        booking1.display();
        System.out.println("\tHotel Booking 2 - " );
        booking2.display();
        System.out.println("\tHotel Booking 3 - " );
        booking3.display();

    }
}

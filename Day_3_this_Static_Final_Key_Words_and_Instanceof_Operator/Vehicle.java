public class Vehicle {
    static double registrationFee = 10000;
    String ownerName;
    String vehicleType;
    final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
        System.out.println("Registration fee updated to: INR " + registrationFee);
    } 

    public static void display(Object obj){
        if (obj instanceof Vehicle){
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: INR " + registrationFee);
        } else {
            System.out.println("Not a Vehicle instance.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aadarsh", "Two Wheeler", "MJ42C1916");
        Vehicle v2 = new Vehicle("Aniket", "Four Wheeler", "UP90R1987");
        v1.display(v1);
        updateRegistrationFee(50000);
        v2.display(v2);
    }
}

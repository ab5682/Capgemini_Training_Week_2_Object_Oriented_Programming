import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: $" + rentalRate + " per day");
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 50;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 100; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}

public class ProblemThree {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("CAR123", 70, "CARPOL001"));
        fleet.add(new Bike("BIK456", 30, "BIKPOL002"));
        fleet.add(new Truck("TRK789", 150, "TRKPOL003"));

        int rentalDays = 5;

        System.out.println("=== Rental Summary for " + rentalDays + " Days ===");

        for (Vehicle vehicle : fleet) {
            vehicle.displayVehicleInfo();
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.printf("Rental Cost for %d days: $%.2f\n", rentalDays, rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insured = (Insurable) vehicle;
                double insurance = insured.calculateInsurance();
                System.out.printf("Insurance: $%.2f\n", insurance);
                System.out.println(insured.getInsuranceDetails());
            }

            System.out.println("---------------------------------------");
        }
    }
}

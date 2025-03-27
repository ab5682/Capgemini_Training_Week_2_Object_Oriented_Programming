interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging electric vehicle...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("Refueling petrol vehicle...");
    }
}

public class VehicleManag {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.charge();
        System.out.println();
        pv.refuel();
    }
}

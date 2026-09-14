import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;
    double speed;

    Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("Vehicle Type: Bike");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        System.out.print("Vehicle Number: ");
        String carNumber = sc.nextLine();

        System.out.print("Brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Speed: ");
        double carSpeed = sc.nextDouble();

        System.out.print("Number of Doors: ");
        int doors = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter Bike Details:");
        System.out.print("Vehicle Number: ");
        String bikeNumber = sc.nextLine();

        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Speed: ");
        double bikeSpeed = sc.nextDouble();

        System.out.print("Has Gear (true/false): ");
        boolean gear = sc.nextBoolean();

        Vehicle vehicle;

        vehicle = new Car(carNumber, carBrand, carSpeed, doors);
        System.out.println("\nCar Details:");
        vehicle.displayDetails();

        vehicle = new Bike(bikeNumber, bikeBrand, bikeSpeed, gear);
        System.out.println("\nBike Details:");
        vehicle.displayDetails();

        sc.close();
    }
}
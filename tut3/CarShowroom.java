class Car {
    String model;
    double price;

    Car() {
        model = "Not Available";
        price = 0;
    }
    
    Car(String model) {
        this.model = model;
        price = 0;
    }

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

public class CarShowroom {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi", 5000000);

        System.out.println("Car 1:");
        car1.display();

        System.out.println("Car 2:");
        car2.display();

        System.out.println("Car 3:");
        car3.display();
    }
}


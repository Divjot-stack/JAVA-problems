import java.util.Scanner;

class Patient {
    String name;
    double consultationFee;

    // Parameterized constructor
    Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    // Method with argument to calculate final amount
    double calculateFinalAmount(double fee) {
        double discount;

        if (fee >= 2000) {
            discount = fee * 0.10;
        } else {
            discount = fee * 0.05;
        }

        return fee - discount;
    }

    // Display method
    void display() {
        double finalAmount = calculateFinalAmount(consultationFee);
        double discount = consultationFee - finalAmount;

        System.out.println("\nPatient Name: " + name);
        System.out.println("Original Fee: " + consultationFee);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class HospitalBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient[] patients = new Patient[5];

        // Input details of 5 patients
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter details of Patient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();

            sc.nextLine();

            patients[i] = new Patient(name, fee);
        }

        // Display billing details
        System.out.println("\n===== CONSULTATION BILLING =====");

        for (int i = 0; i < 5; i++) {
            patients[i].display();
        }

        sc.close();
    }
}
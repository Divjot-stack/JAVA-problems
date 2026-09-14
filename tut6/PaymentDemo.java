import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Net Banking.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new CreditCardPayment();
                break;

            case 2:
                payment = new UPIPayment();
                break;

            case 3:
                payment = new NetBankingPayment();
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        payment.pay(amount);

        sc.close();
    }
}
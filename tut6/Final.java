import account.Account;
import account.CurrentAccount;
import account.SavingsAccounts;
import payment.CardPayment;
import payment.OnlineTransaction;
import payment.Payment;
import payment.SecurePayment;
import payment.UPIPayment;

public class Final {
    public static void main(String[] args) {

        System.out.println("===== ACCOUNT DETAILS =====");

        Account account;

        account = new SavingsAccounts(
            "SA101",
            "Divjot",
            50000,
            4.5
        );

        account.displayDetails();

        System.out.println();

        account = new CurrentAccount(
            "CA101",
            "Divjot",
            75000,
            25000
        );

        account.displayDetails();

        System.out.println("\n===== PAYMENT DETAILS =====");

        Payment payment;

        payment = new UPIPayment();
        payment.pay(2500);

        if (payment instanceof SecurePayment) {
            SecurePayment securePayment = (SecurePayment) payment;
            securePayment.verifyPayment();
        }

        if (payment instanceof OnlineTransaction) {
            System.out.println("UPI is an online transaction.");
        }

        System.out.println();

        payment = new CardPayment();
        payment.pay(5000);

        if (payment instanceof OnlineTransaction) {
            System.out.println("Card payment is an online transaction.");
        }
    }
}
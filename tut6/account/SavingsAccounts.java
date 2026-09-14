package account;

public class SavingsAccounts extends Account {
    private double interestRate;

    public SavingsAccounts(String accountNumber, String accountHolderName,
                          double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
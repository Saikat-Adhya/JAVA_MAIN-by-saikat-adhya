// Account class
class Account {
     int accountNumber;
     String accountHolder;
     double balance;

    // Parameterized constructor
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display account details
    public void show() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interest;

    // Parameterized constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interest) {
        super(accountNumber, accountHolder, balance);
        this.interest = interest;
    }

    // Overridden show method
    @Override
    public void show() {
        super.show();
        System.out.println("Interest: " + interest);
    }
}

// FixedAccount class
class FixedAccount extends Account {
    private double interest;
    private int duration;

    // Parameterized constructor
    public FixedAccount(int accountNumber, String accountHolder, double balance, double interest, int duration) {
        super(accountNumber, accountHolder, balance);
        this.interest = interest;
        this.duration = duration;
    }

    // Overridden show method
    @Override
    public void show() {
        super.show();
        System.out.println("Interest: " + interest);
        System.out.println("Duration: " + duration + " years");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Account, SavingsAccount, and FixedAccount
        Account account = new Account(123456, "John Doe", 1000);
        SavingsAccount savingsAccount = new SavingsAccount(234567, "Alice Smith", 2000, 0.05);
        FixedAccount fixedAccount = new FixedAccount(345678, "Bob Johnson", 3000, 0.08, 5);

        // Calling show methods to display account details
        System.out.println("Account Details:");
        account.show();
        System.out.println();

        System.out.println("Savings Account Details:");
        savingsAccount.show();
        System.out.println();

        System.out.println("Fixed Account Details:");
        fixedAccount.show();
    }
}

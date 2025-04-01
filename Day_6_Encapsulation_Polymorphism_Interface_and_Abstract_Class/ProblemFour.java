interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.printf("Balance: $%.2f\n", balance);
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.04; 
        setBalance(getBalance() + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of $" + amount + " (Savings Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000; 
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.02; 
        setBalance(getBalance() + interest);
        return interest;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of $" + amount + " (Current Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 500; 
    }
}

public class ProblemFour {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA123", "Alice", 1500),
            new CurrentAccount("CA456", "Bob", 700),
            new SavingsAccount("SA789", "Charlie", 900)
        };

        System.out.println("=== Bank Account Summary ===");
        for (BankAccount acc : accounts) {
            acc.displayAccountInfo();

            double interest = acc.calculateInterest();
            System.out.printf("Interest Earned: $%.2f\n", interest);
            System.out.printf("New Balance: $%.2f\n", acc.getBalance());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(2000);
                System.out.println("Loan Eligibility: " + (loanAcc.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            System.out.println("----------------------------");
        }
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: INR " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: INR " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAcc {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 50000.00, 3.5);
        CheckingAccount ca = new CheckingAccount("CA456", 30000.00, 10000.00);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 100000.00, 12);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();
    }
}

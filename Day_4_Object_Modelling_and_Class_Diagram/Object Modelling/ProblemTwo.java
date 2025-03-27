import java.util.*;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    String name;
    List<BankAccount> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.accountNumber + ", Balance: $" + acc.getBalance());
        }
    }
}

class Bank {
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public BankAccount openAccount(Customer customer, String accountNumber) {
        BankAccount account = new BankAccount(accountNumber);
        customer.addAccount(account);
        System.out.println("Account " + accountNumber + " opened at " + bankName + " for " + customer.name);
        return account;
    }
}

public class ProblemTwo {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");

        Customer customer1 = new Customer("Aadarsh");
        Customer customer2 = new Customer("Bansal");

        bank.openAccount(customer1, "ACC001");
        bank.openAccount(customer1, "ACC002");
        bank.openAccount(customer2, "ACC003");

        customer1.accounts.get(0).deposit(500);
        customer1.accounts.get(1).deposit(1000);
        customer2.accounts.get(0).deposit(750);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}

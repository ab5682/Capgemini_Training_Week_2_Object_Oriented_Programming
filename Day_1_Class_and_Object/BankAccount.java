import java.util.*;
public class BankAccount {
    String accHolder;
    String accNumber;
    double balance;

    public BankAccount(String accHolder, String accNumber, double balance){
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited : INR " + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : INR " + amount);
        }else{
            System.out.println("Insufficient balance or invalid number.");
        }
    }

    public void display(){
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: INR " + balance);
    }

    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Aadarsh", "549381200", 100000);
        account1.display();
        account1.deposit(100000);
        account1.withdraw(50000);
        account1.display();
    }
}



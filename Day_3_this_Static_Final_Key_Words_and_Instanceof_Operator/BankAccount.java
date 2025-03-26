public class BankAccount{
   private static String bankName = "SBI";
   private static int totalAccounts = 0;
   private final String accountNumber;
   private String accountHolderName;
   private double balance;


   public BankAccount(String accountNumber, String accountHolderName, double balance){
       this.accountNumber = accountNumber;
       this.accountHolderName = accountHolderName;
       this.balance = balance;
       totalAccounts++;
   }


   public static void getTotalAccounts(){
       System.out.println("Total Accounts = " + totalAccounts);
   }


   public void display(Object obj){
    if(obj instanceof BankAccount){
        BankAccount b = (BankAccount) obj;
       System.out.println("Bank Name - " + bankName);
       System.out.println("Account Number - " + accountNumber);
       System.out.println("Account Holder Name - " + accountHolderName);
       System.out.println("Balance - " + balance);
    }else{
        System.out.println("Not a account instance.");
        }
    }
   


   public static void main(String[] args){
       BankAccount acc1 = new BankAccount("172986754", "Aadarsh",500000);
       BankAccount acc2 = new BankAccount("567892466", "Raj", 3500000);


       acc1.display(acc1);
       acc2.display(acc2);


       getTotalAccounts();
       
   }
}

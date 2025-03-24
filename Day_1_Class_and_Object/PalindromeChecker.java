import java.util.*;
public class PalindromeChecker{
    String str;

    PalindromeChecker(String str){
        this.str = str;
    }

    public boolean isPalindrome(){
        str = str.toLowerCase();
        String rev = "";
        for(int i = str.length() - 1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
    public void display(){
        if(isPalindrome()){
            System.out.println(" \" " + str + " \" is a palindrome");
        }else{
            System.out.println(" \" " + str + " \" is not a palindrome");
        }
    }

    public static void main(String[] args){
        PalindromeChecker palindrome1 = new PalindromeChecker("Madam");
        palindrome1.display();
        
        PalindromeChecker palindrome2 = new PalindromeChecker("HellO");
        palindrome2.display();
    }
}


 

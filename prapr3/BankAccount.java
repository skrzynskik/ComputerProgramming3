import java.util.Scanner;

public class BankAccount
{
    String accountNumber;
    String ownerName;
    float moneyAmount;
    int moneyLocked;
    int lastTransaction;
    
    void showAccountInfo(){
        System.out.println("Owner's name: " + ownerName + "\naccount number: " + accountNumber + "\nmoney amount: " + moneyAmount);
    }
    void lastTransactionAmount(){
        System.out.println(lastTransaction);
    }
    void moneyTransfer(){
        Scanner number = new Scanner(System.in);
        System.out.println("Specify the number: ");
        String accNum = number.nextLine();
        Scanner money = new Scanner(System.in);
        System.out.println("How much money? ");
        String amount = money.nextLine();
        
        System.out.println("Account Number: " + accNum + "\nMoney transfered: " + amount);
        
        
    }
}

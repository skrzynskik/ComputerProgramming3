class BankAccounts
{
    String firstName = "";
    String lastName = "";
    String accountNumber = "";
    boolean isActive = false;
    boolean isPremium= false;
    
    void displayFullName(){
        System.out.println(firstName + " " + lastName);
    }
    
    void displayAccountNumber(){
        System.out.println(accountNumber);
    }
    
    void changePremiumState(){
        isPremium = !isPremium;
    }
}

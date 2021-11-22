import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    ArrayList<String> shoppingList = new ArrayList<String>();
    
    public int countItems(){
        return shoppingList.size();
    }
    
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        
        String productName = sc.nextLine();
        shoppingList.add(productName);
    }
    
    public String toString(){
        return shoppingList.toString();
    }
}

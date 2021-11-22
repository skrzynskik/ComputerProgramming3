import java.util.ArrayList;

public class ShoppingList
{
    ArrayList<String> shoppingList = new ArrayList<String>();
    
    public int countItems(){
        return shoppingList.size();
    }
    
    public void addProduct(String productName){
        shoppingList.add(productName);
    }
    
    public String toString(){
        return shoppingList.toString();
    }
}

public class Product{
    String name;
    float price;
    String category;
    
    public Product(String name, String category, float price){
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    public void getInfo(){
        System.out.println("Product name: " + this.name + ", product price: " + this.price + ", category" + this.category);
    }
}

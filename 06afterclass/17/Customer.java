public class Customer{
    String name;
    String surname;
    String position;
    
    public Customer(String name, String surname, String position){
    
        this.name = name;
        this.surname = surname;
        this.position = position;
        
    }
    
    
    public String toString(){
        return this.name + " " + this.surname + ", Position: " + this.position;
    }
    
    public void setName(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
}
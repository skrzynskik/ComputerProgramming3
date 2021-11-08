
public class Person
{
    private String name; 
    private boolean adult;
    
    Person(String name, boolean adult){
        this.name = name;
        this.adult = adult;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAdult(boolean newAdult){
        this.adult = newAdult;
    }
    public boolean getAdult(){
        return adult;
    }
}

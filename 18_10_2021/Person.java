
public class Person
{
    String name;
    int weight;
    int height;
    
    Person (String name){
        this.name = name;
    }
    Person (String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    void displayRecord(){
        System.out.println("Imię: " + name);
        System.out.println("Waga: " + weight);
        System.out.println("Wzrost: " + height);
        System.out.println("BMI: :" + calculateBMI());
    }
    void setWeightAndHeight(int weight, int height){
        this.height = height;
        this.weight = weight;
    }
    double calculateBMI(){
        return (weight)/((height/100.0)*(height/100.0));
    }
}

// Ad.13, podpunkt a
//13.	Specify at least five attributes and three behaviors for the objects: a) Smartphone

import java.util.Scanner;

public class Smartphone
{
    String brand;
    int displaysizeInches;
    boolean isScreenOn;
    int batteryPercentage;
    String phoneNumber;
    
    void turnOn(){
        isScreenOn = !isScreenOn;
    }
    void showNumber(){
        System.out.println(phoneNumber);
    }
    
    void callNumber(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number to call");
        String phoneNumber = number.nextLine();
        System.out.println("calling: " + phoneNumber);
    }
}

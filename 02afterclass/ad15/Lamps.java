class Lamps
{
    boolean isOn = false;
    
    void turnOn(){
        isOn = true;
    }
    
    void turnOff(){
        isOn = false;
    }
    
    void displayState(){
        System.out.println((isOn) ? "The lamp is on." : "The lamp is off.");
    }
}
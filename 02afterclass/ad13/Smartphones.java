class Smartphones
{
    String phoneNumber = "";
    String phoneModel = "";
    String osType = "";
    boolean isOn = false;
    boolean isAndroid = false;
    
    void displayNumber(){
        System.out.println(phoneNumber);
    }
    
    void displayOS(){
        System.out.println(osType);
    }
    
    void changeState(){
        isOn = !isOn;
    }
}

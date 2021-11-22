public class InternetDevice
{
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevice(String name){
        this.name = name;
        this.connected = false; 
    }
    
    public void connect(){
        
        if(this.connected){
            System.out.println("You are already connected.");
        }
        
        else{
            connectedDevices++;
        }
        
        this.connected = true;
    }
    
    public void disconnect(){
        if(!this.connected){
            System.out.println("You are already disconnected.");
        }
        
        else{
            connectedDevices--;
        }
        
        this.connected = false;
    }
    
    public void isConnected(){
        System.out.println((this.connected) ? "You are already connected." : "You are disconnected.");
    }

    public void displayStatus(){
        System.out.println((this.connected) ? "You are already connected." : "You are disconnected.");
    }
    
    static public void displayConnections(){
        System.out.println("No of connected devices: " + connectedDevices);
    }
}

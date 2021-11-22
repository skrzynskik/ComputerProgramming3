public class Computer{
    String cpu;
    int ramSize;
    int ssdSize;
    String mobo;
    
    public Computer(String cpu, int ramSize, int ssdSize, String mobo){
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
        this.mobo = mobo;
    }
    
    public String toString(){
        return "CPU: " + this.cpu + ", ram size:" + this.ramSize + "GB, ssd size: " + this.ssdSize + "GB, motherboard: " + this.mobo;
    }
    
    public void setCPU(String cpu){
        this.cpu = cpu;
    }
    
    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    
    public void setSSDSize(int ssdSize){
        this.ssdSize = ssdSize;
    }
    
    public void setMobo(String mobo){
        this.mobo = mobo;
    }
    
    public static void main(String[] args){
        Computer pc1 = new Computer("Intel 4005", 1, 1, "Gigabyte");
        Computer pc2 = new Computer("Intel 6005", 3, 1, "Gigabyte");
        Computer pc3 = new Computer("Intel 7005", 1, 2, "MSI");
        
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        
        pc1.setRamSize(16);
        
        System.out.println(pc1);
    }
}
public class Computer {
    private CPU cpu;
    private String userName;
    private int ramAmount;

    Computer(String cpuName, int cpuBaseClock, int cpuCacheAmount, boolean cpuIsOverclocked, String userName, int ramAmount){
        this.cpu = new CPU(cpuName, cpuBaseClock, cpuCacheAmount, cpuIsOverclocked);
        this.userName = userName;
        this.ramAmount = ramAmount;
    }
    public void createFolder(){}
    public void deleteFolder(){}

    public void calc(){}
}


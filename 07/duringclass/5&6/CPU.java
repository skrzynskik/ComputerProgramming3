public class CPU {
    private String name;
    private int baseClock;
    private int cacheAmount;
    private boolean isOverclocked = false;

    CPU(String name, int baseClock, int cacheAmount, boolean isOverclocked){
        this.name = name;
        this.baseClock = baseClock;
        this.cacheAmount = cacheAmount;
        this.isOverclocked = isOverclocked;
    }

    public void setOverclock(){
        if (isOverclocked == false){
            isOverclocked = true;
        }else{
            isOverclocked = false;
        }
    }
    public void setName(String newName){
        name = newName;
    }

    public void process(){}
    public void overHeat(){}
}

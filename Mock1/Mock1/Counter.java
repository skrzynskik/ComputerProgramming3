public class Counter
{
    int x = 0;
    
    public void increase(){
        x +=1;
    }
    public void decrease(){
        x -=1;
    }
    public void increase(int n){
        x += n;
    }
    public void decrease(int n){
        x -= n;
    }
    public int value(){
        return x;
    }
}

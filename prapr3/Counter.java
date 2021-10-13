public class Counter
{
    double counterVal = 0;
    double show(){
        return counterVal;
    }
    void increaseByOne(){
        counterVal += 1;
    }
    void increaseByTen(){
        counterVal += 10;
    }
    void decreaseByOne(){
        counterVal -= 1;
    }
    void decreaseByTen(){
        counterVal -= 10;
    }
}

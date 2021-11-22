class Counters
{
    int value = 0;
    
    void increaseByOne(){
        value++;
    }
    
    void decreaseByOne(){
        value--;
    }
    
    void increaseByTen(){
        value += 10;
    }
    
    void decreaseByTen(){
        value -= 10;
    }    
    
    void reset(){
        value = 0;
    }
}
public class Range
{
    int rangeStart;
    int rangeEnd;
    
    public Range(int rangeStart, int rangeEnd){
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }
    
    public void showNoOfItems(){
        int counter = 0;
        
        for (int i = this.rangeStart; i <= this.rangeEnd; i++){
            counter++;
        }
        
        System.out.println("The range has " + counter + " items.");
    }
    
    public void sumNumbers(){
        int sum = 0;
        int currentNumber = this.rangeStart;
        
        for (int i = this.rangeStart; i <= this.rangeEnd; i++){
            sum += currentNumber;
            currentNumber++;
        }
        
        System.out.println("The sum is: " + sum);
    }
    
    public void calcAverage(){
        int sum = 0;
        int currentNumber = this.rangeStart;
        int counter = 0;
        float avg = 0f;
        
        for (int i = this.rangeStart; i <= this.rangeEnd; i++){
            sum += currentNumber;
            currentNumber++;
            counter++;
        }
        
        avg = (float) sum/counter;
        
        System.out.println("The average is: " + avg);
    }
}

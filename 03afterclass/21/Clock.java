public class Clock
{
    int hour;
    int minute;
    int alarmHour = -1;
    int alarmMinute = -1;
    
    public Clock(){
        this.minute = 0;
        this.hour = 0;
    }
    
    public Clock(int hour, int minute){
        this.hour = (hour >= 0 && hour <= 23) ? hour : 0;
        this.minute = (minute >=0 && minute <= 59) ? minute : 0; 
    }
    
    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    public void setClock(int hour, int minute){
        this.hour = (hour >= 0 && hour <= 23) ? hour : 0;
        this.minute = (minute >=0 && minute <= 59) ? minute : 0; 
    }
    
    public void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }
    
    public void displayTime(){
        String displayHour = (this.hour >= 0 && this.hour < 10) ? "0" + Integer.toString(this.hour) : Integer.toString(this.hour);
        String displayMinute = (this.minute >= 0 && this.minute < 10) ? "0" + Integer.toString(this.minute) : Integer.toString(this.minute);
        System.out.println("The time is: " + displayHour + ":" + displayMinute);
    }
    
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep!");
    }
    
    public void addOneMinute(){
        if (this.minute == 59){
            
            this.minute = 0;
            
            if (this.hour == 23){
                this.hour = 0;
            }
            else{
                this.hour++;
            }
        }
        
        else{
            this.minute++;
        }
        
        if ((this.minute == this.alarmMinute) && (this.hour == this.alarmHour)){
            this.runAlarm();
        }
    }
    
    
    public static void main(String[] args){
        Clock clock1 = new Clock(12,47);
        clock1.displayTime();
        clock1.setClock(18,14);
        clock1.displayTime();
        clock1.setClock(9,3);
        clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
    }
}

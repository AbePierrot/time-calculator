
package java_practicetime;

/**
 *
 * @author abraham
 */
public class Time {
    
    private int hour;
    private int minute;
    private int second;
    private int addedTime=0; //
    

   /**
    * 
     * @param setHour 0 to 23 (range of input)
     * @param setMinute 0 to 59
     * @param setSecond  0 to 59 
     * will not be checking the actually range in the program currently 
    */
    public Time (int setHour,int setMinute,int setSecond){
        this.hour = setHour;
        this.minute=setMinute;
        this.second=setSecond;
        
    }
    
    
    
    
    public void addTime(Time other){
        addSecond(this.second,other.second);
        addMinute(this.minute,other.minute);
        addHour(this.hour,other.hour);
        
        System.out.print(hour+": "+minute+": "+second);
        //System.out.printf("%02d:%02d:02d",hour,minute, second);
    }
    
    
    
    private void addSecond(int num1, int num2){
       int addedSeconds= num1+num2;
       int remainderSeconds=addedSeconds%60;
       setSecond(remainderSeconds);

       addedTime=(addedSeconds-remainderSeconds)/60;
       
    } 
    
    private void addMinute(int firstMinutes, int secondMinutes){
        int addedMinutes=firstMinutes+secondMinutes;
        int remainderMinutes=addedMinutes%60;
        setMinute(remainderMinutes+addedTime);
        
        addedTime=(addedMinutes-remainderMinutes)/60;
   
    }
    
    private void addHour(int firstHour, int secondHour){
        int addHours=firstHour+secondHour;
        int remainderHours=addHours%24;
        setHour(remainderHours+addedTime);
    }
    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
    
    

}

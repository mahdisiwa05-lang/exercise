
package current.time.millis;
import java.util. Scanner;

public class CurrentTimeMillis {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
   long totalMillisecond = System.currentTimeMillis();   
   long tSecond = totalMillisecond/1000;  
     long cSecond = tSecond%60;
     long tMinute = tSecond/60;
     long cMinute = tMinute%60;
     long tHour = tMinute/60;
     long cHour = tHour%24;
        System.out.println("Current time is"+((cHour+4)-12)+":"+(cMinute+30)+":"+cSecond+" AFG ");
        
    }
    
}


package finefuturedates;
import java.util.Scanner;
public class Finefuturedates {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String[]days = {"Sunday","Monday","Tusday","Wendesday","Thursday","friday","Saturday"};
        System.out.println("Enter todays day(0 for sunday , 1 for monday , ...., 6 for sarutday");
      int today = input.nextInt();
        System.out.println("Enter the number of days elapsed sciencse today.");
       int elapsed = input.nextInt();
       int futureDay = (today + elapsed)%7;
        System.out.println("Today is"+days[today]+"and future day is"+days[futureDay]);
        
        
        
    }
    
}

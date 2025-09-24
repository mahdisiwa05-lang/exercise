
package leapyear1;

import java.util.Scanner;


    public class LeapYear1 {
   
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year in AD : ");
        int year = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0))
            System.out.println("congratulate this year is a leap year");
        else 
            System.out.println("This is not a leap year, it's a normal year!");
    }
    
}

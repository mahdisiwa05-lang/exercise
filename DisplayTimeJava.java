
package display.time.java;

import java.util.Scanner;
public class DisplayTimeJava {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);   
        System.out.println("Enter an intger for secound: ");  
       int second = input.nextInt();
       int minutes = second/60;
       int remainingSeconds = second%60;
        System.out.println(second+ "second is"+minutes+"minutes and"+remainingSeconds+"seconds");
        
    }
    
}

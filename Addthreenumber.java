
package addthreenumber;
import java.util.Scanner;
public class Addthreenumber {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         System.out.println("What is num1 + num2 + num3?");
      int num1 = (int)(Math.random()*10);
    int num2 =(int)(Math.random()*10);
    int num3 = (int)(Math.random()*10);
     int answer = input.nextInt();
     if ( answer == num1 +num2 +num3 )
            System.out.println("You are correct");
     else {
         System.out.println("Your answer is wrong."+"num1"+"+"+"num2"+"+"+"num3"+"="+(num1+num2+num3));    
           
     }   
        
        
    }
    
}

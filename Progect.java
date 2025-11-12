
package progect;
import java.util.Scanner;

public class Progect {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number= (int)(Math.random()*100);
    int guess =-1;
 
    while(guess!=number)
    {       System.out.println("Guess a number between zero to hundred:");
        guess=input.nextInt();
        if (guess==number)
            System.out.println("Congratulation! you guess correctly. "
                    + " The number is "+number);
        else if(guess<number)
            System.out.println("Too low");
        else  
            System.out.println("Too high");
    
    }
        
        
    }
    
}


package headsortails;
import java.util.Scanner;
public class Headsortails {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int coin = (int)(Math.random()*2);
        System.out.println("Guess Heads(0) or tails(1):");     
       int guess = input.nextInt();
       if(guess !=0 && guess !=1 ){
           System.out.println("invalid input");
       }
       else{
           System.out.println("Coin is"+(coin == 0?"Heads":"Tails"));    
       }
     if (guess ==coin){
         System.out.println("you are correct!");      
     }  
     else{
         System.out.println("incorrect guess");      
     }     
    }
}

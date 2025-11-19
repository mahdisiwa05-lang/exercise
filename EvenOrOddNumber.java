
package even.or.odd.number;
import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     double x;
        System.out.println("pleace inter a number for chacking:");
      x =input.nextDouble();
      if(x==0)
            System.out.println(x+": is Zero");
      else if(x % 2 ==0){
            System.out.println(x+":is an Even number");
            
      }
      else  if( x % 2 !=0) {      
            System.out.println(x+":is an Odd number"); 
      }
      
              
    }
    
}

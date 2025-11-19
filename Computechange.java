
package computechange;
import java.util.Scanner;
public class Computechange {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount like: 11.56");
      double amount = input.nextDouble();
      int remaningAmount = (int)(amount * 100);
      int dollars = remaningAmount/25;
      remaningAmount %=25;
      int quaters = remaningAmount/25;
      quaters %=25;
      int dimes = remaningAmount/10;
      dimes %=10;
      int nickels = remaningAmount/5;
      nickels %=5;
      int pennies =remaningAmount;
      if(dollars>0)
            System.out.println(dollars+(dollars ==1 ?"dollars":"dollars"));
      
     if(quaters>0) 
            System.out.println(quaters+(quaters == 1 ?"quaters":"quaters")); 
      if(dimes>0)
            System.out.println(dimes+(dimes ==1 ?"dimes":"dimes"));
      if(nickels>0)
            System.out.println(nickels+(nickels == 1 ?"nickels":"nickels"));
     if (pennies>0)
            System.out.println(pennies+(pennies ==1 ?"pennies":"pennies"));
       
    }
    
}

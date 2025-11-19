
package costofdriving;
import java.util.Scanner;
public class Costofdriving {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);    
        System.out.println("Enter the driving distence: ");    
      float distance = input.nextFloat();
        System.out.println("Enter mile pere gallon: "); 
      float gillon = input.nextFloat();
        System.out.println("Enter price pere gillon: ");
      float price = input.nextFloat();
    double cost = (distance/gillon)*price;
        System.out.println("The cost of driving is: "+cost);   
        
    }
    
}

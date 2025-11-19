
package shpping.cost;
import java.util.Scanner;
public class ShppingCost {
 public static void main(String[] args) {
Scanner input = new Scanner(System.in);
     System.out.print("Enter the weight of the package:");
     double weight = input.nextDouble();
     if(weight<=0){
         System.out.println("invalid input.");
     }
     else if(weight<=1){
         System.out.println("Shipping cost is $ 3.5");
     }   
     else if(weight<=3){
         System.out.println("Shipping is $ 5.5");  
     }    
     else if(weight<=10) {
         System.out.println("Shipping is $ 8.5");
     }  
     else if (weight<=20){
         System.out.println("Shipping cost is $10.5");
     }    
     else {
         System.out.println("The package can not be Shipped");
     } 
        
    }
    
}

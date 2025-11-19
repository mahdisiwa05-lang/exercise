
package salestax;
import java.util.Scanner;

public class Salestax {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");    
     double purches = input.nextDouble();   
     double tax = purches*0.06;
        System.out.println("Sales tax is $"+ (int)(tax * 100)/100.0);
           
    }
    
}

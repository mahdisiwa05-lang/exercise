
package acceleration;
import java.util.Scanner;
public class Acceleration {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter the starting velocity: ");
     double v0 = input.nextDouble();
        System.out.println("enter the ending velocity: ");
     double v1 = input.nextDouble();
        System.out.println("Enter the start time: ");   
      int time = input.nextInt();
     double acceleration = (v1 - v0) / time; 
        System.out.println(acceleration);  
        
        
        
    }
    
}

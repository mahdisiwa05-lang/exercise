
package findingrunwaylength;
import java.util.Scanner;
public class Findingrunwaylength {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);     
        System.out.println("Enter the speed:");    
     int speed = input.nextInt();
        System.out.println("Enter the accleration:");
        double accleration = input.nextDouble();
      double runway =(speed * speed)/(2*accleration); 
        System.out.println("The munimum runway length for this airplane is: "+runway);  
         
    }
    
}


package calculatingenergy;
import java.util.Scanner;
public class Calculatingenergy {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of water in kilogram:");    
      double M = input.nextDouble();
        System.out.println("Enter the intial temperature:");
       double intial = input.nextDouble(); 
        System.out.println("Enter the final temperature:"); 
      double finale = input.nextDouble();
      double Q = M*(finale - intial)*4184;
        System.out.println("The energy needed is: "+Q);
      
    }
    
}


package sumthedigit;
import java.util.Scanner;
public class Sumthedigit {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");    
       int x = input.nextInt();
       int y = x % 100;
       int z = y %10;
       int f = z /10;
       int sum = y+z+f;
        System.out.println("The sum of the digit is :"+sum);
        
    }
    
}

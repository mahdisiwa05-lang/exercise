
package palindromeinteger;
import java.util.Scanner;
public class Palindromeinteger {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a three-digitinteger:");
     int number = Math.abs(input.nextInt());
     int hundreds = number/100;
     int tens = (number/10)%10;
     int units  = number%10;
     if(hundreds ==units)
            System.out.println(number+"is a plandrome");
      else
            System.out.println(number+"is not a plandrome");
        
    }
    
}

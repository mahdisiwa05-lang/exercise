
package windchilltemperature;
import java.util.Scanner;
public class Windchilltemperature {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter the tempeature in fahrenheit between -58 and 41:");     
      float ta = input.nextFloat();
        System.out.println("Enter the wind speed (>=2) in miles per hour");  
        float v = input.nextFloat();
        float twc = (float) ((35.74 +( 0.6215*ta)) - (35.75*Math.pow(v , 0.16))+(0.4275*(ta*Math.pow(v, 0.16)))); 
        System.out.println("The wind chill index is: "+twc); 
    }
    
}

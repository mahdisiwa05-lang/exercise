
package areaofahexagon;
import java.util.Scanner;
public class Areaofahexagon {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side");
  double side = input.nextDouble();
  double area = ((3*Math.pow(3 ,0.5))/2)*(side *side);
        System.out.println("The area of the hexagon is: "+area);     
        
        
    }
    
}

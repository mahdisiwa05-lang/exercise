
package compute.area.of.circle.pkg1;

import java.util.Scanner;

public class ComputeAreaOfCircle1 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double raduis;
      System.out.println("pleace inter the raduis of the circle:");
     raduis = input.nextDouble();

      
      double area = raduis*raduis*3.14159;
     
        System.out.println("The area of the circle of the raduis:" +raduis+ "is:"+ area );
        
    }
    
}

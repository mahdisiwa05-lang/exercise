
package area;

import java.util.Scanner;


public class Area {

   
    public static void main(String[] args) {
        
    // this progrsm is going to compute the area of a circle
        System.out.println("Please enter the radius for circle : ");
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    double area;
    area = 3.14159*(radius*radius);
        System.out.println("The area for the circle with radius" + radius +" is:\n " + area);
    
            
            }
    
}

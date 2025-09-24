
package area;

import java.util.Scanner;



public class Area {

   
    public static void main(String[] args) {  
    // this Program is going to compute for you the perimeter of an optional rectangle
       
    
    Scanner input = new Scanner (System.in);    
        System.out.println("please enter the rectangle length : ");
    double length = input.nextDouble();
        System.out.println("please enter the wide of the rectangle : ");
        double wide = input.nextDouble();
        double perimeter = (2*wide)+(2*length);
        System.out.println("the perimeter of rectangle with length " +length +" and wide " +wide + " is :\n " + perimeter);
                
                
    
    }
    
}

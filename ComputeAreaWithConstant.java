
package compute.area.with.constant;

import java.util.Scanner;
public class ComputeAreaWithConstant {

   
    public static void main(String[] args) {
   final double PI =3.14159;
      Scanner input = new Scanner(System.in); 
        System.out.println(" Inter anumber for raduis: "); 
       double raduis=input.nextDouble(); 
      double area = raduis*raduis*PI;
        System.out.println("The area for the circle of raduis "+raduis+" is "+area);
        
    }
    
}

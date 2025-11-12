
package equation;

import java.util.Scanner;


public class Equation {

  
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.println("solve your optional quadratic equation(ax^2+bx+c");
        System.out.println("Please enter the coefficent(a) amount:");
        double a = input.nextDouble();
        System.out.println("Please enter the coefficent(b) amount:");
        double b = input.nextDouble();
        System.out.println("Please enter the constant number(c)amount");    
        double c = input.nextDouble();
        
        if((b*b) -(4*a*c)>0)
            System.out.println("This equation has two real roots,"+" and the roots are:");
        else if((b*b)-(4*a*c)<0)
            System.out.println("This equation does not have real defination!");
        else
            System.out.println("The roots are the same, and are:");
       
        
        double x1= ((-b +(Math.sqrt(b*b-(4*a*c))))/2*a);
    
            double x2= ((-b -(Math.sqrt(b*b-(4*a*c))))/2*a);
            System.out.println(x1);
            System.out.println(x2);
            

    }
    
}

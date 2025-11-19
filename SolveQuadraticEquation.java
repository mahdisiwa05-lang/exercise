
package solve.quadratic.equation;
import java.util.Scanner;
public class SolveQuadraticEquation {

    public static void main(String[] args) {
        System.out.println("THIS PROGRAMM WILL SLOVE THE QUADRATIC FUNCATION \n");
Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
double a = input.nextDouble();
        System.out.println("Enter a value for b: ");       
 double b = input.nextDouble();
        System.out.println("Enter a number for c: ");
 double c = input.nextDouble();
 
 double x1,x2;
 x1 = -b +(Math.sqrt(b*b-4*a*c))/2*a;
 x2 = -b -(Math.sqrt(b*b-4*a*c))/2*a;
   
 
 double discriminant;
 discriminant = b*b-4*a*c;
 if(discriminant>0){
     System.out.println("The funcion has two roots:"+x1+"and"+x2);
 }
 else if(discriminant<0){
     System.out.println("The function has no root");     
 }
 else
            System.out.println("The function has one root"+x1+"and"+x2);
    }
    
}

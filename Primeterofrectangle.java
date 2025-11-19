
package primeterofrectangle;
import java.util.Scanner;
public class Primeterofrectangle {

    public static void main(String[] args) {
   Scanner input  = new Scanner(System.in);
        System.out.println("enter the edges of a triangle:");     
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble(); 
    if(a+b>c && a+c>b && c+b>a){
        System.out.println("Perimeter of the triangle is"+(a+b+c));
    }    
    else{
        System.out.println("Invaild input: Not a vaild tringle");
    }    
  
    }
    
}

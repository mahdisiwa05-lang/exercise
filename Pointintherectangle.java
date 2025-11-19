
package pointintherectangle;
import java.util.Scanner;
public class Pointintherectangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two cooridnates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(Math.abs(x)<=5/2.0 && Math.abs(y)<=5/2.0){
            System.out.println("point("+x+","+y+")is in the rectangle");
        }
        else{
            System.out.println("point("+x+","+y+")is not in the rectangle");
        }   
    }
    
}

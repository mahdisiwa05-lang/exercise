
package pointinthecircle;
import java.util.Scanner;
public class Pointinthecircle {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter a point weith two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(Math.pow(x, 2)+Math.pow(y, 2)<=100){
            System.out.println("point("+x+","+y+")is in the circle");   
            
        }
        else{
            
            System.out.println("point("+x+","+y+")is not in the circle");
        }                   
    }
    
}

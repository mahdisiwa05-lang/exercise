
package sortthreeintegers;
import java.util.Arrays;
import java.util.Scanner;
public class Sortthreeintegers {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Enter three integres.");
     int[] number = new int[3];
     number[0] =input.nextInt();
     number[1] = input.nextInt();
     number[2] = input.nextInt();
     Arrays.sort(number);
        System.out.println("Sorted integres:" +number[0]+ ", " +number[1]+", "+ number[2]);    
        
        
    }
    
}

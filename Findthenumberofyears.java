
package findthenumberofyears;
import java.util.Scanner;
public class Findthenumberofyears {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of munites:");    
    int munites = input.nextInt();
    int day = munites%(365 * 1440);//525600
     int year = munites/(365 *1440);
        System.out.println(munites+"munites"+"is"+year+"years"+day+"day");
        
    }
    
}


package isbn10;
import java.util.Scanner;
public class Isbn10 {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an integre:");
    int num = input.nextInt();
    int temp = num;
    int sum = 0;
    for(int i =9;i>=1;i--){
     int digit = temp%10;
     sum += digit*i;
     temp /=10;
        
        
    }
     int checkDigit = sum%11;
        System.out.println("The isbn 10 number is"+num);
      if(checkDigit ==0)
            System.out.println("X");
      else
            System.out.println(checkDigit);
        
    }
    
}

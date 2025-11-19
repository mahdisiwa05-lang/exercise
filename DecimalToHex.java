
package decimal.to.hex;

import java.util.Scanner;

public class DecimalToHex {
    
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   
        System.out.println("Enter a decimal number: ");
        
        long decimal = input.nextInt();
        String hex = "";
        
        while (decimal !=0){
       long hexvalue = decimal % 16;     
        char hexDigit = (0 <=hexvalue && hexvalue<=9)?    
            (char)(hexvalue+'0'):(char)(hexvalue-10+'A');
        hex = hexDigit+hex;
        decimal = decimal / 16;
       
        }
        System.out.println("The hex number is"+hex);  
        
        
        
        
    }
    
}

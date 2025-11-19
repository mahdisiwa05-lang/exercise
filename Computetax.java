
package computetax;
import java.util.Scanner;
public class Computetax {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
        System.out.println("Enter filling status(0=single,1=married jointly,2=married separately,3=head of househould):");     
        int status = input.nextInt();
        System.out.println("Enter taxable income:");
        double income = input.nextDouble();
        double tax = 0;
        switch(status){
            case 0:
            if(income<=8350)    
            tax = income*0.10;
            else if(income<=33950)
                tax = 8350*0.10+(income-8350)*0.15;
          else
          tax = 8350*0.10+(33950-8350)*0.15+(income-33950)*0.25;      
         
        }
        
          deafult:{
            System.out.println("invaild status");}
        System.out.println("Tax is"+tax);   
    }
}

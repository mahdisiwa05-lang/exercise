
package bmi;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pound:");
     double weight = input.nextDouble();
        System.out.println("Enter your hight in feet:");
       double hight = input.nextDouble();
    double bmi = weight/(hight*hight);
    if(bmi<18.5)
            System.out.println("under weight");
    else if(bmi<25)
            System.out.println("normal");
    else if (bmi<30)
            System.out.println("over weight"); 
    else
            System.out.println("obese");
    
    }
    
}

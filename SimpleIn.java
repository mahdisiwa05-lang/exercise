
package simplein;

import java.util.Scanner;


public class SimpleIn {

   
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("enter your principal:\n");
        double principal = input.nextDouble();
        System.out.println("enter your rate:\n");
        double rate = input.nextDouble();
        System.out.println("enter your asked time(y):\n");
        double time = input.nextDouble();
        double simpleIn = (principal*rate*time)/100 ;
        System.out.println("your simpleIN = " + simpleIn);
    
    
    }
    
}

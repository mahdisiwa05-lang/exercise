
package swping;

import java.util.Scanner;


public class Swping {

 
    public static void main(String[] args) {
// this is to swap two numbers with out third varible//
Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
    int first = input.nextInt();
        System.out.println("enter the second number: ");
    int second = input.nextInt();
    first = first + second;
    second = first - second;
    first = first - second;
        System.out.println("To swap then: first =  "+ first +",second= " + second);
    
    
    }
    
}

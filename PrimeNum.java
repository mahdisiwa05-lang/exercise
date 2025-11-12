
package primenum;

import java.util.Scanner;

public class PrimeNum {


    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter an integer to see whether is prime or no:");    
    int number=input.nextInt();
    boolean prime =true;
    for(int divisor =2;divisor<=number/2;divisor++){
    if(number%divisor==0){
    prime =false;
    break;
    
    }
    
    
    }
    if(prime&&number>1)
            System.out.println(number+ " is prime");
    else
            System.out.println(number+" is not prime");
    
    }
   
}

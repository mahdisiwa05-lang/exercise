
package exercises;

import java.util.Scanner;

public class Exercises {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
        int positives=0;
        int negatives =0;
        int count = 0;
        double total=0;
        System.out.println("enter integers to sum(program will end if you enter zero)");
    int integer = input.nextInt();
    while(integer!=0){
    if(integer>0){
   positives++;
   
    }
    else 
        negatives++;
    
total+=integer;
count++;
integer =input.nextInt();

}    
    if(count==0){
            System.out.println("no numbers are entered except zero");
    }else {
        double average =count/2;
        System.out.println("the number of positives are "+positives);
        System.out.println("the number of negatives are "+negatives);
        System.out.println("the total is "+total);
        System.out.println("the average is "+average);
    }
    }
    
    }
    


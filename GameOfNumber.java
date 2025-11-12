
package gameofnumber;

import java.util.Scanner;

public class GameOfNumber {

    
    public static void main(String[] args) {
       
    int n1 = (int)(Math.random()*10);
    int n2 = (int)(Math.random()*10);
   int n3 = (int)(Math.random()*10); 
    Scanner input = new Scanner(System.in);
        System.out.println("what is " + n1 + " + " + n2 + " + " + n3 +" = ?");
        int answer = input.nextInt();
        if(answer == n1 + n2 + n3){
            System.out.println("your answer is correct!");
           
        }else
            System.out.println("your answer is wrong!");
        System.out.println("the correct answer is:" +( n1 + n2 + n3) );
    }
    
}

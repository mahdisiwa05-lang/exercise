
package game.add.three.number;
import java.util.Scanner;
public class GameAddThreeNumber {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);          
    int num1 = (int)(Math.random()*10);
    int num2  = (int)(Math.random()*10);    
     int num3 = (int)(Math.random()*10);
       System.out.println("what is the sum of :"+num1+"+"+num2+"+"+num3+"?");  
     
     int answer = input.nextInt();
        if(answer == (num1+num2+num3)){
            System.out.println("you are correct");
        }
        else if(answer != (num1+num2+num3)){
            System.out.println("your answer is wrong the answer should be:"+(num1+num2+num3));    
            
            
        }
            
    }
    
}

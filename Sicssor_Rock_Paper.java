
package sicssor_rock_paper;
import java.util.Scanner;
public class Sicssor_Rock_Paper {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);  
   int computer =(int)(Math.random()*3);
        System.out.print("Scissor(0),rock(1),paper(2):");
       int user = input.nextInt();
       String[]names = {"Scissor","Rock","paper"};
        System.out.println("The computer is"+names[computer]+"You are"+names[user]+".");
      if (user == computer){
          System.out.println("it is a draw");     
      }  
      else if ((user == 0 && computer ==2)||(user ==1&& computer ==0)||(user ==2 && computer ==1))
      {
          System.out.println("You won");    
          
      }else{
          System.out.println("you lost");
      }   
    }
    
}

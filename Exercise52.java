
package exercise5.pkg2;

import java.util.Scanner;


public class Exercise52 {

  
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
    
      
    int correctCount=0;
   int count = 0;
  long startTime =System.currentTimeMillis();
  String outPut="";
  while(count<10){
  int num1 =(int)(1+Math.random()*15);
  int num2 =(int)(1+Math.random()*15);
      System.out.println("what is "+num1+" + "+num2+" =?");
  int answer=input.nextInt();
  if(answer==num1+num2){
      System.out.println("you are correct!\n");
  correctCount++;
  
  }else{
      System.out.println("you are wrong!");
  
  }count++;
  }
  long endTime=System.currentTimeMillis();
  long testTime=endTime-startTime;
        System.out.println("your correct answer are "+correctCount+".");
        System.out.println("Your test time is "+testTime/1000+" seconds.");
    input.close();
    }
    
}

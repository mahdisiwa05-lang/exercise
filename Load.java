
package load;

import java.util.Scanner;

public class Load {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);    
int num1=(int)(Math.random()*8+1);
int num2=(int)(Math.random()*8+1);
       int num3=(int)(Math.random()*8+1);
        System.out.println("what is "+num1+"+"+num2+"+"+num3+"=?");
int answer=input.nextInt();
int y=(num1)+(num2)+(num3);
if(answer==y){
    System.out.println("your answer is correct.");

}
else
            System.out.println("your answer is wrong. The answer must be "+y);
    }  
 }




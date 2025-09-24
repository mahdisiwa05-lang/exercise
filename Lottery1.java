
package lottery1;

import java.util.Scanner;


public class Lottery1 {

 
    public static void main(String[] args) {
    
        int lotteryNumber = (int)(Math.random()*100);
Scanner input = new Scanner(System.in);
        System.out.println("Please enter your ticket picked number(two digit) : ");
        
    int yourNumber = input.nextInt();
    
    int lotteryFirstDigit = lotteryNumber/10;
    int lotterySecondDigit = lotteryNumber%10;
    int yourNumberFirstDigit = yourNumber/10;
    int yourNumberSecondDigit = yourNumber%10;
     
        if(yourNumber>=0&&yourNumber<=99){
            System.out.println("the lottery number is :" + lotteryNumber);
        
            if(yourNumber==lotteryNumber)
            System.out.println("congratulation!\n your guess is correct\n you win 10,000$");
            
        
        else if(yourNumberFirstDigit==lotterySecondDigit && yourNumberSecondDigit == lotteryFirstDigit)
            System.out.println("congratulation!\n you guess the digit inversly\n you win 3,000$");
        else if(yourNumberFirstDigit==lotteryFirstDigit || yourNumberFirstDigit==lotterySecondDigit || yourNumberSecondDigit==lotteryFirstDigit || yourNumberSecondDigit==lotterySecondDigit)
            System.out.println("Congratulation!\n you guess a digit corectly\n you win 1,000$");
        else 
            System.out.println(" Your number does not match!");}
        else
            System.out.println("Please enter the lottery digit, it is not lottery digit"+",lottery digit is two digit not more,"+" check your number and try later : ");
    }
    
}


package financialapplication;

import java.util.Scanner;


public class FinancialApplication {

    public static void main(String[] args) {
        
        // This program is to compute the whole value or prise of a product after tax
        System.out.println("This program is to compute the value of product for you after tax so,");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the prise of the product:");
        double prise = input.nextDouble();
        System.out.println("Please enter the tax for the product;");
        double tax = input.nextDouble();
        double wholePrise = prise*tax/100 ;
        System.out.println("the whole prise of the product with real prise of " + prise +" and tax of "+ tax +" is =  " +wholePrise +"$");
    
    }
    
}

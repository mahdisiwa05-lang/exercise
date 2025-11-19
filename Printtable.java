
package printtable;
public class Printtable {

    public static void main(String[] args) {
        System.out.println("a   b   pow(a,b)"); 
        for (int a = 1;a<=5;a++){
            int b = 2;
            while ( b<=6){
                b++;
                System.out.println(Math.pow(a ,b)); 
            }
          
        }
        
        
        
        
    }
    
}

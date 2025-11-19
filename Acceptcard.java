
package acceptcard;

public class Acceptcard {

    public static void main(String[] args) {
      String[]suits = {"Clubs","Dimonds","Hearts","Spades"};
      String[]ranks = {"Ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
     int suitIndex = (int)(Math.random()*4);   
      int rankIndex = (int)(Math.random()*13);  
        System.out.println("The card you picked is:"+ranks[rankIndex]+ " of" + suits[suitIndex]);  
        
        
    }
    
}

/**
 * Created: 4/8/2025 (DD/MM/YYYY)
 * 
 * This class handles all 52 cards. 
 */

import java.util.*;

public class cardDeck {
    ArrayList<card> cards = new ArrayList<card>();

    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};

    static boolean firstThread = true;
    public cardDeck(){
        for (int i = 0; i<suit.length; i++) {
            for(int j=0; j<values.length; j++){
                this.cards.add(new card(suit[i],values[j]));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.cards);

    }

    public ArrayList<card> getDeck(){
        return cards;
    }

    public static void main(String[] args){
        cardDeck deck = new cardDeck();

        //print out the deck.
        System.out.println(deck.getDeck());
    }

}
/**
 * Created: 4/8/2025 (DD/MM/YYYY)
 * 
 * This class handles all 52 cards. 
 */

import java.util.*;

public class cardDeck {
    //replace with set list
    Map<Integer, card> cards = new Hashmap<>();

    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};

    static boolean firstThread = true;
    public cardDeck(){
        int index = 0;
        for (String suit : suits) {
            for (String value : values) {
                cards.put(index++, new card(suit, value));
            }
        }
        //shuffle the deck when its created
        shuffleDeck();

    }

    public void shuffleDeck() {
        List<Integer> keys = new ArrayList<>(cards.keySet());
        Collections.shuffle(keys);
        Map<Integer, card> shuffledDeck = new LinkedHashMap<>();
        for (int key : keys) {
            shuffledDeck.put(key, cards.get(key));
        }
        cards = shuffledDeck;
    }
    
    ppublic Map<Integer, card> getDeck() {
        return cards;
    }

    public static void main(String[] args) {
        cardDeck deck = new cardDeck();

        // Print out the deck
        for (Map.Entry<Integer, card> entry : deck.getDeck().entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Card: " + entry.getValue());
        }
    }
}
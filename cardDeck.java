import java.util.*;

/**
 * <pre>
 * Created: 4/8/2025 (DD/MM/YYYY)
 * This interface(?) handles all 52 cards. 
 * This means it will: 
 * -create a deck
 * -shuffle the deck
 * -pull cards into the deck
 * -put cards into the deck
 * -draw a random card from the deck
 * The draw will be in a FILO (First in last out) system.
 * This class DOES NOT HANDLE IMAGES
 * </pre>
 */

//Interfaces from our labs will help here.
public class cardDeck
{
	
	//Every card has 2 properties. Number, Suit
	//A list will be used.
	private static List<String> cards = new ArrayList<>();
    private static Stack<String> deck = new Stack<>();
	
    // Constructor
    public cardDeck() {
        cards = new ArrayList<>();
        // Initialize the card list with all cards in a standard deck
        String[] suits = {"S", "C", "H", "D"}; // S=Spades, C=Clubs, H=Hearts, D=Diamonds
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) { // Cards from 1 to 13
                cards.add(suit + i); // Example: S1, C13, etc.
            }
        }
        deck = new Stack<>(); // Initialize the deck
    }

    
    /**
     * Creates a new deck.
     */
    //YO FIX THIS SHIT
    public static void createDeck() {
    	Random random = new Random();
        for (int i = 0; i < 15; i++) {
            // Randomly select a card (allowing duplicates)
        	String randomCard = cards.get((int) Math.random() * deck.size());
            deck.push(randomCard); // Add to the stack
        }
    }
    
    /**
     * @return What card is on the top of the deck and removes it.
     */
    public static String draw() {
        if (!deck.isEmpty()) {
            return deck.pop(); // Remove and return the top card
        } else {
            throw new IllegalStateException("The deck is empty!");
        }
    }

    /**
     * @return Number or suit on the card on the top of the deck.
     * 
     */
    public static String getNumber()
    {
    	if (!cards.isEmpty())
    		return cards.get(0).substring(1);
    	return null;
    }
    
    public static String getSuit()
    {
    	if (!cards.isEmpty())
    		return cards.get(0).substring(0, 1);
    	return null;
    }
    
    public static void main(String[] args) {
        cardDeck cardDeck = new cardDeck(); // Initialize the cardDeck
        cardDeck.createDeck(); // Create a random deck
    }
    
}

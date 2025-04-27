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
	
	//Every card has 3 properties. Number, Suit, and the Image
	//A list will be used.
	private List<String> cards;
    private Stack<String> deck;
	
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
    public void createDeck() {
    	Random random = new Random();
        for (int i = 0; i < 15; i++) {
            // Randomly select a card (allowing duplicates)
        	String randomCard = cards.get(random.nextInt(cards.size()));
            deck.push(randomCard); // Add to the stack
        }
    }
    
    /**
     * @return What card is on the top of the deck and removes it.
     */
    public String draw() {
        if (!deck.isEmpty()) {
            return deck.pop(); // Remove and return the top card
        } else {
            throw new IllegalStateException("The deck is empty!");
        }
    }

    
    public static void main(String[] args) {
        cardDeck cardDeck = new cardDeck(); // Initialize the cardDeck
        cardDeck.createDeck(); // Create a random deck
    }
    
}

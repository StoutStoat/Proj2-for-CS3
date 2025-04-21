import java.util.*;

/**
 * <pre>
 * Created: 4/8/2025 (DD/MM/YYYY)
 * This class handles all 52 cards. 
 * This means it will: 
 * -create a deck
 * -shuffle the deck
 * -pull cards into the deck
 * -put cards into the deck
 * -draw a random card from the deck
 * The draw will be in a FILO (First in last out) system.
 * </pre>
 */

//Interfaces from our labs will help here.
public class cardDeck
{
	
	//Every card has 3 properties. Number, Suit, and the Image
	//A listmap will be used. Keys will be suits and values will be numbers.
	
	
    public cardDeck()
    {

    }
    
    /**
     * Creates a new deck and shuffle it. 
     */
    public void createDeck()
    {
    	
    	shuffle();
    }
    
    /**
     * Pulls a random card from the deck. 
     * It will never return cards that have already been pulled.
     */
    public void randomCardFromDeck() 
    {
    	
    }
    
    /**
     * Will shuffle the deck. 
     * This will not return drawn cards into the deck. 
     */
    public void shuffle()
    {
    	
    }
    
    /**
     * Will draw the top card from the deck and return it. 
     * This also means it will remove said-card from the deck.
     */
    public void draw()
    {
    	
    }
    
    /**
     * Will put any card back in a desired spot in the deck. 
     * Will not put in duplicate cards. 
     * Will likely not be implemented in-game.
     */
    public void cutDeck()
    {}
}

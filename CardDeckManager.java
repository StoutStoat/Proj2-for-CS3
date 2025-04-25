import mayflower.*;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author StoutStoat
 *
 * @param <K> Card suit
 * @param <V> Card number
 * Meant for the CardDeck class.
 */
public interface CardDeckManager<K, V>{
	/**
	 *@return True if contains a specified card.
	 */
	public boolean containsCard(Object suit, Object number);
	
	/**
	 * @return True if deck is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * @return Card from the top of the pile.
	 */
	public V draw();
	
	/**
	 * @return True if shuffled.
	 */
	public boolean shuffle();
	
	/**
	 * @return Remaining cards in deck.
	 * Expected outcome: ["A1", "A2", "A3"] etc...
	 */
	public List<String> remainingCards();
}

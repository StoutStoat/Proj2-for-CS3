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
	 * @return A fresh deck with all 52 cards.
	 * Expected : ("A1", "A2", "A3", "A4", "A5") etc...
	 */
	public void createDeck();
	
	/**
	 *@return True if contains a specified card.
	 */
	public boolean containsCard(Integer suit, Integer number);
	
	/**
	 * @return True if deck is empty.
	 */
	public boolean isEmpty();
	
	/**
	 * @return Removed card from the top of the pile
	 * Expected : "A2"
	 */
	public String draw();
	
	/**
	 * @return Remaining cards in deck.
	 */
	public List<String> remainingCards();
	
	/**
	 * @return Discarded Card
	 */
//	public V discard(K key, V number);
//	
	//********************************************************************************************
	//********************************************************************************************
	//This section was imported from lab 17 at the bottom of the Map interface.
	//********************************************************************************************
    //********************************************************************************************
	
	class Node<K, V>
    {
        private K key;
        private V value;
        
        /*
         *  Initialize this Node with the specified key and value
         */
        protected Node(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
        
        /*
         *  Return the key stored in this Node
         */
        public K getKey()
        {
            return key;
        }
        
        /*
         *  Return the value stored in this Node
         */
        public V getValue()
        {
            return value;
        }
        
        /*
         *  Replace the value in this Node with the specified value
         *  Return the original value that was replaced.
         */
        public V setValue(V value)
        {
            V old = this.value;
            this.value = value;
            return old;
        }
        
        /*  
         *  Return true if other has the same key and value as this
         */
        public boolean equals(Object other)
        {
            //Check if other is null
            if(other == null) return false;
            
            //Check if other is an instance of Map.Entry
            if(!(other instanceof CardDeckManager.Node)) return false;
            
            //Cast other into a Map.Entry object so that Map.Entry methods can be called on it
            CardDeckManager.Node o = (CardDeckManager.Node)other;
            
            boolean keysMatch = false;
            boolean valsMatch = false;
            
            //check if keys match
            if(o.getKey() == null)
                keysMatch = key == null;
            else
                keysMatch = o.getKey().equals(key);
            
            //check if values match
            if(o.getValue() == null)
                valsMatch = value == null;
            else
                valsMatch = o.getValue().equals(value);

            //return true iff key and value of other matches this           
            return keysMatch && valsMatch;
        }
    }
}

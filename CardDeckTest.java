import mayflower.*;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Map;

public class CardDeckTest<K, V> implements CardDeckManager<K, V>
{	
	//Deck list.
	List<CardDeckManager.Node<K, V>> list;
	List<String> pile;
	public CardDeckTest()
	{
		list = new ArrayList<CardDeckManager.Node<K, V>>();
		createDeck();
	}
	
	public boolean containsCard(Object suit, Object number)
	{
		for(CardDeckManager.Node<K, V> node : list)
		{
			if(getNumber(node).equals(number) && node.equals(suit))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		if (list.size() == 0)
			return true;
		return false;
	}
	
	/**
	 * Creates a new deck of course.
	 */
	public List<String> createDeck()
	{
		list = new ArrayList<CardDeckManager.Node<K, V>>();
		pile = new ArrayList<String>();
		for (int s = 0; s < 3; s++)
		{
			List<String> listKey = new ArrayList<String>();

			for(int n = 1; n < 14; n++)
			{
				if(s == 0)
					listKey.add("C" + n);
				if(s == 1)
					listKey.add("D" + n);
				if(s == 2)
					listKey.add("S" + n);
				if(s == 3)
					listKey.add("H" + n);
				
				pile.add(listKey.get(n));

			}
		}
		
		return pile;
	}
	
	//UNFINISHED
	public String draw()
	{
		return null;
	}

	//UNFINISHED
	//Requires a key and a value to remove specific card.
//	public V discard(K key, V number)
//	{
//
//		return null;
//	}
//	
//	public V getNumber(Object key)
//	{
//		for(CardDeckManager.Node<K, V> node : list)
//		{
//			if (node.getKey().equals(key))
//			{
//				return node.getValue();
//			}
//		}
//		return null;
//	}
	
	public List<String> remainingCards()
	{
		List<String> remaining = new ArrayList<String>();
		if (isEmpty())
			return null;
		for (CardDeckManager.Node<K, V> node : list)
		{
			remaining.add(node + (String) node.getValue());
		}
		return remaining;
	}
}

import mayflower.*;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class CardDeckTest<K, V> implements CardDeckManager<K, V>
{	
	//Deck list.
	List<CardDeckManager.Node<K, V>> list;
	public CardDeckTest()
	{
		list = new ArrayList<CardDeckManager.Node<K, V>>();
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
	
	//UNFINISHED
	public List<String> createDeck()
	{
		for(int s = 0; s < 3; s++)
		{
			for(int n = 1; n < 14; n++)
			{
				
			}
		}
		return null;
	}
	
	//UNFINISHED
	public String draw()
	{
		
		String returnVar = discard();
		return returnVar;
	}

	//UNFINISHED
	//Requires a key and a value to remove specific card.
	public V discard(Object key, Object number)
	{
		for(CardDeckManager.Node<K, V> node : list)
		{
			if (node.getKey().equals(key))
			{
				for (int i = 0; i < 13; i++)
				{
					if (i == (Integer)number)
					{
						/*
						 * {A, H, S, C}
						 * [1 [1 [1 [1
						 *  2  2  2  2
						 *  3  3  3  3
						 *  4  4  4  4
						 *  5] 5] 5] 5]
						 */
						//segregate suits. 
						//Find Value (list).
						//remove unwanted item from list.
					}
				}
			}
		}
		return null;
	}
	
	public V getNumber(Object key)
	{
		for(CardDeckManager.Node<K, V> node : list)
		{
			if (node.getKey().equals(key))
			{
				return node.getValue();
			}
		}
		return null;
	}
	
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

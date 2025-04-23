import mayflower.*;

/**
 * 
 * This class should handle the UI & practical elements of the cards
 * I.E : the 'hover' effect & adjusting image depending on suit & number
 */
public class card extends Actor
{
	public card(int s, int n)
	{
		
		getImage("images/" + s + n);
	}
	public void Act()
	{
		
	}
}



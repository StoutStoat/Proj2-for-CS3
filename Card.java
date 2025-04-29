import mayflower.*;

/**
 * This will handle the game, using the cardDeck stuff.
 */

public class Card extends Actor{
	public Card()
	{
		
		
//		String suit = cardDeck.getSuit();
//		String number = cardDeck.getNumber();
//		
//		setImage("images/" + cardDeck.draw() + ".png");	
//		
		int cardNumber = (int)(Math.random() * 14);
		int cardSuit = (int) (Math.random() * 3);
		
		if (cardSuit == (0))
		{
			if(cardNumber != 0)
				setImage("images/C" + cardNumber + ".png");
			else
				setImage("images/C1.png");
		}
		if (cardSuit == (1))
		{
			if(cardNumber != 0)
				setImage("images/H" + cardNumber + ".png");
			else
				setImage("images/H1.png");
		}
		if (cardSuit == (2))
		{
			if(cardNumber != 0)
				setImage("images/S" + cardNumber + ".png");
			else
				setImage("images/S1.png");
		}
		if (cardSuit == (3))
		{
			if(cardNumber != 0)
				setImage("images/D" + cardNumber + ".png");
			else
				setImage("images/D1.png");
		}
		
		if (cardNumber != 0)
			gameBoard.total += cardNumber;
		else
			gameBoard.total ++;
		
//		gameBoard.total += Integer.valueOf(number);
	}
	public void act()
	{
		
	}
}

import mayflower.*;

/**
Created: 4/10/2025 (DD/MM/YYYY)
Creates the game board
Will switch to win or lose screens if conditions are met.
*/
public class gameBoard extends World
{
	QuitGame quit = new QuitGame();
	HitButton hit = new HitButton();
	StandButton stand = new StandButton();
	DeckButton deck = new DeckButton();
	
	
	//If over 21, lose.
	public static int total = 0;
	public static int winCount = 0;
	int toBeat = (int) ((Math.random() * 5) + 18 - 5);
	
	//Initial position for the cards
	int defX = 0;
	
    public gameBoard()
    {
    	total = 0;
//    	cardDeck.createDeck();
        setBackground("images/background.jpeg");
        addObject(quit, 10, 10);
        addObject(stand, 1400, 100);
        addObject(hit, 100, 100);
        addObject(deck, 500, 500);
        showText("Beat " + toBeat + " to win!", 1000, 1000);
        showText("Total: " + total, 700, 1000);
        showText("Win Streak : " + winCount, 100, 500);

    }

    public void act()
    {
    	
		if (Mayflower.mousePressed(quit) == true)
		{	
			Mayflower.playSound("sounds/Lost.wav");
			Mayflower.setWorld(new LoseScreen());
		}
		
		if (Mayflower.mousePressed(hit))
		{
			Mayflower.playSound("sounds/Hit.wav");
			addObject(new Card(), defX, 1000);
			defX += 30;
			showText("Total: " + total, 700, 1000);
			
		}
		
		if (Mayflower.mousePressed(stand))
		{
			
			Mayflower.playSound("sounds/Stand.wav");
			if (total > 21 || total < toBeat)
			{
				Mayflower.playSound("sounds/Lost.wav");
				Mayflower.setWorld(new LoseScreen());
			}
			else
			{
				Mayflower.playSound("sounds/Win.wav");
				Mayflower.setWorld(new WinScreen());
			}
		}
        //get to the win and lose screens/ game over high score
        //gameplay will probably need
		

    }
    
    public int getTotal()
    {
    	return total;
    }
    
}
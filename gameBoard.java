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
	Card card = new Card();
    public gameBoard()
    {
        setBackground("images/background.jpeg");
        addObject(quit, 10, 10);
        addObject(stand, 1400, 100);
        addObject(hit, 100, 100);
        addObject(deck, 500, 500);
        
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
			addObject(card, 100, 100);
		}
		if (Mayflower.mousePressed(stand))
		{
			Mayflower.playSound("sounds/Stand.wav");
		}
        //get to the win and lose screens/ game over high score
        //gameplay will probably need
    }
}
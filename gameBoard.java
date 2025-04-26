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
    public gameBoard()
    {
        setBackground("images/background.jpeg");
        addObject(quit, 100, 100);
        addObject(stand, 200, 200);
        addObject(hit, 300, 300);
        
    }

    public void act()
    {
		if (Mayflower.mousePressed(quit) == true)
		{	
			Mayflower.setWorld(new LoseScreen());
		}
		
		if (Mayflower.mousePressed(hit))
		{
			
		}
		if (Mayflower.mousePressed(stand))
		{
			
		}
        //get to the win and lose screens/ game over high score
        //gameplay will probably need
    }

    public void results()
    {
        
    }
}
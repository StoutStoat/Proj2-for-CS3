import mayflower.*;

/**
Created: 4/10/2025 (DD/MM/YYYY)
Creates the game board
Will switch to win or lose screens if conditions are met.
*/
public class gameBoard extends World
{
	QuitGame quit = new QuitGame();
    public int playersHandPosX = 0;
    public int playersHandPosY = 0;
    public gameBoard()
    {
        setBackground("images/background.jpeg");
        addObject(quit, 100, 100);
    }

    public void act()
    {
		if (Mayflower.mousePressed(quit) == true)
		{	
			Mayflower.setWorld(new LoseScreen());
		}
        //get to the win and lose screens/ game over high score
        //gameplay will probably need
    }

    public void results()
    {
        
    }
}
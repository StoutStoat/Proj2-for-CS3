import mayflower.*;

public class titleScreen extends World
{
	MouseInfo minfo = Mayflower.getMouseInfo();
	Steve steve = new Steve();
	StartGame menu = new StartGame();
	ExitGameButton exit = new ExitGameButton();
    public titleScreen()
    {
        //this is to set up the base of the title screen
        setBackground("images/Title.png");
        addObject(menu, 900, 400);
        addObject(steve, 10, 400);
        addObject(exit, 1500, 400);
        

    }

    public void act()
    {     
        //setting the world first thing
        // this will start the game and load up the gameplay screen
    	if (Mayflower.mousePressed(steve))
    	{
    		Mayflower.playSound("sounds/FLINTANDSTEEL.wav");
    	}
		if (Mayflower.mousePressed(menu) == true)
		{	
			gameBoard.total = 0;
			Mayflower.playSound("sounds/Start.wav");
			Mayflower.setWorld(new gameBoard());
		}
        // this will exit the home screen and the entire game
		if (Mayflower.mousePressed(exit) == true)
		{	
			Mayflower.exit();
		}
    }
}

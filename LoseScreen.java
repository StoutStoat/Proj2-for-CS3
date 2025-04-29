import mayflower.*;


public class LoseScreen extends World{
	MenuButton menu = new MenuButton();
	ExitGameButton exit = new ExitGameButton();
	
    public LoseScreen()
    {
        // you lose!!!!
    	setBackground("images/ExampleGameOver.png");
    	addObject(menu, 400, 700);
    	addObject(exit, 1200, 700);

    	Mayflower.playMusic("sounds/Lost.wav");
    	  	
    	gameBoard.winCount = 0;
    }

    public void act() 
    {
    	if (Mayflower.mousePressed(menu))
    	{
    		Mayflower.setWorld(new titleScreen());
    	}
    	if (Mayflower.mousePressed(exit))
    	{
    		Mayflower.exit();
    	}
    }
    
}

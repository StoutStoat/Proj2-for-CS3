import mayflower.*;

public class LoseScreen extends World{
	MenuButton menu = new MenuButton();
	ExitGameButton exit = new ExitGameButton();
    public LoseScreen() {
        // you lose!!!!
    	setBackground("images/ExampleGameOver.png");
    	addObject(menu, 100, 100);
    	addObject(exit, 200, 200);
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

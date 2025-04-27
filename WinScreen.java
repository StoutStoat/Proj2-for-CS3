import mayflower.*;

public class WinScreen extends World{
	MenuButton menu = new MenuButton();
	StartGame start = new StartGame();
	public WinScreen()
	{
		setBackground("images/WinScreen.png");
		addObject(menu, 1200, 400);
		addObject(start, 500, 400);
	}
	
	public void act()
	{
		
		if (Mayflower.mousePressed(menu) == true)
		{	
			Mayflower.setWorld(new titleScreen());
		}		
		if (Mayflower.mousePressed(start) == true)
		{	
			Mayflower.setWorld(new gameBoard());
		}
	}
	
}

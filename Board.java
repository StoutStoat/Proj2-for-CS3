import mayflower.*;

public class Board extends World
{
	MenuButton menu = new MenuButton();
	String returnBoard = LeaderBoard.returnBoard();
	public Board()
	{
		setBackground("images/background.jpeg");
		addObject(menu, 100, 100);
		showText("Last Game's Score : " + returnBoard, 1000, 700);
	}
	public void act()
	{
		
		if (Mayflower.mousePressed(menu) == true)
		{	
			gameBoard.total = 0;
			Mayflower.playSound("sounds/Stand.wav");
			Mayflower.setWorld(new titleScreen());
		}
	}
}

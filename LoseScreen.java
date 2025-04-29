import mayflower.*;


public class LoseScreen extends World{
	MenuButton menu = new MenuButton();
	ExitGameButton exit = new ExitGameButton();
	BoardButton board = new BoardButton();
	
    public LoseScreen()
    {
        // you lose!!!!
    	setBackground("images/ExampleGameOver.png");
    	addObject(menu, 400, 700);
    	addObject(exit, 1200, 700);
    	addObject(board, 800, 700);
    	Mayflower.playMusic("sounds/Lost.wav");
    	LeaderBoard.addScore(String.valueOf(gameBoard.winCount));
    	gameBoard.winCount = 0;
    }

    public void act() 
    {
    	if (Mayflower.mousePressed(menu))
    	{
    		gameBoard.total = 0;
    		Mayflower.setWorld(new titleScreen());
    	}
    	if (Mayflower.mousePressed(exit))
    	{
    		Mayflower.exit();
    	}
    	if(Mayflower.mousePressed(board))
    	{
    		Mayflower.playSound("sounds/Stand.wav");
    		Mayflower.setWorld(new Board());
    	}
    }
    
}

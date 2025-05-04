import mayflower.*;
/**
 * This class handles the screen that shows the highscores.
 * This class does NOT handle the leaderboard score, it only shows it on the screen.
 */
public class Board extends World
{
    MenuButton menu = new MenuButton();
    int returnBoard = LeaderBoard.returnBoard();
    public Board()
    {
        setBackground("images/background.jpeg");
        addObject(menu, 100, 100);
        showText("Highest Score : " + returnBoard, 1000, 700);
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

import mayflower.*;

public class titleScreen extends World
{
	MouseInfo minfo = Mayflower.getMouseInfo();
	MenuButton menu = new MenuButton();
    public titleScreen()
    {
        //this is to set up the base of the title screen
        //setBackground(/* image goes here */);
        showText("Black Jack", 200, 200, Color.BLACK);
        showText("Press 'Y' to Play", 400, 400, Color.BLACK);
        showText("Press 'N' to Quit", 600, 600, Color.BLACK);
        addObject(menu, 400, 300);
        // ^^ need coordinates for the title screen text.
    }

    public void act()
    {
        //setting the world first thing
        Mayflower.setWorld(new titleScreen());

        // this will start the game and load up the gameplay screen
        if(Mayflower.isKeyDown(Keyboard.KEY_Y))
        {
            Mayflower.setWorld(new gameBoard());
        }
        // this will exit the home screen and the entire game
//		if (minfo.getActor() == menu)
//		{	
//			Mayflower.setWorld(new gameBoard());
//		}
    }
}

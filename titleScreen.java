import mayflower.*;

public class titleScreen extends World
{
    public titleScreen()
    {
        //this is to set up the base of the title screen
        //setBackground(/* image goes here */);
        //showText("Black Jack", /* num */, /* num */, /* color */);
        //showText("Press 'Y' to Play", /* num */, /* num */, /* color */);
        //showText("Press 'N' to Quit", /* num */, /* num */, /* color */);

        // ^^ need coordinates for the title screen text.
    }

    public void act()
    {
        //setting the world first thing
        Mayflower.setWorld(new titleScreen());

        // this will start the game and load up the gameplay screen
        if(Mayflower.isKeyDown(Keyboard.KEY_Y))
        {
            //Mayflower.setWorld(/*gameplay level*/)
        }
        // this will exit the home screen and the entire game
        else if(Mayflower.isKeyDown(Keyboard.KEY_N))
        {
            System.exit();
        }
    }
}

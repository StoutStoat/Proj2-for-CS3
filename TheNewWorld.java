import mayflower.*;

public class TheNewWorld extends Mayflower{
    public TheNewWorld()
    {  
        //Please adjust window size later.
        super("Jack Black", 1920, 1080);
    }
    public void init()
    {
        Mayflower.setFullScreen(false);
        World w = new titleScreen();
        Mayflower.setWorld(w);
    }
}


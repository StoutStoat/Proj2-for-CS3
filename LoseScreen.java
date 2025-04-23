import mayflower.*;

public class LoseScreen extends World{
	MouseInfo minfo = Mayflower.getMouseInfo();
    public LoseScreen() {
        // you lose!!!!
        showText("You Lose!", 300, 150, Color.WHITE);
        showText("Retry? [1]", 300, 200, Color.WHITE);
        showText("Main Menu [2]", 300, 250, Color.WHITE);
        setBackground("images/ExampleGameOver.png");
    }

    public void act() {
        
            new MenuButton();    
        
    }
}

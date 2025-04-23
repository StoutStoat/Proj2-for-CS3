import mayflower.*;

public class LoseScreen extends World{
	MouseInfo minfo = Mayflower.getMouseInfo();
    public LoseScreen() {
        // you lose!!!!
    	setBackground("images/ExampleGameOver.png");
        showText("You Lose!", 300, 150, Color.WHITE);
        showText("Retry? [1]", 300, 200, Color.WHITE);
        showText("Main Menu [2]", 300, 250, Color.WHITE);

    }

    public void act() {
        
            new MenuButton();    
        
    }
}

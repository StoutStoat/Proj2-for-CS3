import mayflower.*;
import java.util.Date;

public class LoseScreen extends World{
	MouseInfo minfo = Mayflower.getMouseInfo();
    public LoseScreen() {
        // you lose!!!!
	setBackground("images/ExampleGameOver.png");
	try{
		Thread.sleep(4000);
	} catch (InterruptedException e){
		e.printStackTrace();
	}
	setBackground("images/White.jpeg");
        showText("You Lose!", 300, 150, Color.BLACK);
        showText("Retry? [1]", 300, 200, Color.BLACK);
        showText("Main Menu [2]", 300, 250, Color.BLACK);
    }

    public void act() {
        
            new MenuButton();    
        
    }
}

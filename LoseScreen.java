import mayflower.*;

public class LoseScreen extends World{

    public LoseScreen() {
        // you lose!!!!
        showText("You Lose!", 300, 150, Color.BLACK);
        showText("Retry? [1]", 300, 200, Color.BLACK);
        showText("Main Menu [2]", 300, 250, Color.BLACK);
    }

    public void act() {
        if (Mayflower.isKeyDown(Keyboard.KEY_1))
        {
            Mayflower.setWorld(new gameBoard());
        }
        else if (Mayflower.isKeyDown(Keyboard.KEY_2))
        {
            Mayflower.setWorld(new titleScreen());    
        }
    }
}

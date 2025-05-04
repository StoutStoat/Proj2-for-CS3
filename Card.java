import mayflower.*;

/**
 * This will handle the game, using the cardDeck stuff.
 */

public class Card extends Actor{
    private cardDeck cd;
    private String number ;
    public Card(cardDeck carddeck)
    {
        cd = carddeck;
        setImage("images/" + cd.draw() + ".png");    
    }
    public Card()
    {
        this (new cardDeck());
        // String suit = cardDeck.getSuit();
        number = cd.getNumber();
    }
    /**
     * A getter for the value of the card.
     * @returns Card number.
     */
    public int getNumber()
    {
        return Integer.valueOf(cd.getNumber());
    }
    public void act()
    {
        
    }
}

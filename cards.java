/**
 * Created: 4/8/2025 (DD/MM/YYYY)
 * 
 * This class handles all 52 cards. 
 */
import java.util.LinkedList;

public class cards {

    LinkedList<String> cardDeck;

    public cards()
    {
    //initialize deckMap
        LinkedList<String> cardDeck = new LinkedList<String>();
    }

    public void createDeck()
    {
        //4 suites, 10 numbers. Jack, Queen & King
        for (int i = 1; i < 5; i++)
        {
            for (int j = 1; j < 14; j++)
            {
                //cardDeck.add();
                cardDeck.add();
            }
        } 
        //then assign value
        assignValue();
    }

    /**
     * Assigns a value from 1 to 13 depending on the card.
     * Ace (1) to King (13)
     */
    private void assignValue()
    {
        
    };
    
    /**
     * returns value of card.
     * @return
     */
    public int returnValue()
    {
        return 0;
    };

}


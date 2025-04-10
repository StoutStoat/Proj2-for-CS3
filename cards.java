/**
 * Created: 4/8/2025 (DD/MM/YYYY)
 * 
 * This class handles all 52 cards. 
 */

public class cards {
    public static void main(String[] args) {
        
        int[] cardDeck = new int[52];
        String value[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suit[] = {"Hearts", "Diamonds", "Spades", "Clubs"};

        public void createDeck()
        {
            //4 suites, 10 numbers. Jack, Queen & King
            for (int i = 0; i < cardDeck.length; i++)
            {
                cardDeck[i] = i;
            } 
            
        }
    
        public void shuffleDeck()
        {
            //Shuffles the deck
            for (int i = 0; i < cardDeck.length; i++)
            {
                int index = (int)(Math.random*53);
                int temp = cardDeck[i];
                cardDeck[i] = cardDeck[index];
                cardDeck[index] = temp;
            } 
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
}


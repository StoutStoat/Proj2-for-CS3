[Old cardDeck.java]

// Create a Set for each suit
    Set<card> clubs = new HashSet<>();
    Set<card> spades = new HashSet<>();
    Set<card> diamonds = new HashSet<>();
    Set<card> hearts = new HashSet<>();


    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Clubs", "Spades", "Diamonds", "Hearts"};

    public cardDeck() {
        for (String value : values) {
//            clubs.add(new card("Clubs", value));
//            spades.add(new card("Spades", value));
//            diamonds.add(new card("Diamonds", value));
//            hearts.add(new card("Hearts", value));
        }
    }
    //shuffle the deck when its created, you have to convert it to a list temporarily
    private void shuffleDeck() {
    	for (String shape : suit)
    	{}
    }
   
    
  
    
    /*
     * 
     * @param suit   what list of suit to return.
     */
    public Set<card> getSuit(String suit) {
        switch (suit) {
            case "Clubs":
                return clubs;
            case "Spades":
                return spades;
            case "Diamonds":
                return diamonds;
            case "Hearts":
                return hearts;
            default:
                throw new IllegalArgumentException("Invalid suit: " + suit);
        }

       public static void main(String[] args) {
        cardDeck deck = new cardDeck();

        // Print out the sets for each suit
        System.out.println("Clubs: " + deck.getSuit("Clubs"));
        System.out.println("Spades: " + deck.getSuit("Spades"));
        System.out.println("Diamonds: " + deck.getSuit("Diamonds"));
        System.out.println("Hearts: " + deck.getSuit("Hearts"));
    }

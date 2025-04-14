public class card {
    private String suit;
    private String value;

    public card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
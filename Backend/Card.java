public class Card {
    private String rank;
    private String suit;

    private static final String[] VALID_RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"
    };
    private static final String[] VALID_SUITS = {
        "Hearts", "Diamonds", "Clubs", "Spades"
    };

    public Card(String rank, String suit) {
        if (!isValidRank(rank)) {
            throw new IllegalArgumentException("Invalid rank: " + rank);
        }
        if (!isValidSuit(suit)) {
            throw new IllegalArgumentException("Invalid suit: " + suit);
        }

        this.rank = rank;
        this.suit = suit;
    }

    private boolean isValidRank(String rank) {
        for (String r : VALID_RANKS) {
            if (r.equals(rank)) return true;
        }
        return false;
    }

    private boolean isValidSuit(String suit) {
        for (String s : VALID_SUITS) {
            if (s.equals(suit)) return true;
        }
        return false;
    }

    public boolean equals(Card other){
        if (this.rank == other.rank && this.suit == other.suit) return true;
        return false;
    }

    public String toString() {
        return rank + " of " + suit;
    }
    

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}

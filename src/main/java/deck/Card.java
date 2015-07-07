package deck;

/**
 * Created by oliv on 6/30/15.
 */
public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int hashCode() {
        return suit.hashCode()*rank.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        else if (!(other instanceof Card)) {
            return false;
        }
        else {
            return suit.equals(((Card) other).suit)
                    && rank.equals(((Card) other).rank);
        }
    }
}

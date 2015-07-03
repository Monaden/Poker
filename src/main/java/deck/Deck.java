package deck;

import gametypes.NLimitHoldem.interfaces.IDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by oliv on 6/28/15.
 */
public class Deck implements IDeck {
    private final int deckSize = 52;
    private final List<Card> deck = new ArrayList(deckSize);

    public Deck() {
        for (Suit suit : Suit.values()) {
            addAllSuit(suit);
        }
    }

    private void addAllSuit(Suit suit) {
        for (Rank rank : Rank.values()) {
            deck.add(new Card(suit, rank));
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card popTop() {
        return deck.remove(deck.size()-1);
    }

    public int cardsLeft() {
        return deck.size();
    }
}

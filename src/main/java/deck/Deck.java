package deck;

import gametypes.NLimitHoldem.interfaces.IDeck;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        deck.forEach(card -> stringBuilder.append(card.toString()+"\n"));
        return stringBuilder.toString();
    }
}

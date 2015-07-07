package gametypes.NLimitHoldem.interfaces;

import deck.Card;

/**
 * Created by oliv on 6/28/15.
 */
public interface IDeck {
    void shuffle();
    Card popTop();
    int cardsLeft();
}

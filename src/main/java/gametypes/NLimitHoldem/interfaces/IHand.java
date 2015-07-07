package gametypes.NLimitHoldem.interfaces;

import deck.Card;

/**
 * Created by oliv on 7/7/15.
 */
public interface IHand {
    void addCard(Card card);
    Card removeCard(Card card);
    Card[] emptyHand();
}

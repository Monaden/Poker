package gametypes.NLimitHoldem.interfaces;

import deck.Card;

/**
 * Created by oliv on 6/28/15.
 */
public interface IPlayer {
    void addCard(Card card);
    int  handSize();
    void fold();
    void bet(int amount);
    void raise(int amount);
    void check();
}

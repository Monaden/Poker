package gametypes.NLimitHoldem.interfaces;

import deck.Card;

/**
 * Created by oliv on 6/28/15.
 */
public interface IDealer {
    void deal(Card card, IPlayer player);
    void collectHand(IPlayer player);
}

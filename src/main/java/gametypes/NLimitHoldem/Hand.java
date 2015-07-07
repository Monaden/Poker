package gametypes.NLimitHoldem;

import deck.Card;
import gametypes.NLimitHoldem.interfaces.IHand;

/**
 * Created by oliv on 6/28/15.
 */
public class Hand implements IHand{

    private final Card[] cards;
    private int handSize = 0;

    public Hand(int maxSize){
        cards = new Card[maxSize];
    }

    public void addCard(Card card) {
        if (handSize != cards.length) {
            cards[handSize] = card;
            handSize++;
        }
    }

    public Card removeCard(Card card){
        Card result = null;
        for(int i = 0; i < cards.length; i++) {
            if (cards[i].equals(card)) {
                result = cards[0];
                shiftAllLeft();
            }
        }
        return result;
    }

    /*
     Moves all elements of the array down one index,
     sets the last element to null and reduces handSize by one
     */
    private void shiftAllLeft() {
        for (int i = 0; i < cards.length-1; i++){
            cards[i] = cards[i+1];
        }
        cards[cards.length-1] = null;
        handSize--;
    }

    public Card[] emptyHand() {
        Card[] tmp = new Card[cards.length];
        for(int i = 0; i < cards.length; i++) {
            tmp[i] = cards[i];
            cards[i] = null;
        }
        handSize = 0;
        return tmp;
    }
}

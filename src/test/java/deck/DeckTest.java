package deck;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by anton on 2015-07-08.
 */
public class DeckTest {

    @Test
    public void TestCardsLeft(){
        Deck d = new Deck();
        assertEquals(d.cardsLeft(), 52);
    }

    @Test
    public void TestPopTop(){
        Deck d = new Deck();

        assertEquals(d.cardsLeft(), 52);

        Card topCard = d.popTop();

        // the top card of a new deck is always ace of hearts
        assertEquals(topCard.getRank(), Rank.ACE);
        assertEquals(topCard.getSuit(), Suit.HEARTS);
        assertEquals(d.cardsLeft(), 51);
    }

}
package com.scquda.android.sixhandedeuchre;

import java.util.Vector;

/**
 * Created by Scott on 7/22/2015.
 */
public class Hand {
    private Vector<Card> mCards;

    Hand(Card[] starting) {
        mCards = new Vector<Card>();
        for (int i = 0; i < starting.length; i++) {
            mCards.add(starting[i]);
        }
    }

    public int getHandSize() {
        return mCards.size();
    }

    public Card getCard(int card) {
        return mCards.elementAt(card);
    }

    public Card playCard(int card) {
        Card toPlay = mCards.remove(card);
        return toPlay;
    }

    public void moveCard(int oldPos, int newPos) {
        //TODO: implment, used when player rearranges their hand
    }

}

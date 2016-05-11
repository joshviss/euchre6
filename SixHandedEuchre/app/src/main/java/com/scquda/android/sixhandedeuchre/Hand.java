package com.scquda.android.sixhandedeuchre;

import java.util.Vector;

/**
 * Created by Scott on 7/22/2015.
 */
public class Hand {
    private Vector<Card> mCards;
    private int owner;

    Hand(int playerNum) {
        // make an empty hand
        mCards = new Vector<Card>();
        owner = playerNum;
    }

    public int getHandSize() {
        return mCards.size();
    }
    public int getOwner() {
        return owner();
    }
    
    public void addCard(Card card){
        mCards.add(card);
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

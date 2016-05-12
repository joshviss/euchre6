package com.scquda.android.sixPlayeredeuchre;

import java.util.Vector;

/**
 * Created by Scott on 7/22/2015.
  * Edited by Josh on 5/11/2016
 */
public class Player {
    private Vector<Card> hand;
    private int owner;

    Player(int playerNum) {
        // make an empty hand
        hand = new Vector<Card>();
        owner = playerNum;
    }

    public int getHandSize() {
        return hand.size();
    }
    public int getOwner() {
        return owner();
    }
    
    public void addCard(Card card){
        hand.add(card);
    }

    public Card getCard(int card) {
        return hand.elementAt(card);
    }

    public Card playCard(int card) {
        Card toPlay = hand.remove(card);
        return toPlay;
    }

    public void moveCard(int oldPos, int newPos) {
        //TODO: implment, used when player rearranges their hand
    }

}

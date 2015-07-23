package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Round {

    private Bidding mCurrentBid;
    private Hand[] mHands;

    public Round() {
        mHands = new Hand[Game.NUM_PLAYERS];

        Deck deck = new Deck();

        deck.DealCards(mHands);

        //TODO: rest of function
        //TODO: bidding, trumps
    }

    public Hand getHand(int player) {
        return mHands[player];
    }

    public int getScore(int player) {
        return 0;
        //TODO: implement
    }
}

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


    }
}

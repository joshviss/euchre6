package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 8/4/2015.
 */
public class BasicAI {
    private Hand mHand;

    public BasicAI() {

    }

    public void setHand(Hand hand) {
        mHand = hand;
    }

    public Card playCard() {
        //Todo: implement logic
        return mHand.playCard(0);
    }
}

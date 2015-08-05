package com.scquda.android.sixhandedeuchre;

import android.content.Context;

/**
 * Created by josh on 7/11/2015.
 * Description:
 */
public class Card {

    //Rank of the card
    public enum Rank {NINE, TEN, JACK, QUEEN, KING, ACE};
    //Suit of the card
    public enum Suit {DIAMOND, SPADE, HEART, CLUB};
    //Color
    public enum Color {RED, BLACK};

    private Rank mRank;
    private Suit mSuit;

    Card(Rank rank, Suit suit) {
        mRank = rank;
        mSuit = suit;
    }

    public Rank getRank() {
        return mRank;
    }

    public Suit getSuit() {
        return mSuit;
    }

    public Color getColor() {
        return Color.values()[mSuit.ordinal()%2];
    }

    public int getImageID(Context context) {
        //TODO: add card PNGs to res/raw
        //TODO: name them in a way that we can construct the strings by Rank and Suit
        String cardName;
        //TODO: construct cardName
        return context.getResources().getIdentifier(cardName, "Drawable", context.getPackageName());
    }

}

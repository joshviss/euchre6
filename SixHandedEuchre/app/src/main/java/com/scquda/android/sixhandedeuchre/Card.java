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
    
    //returns the Suit of this card, taking trump into consideration
    //ie. If of partner suit and is a JACK, then the card is trump suit
    public Suit getTrumpSuit(Suit trump) {
        //checks if jack and partner suit
        if(mRank == Rank.JACK) {
            //checks if partner suit
            if((mSuit % 2) == (trump % 2)) {
                return trump;
            }
        }
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

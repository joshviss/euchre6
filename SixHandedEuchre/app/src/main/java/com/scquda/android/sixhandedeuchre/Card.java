package com.scquda.android.sixhandedeuchre;

/**
 * Created by josh on 7/11/2015.
 * Description:
 */
public class Card {
    //Rank of the card
    public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};

    //Suit of the card
    public enum Suit {DIAMOND, HEART, SPADE, CLUB};

    public Suit cardSuit;
    public Rank cardRank;
}

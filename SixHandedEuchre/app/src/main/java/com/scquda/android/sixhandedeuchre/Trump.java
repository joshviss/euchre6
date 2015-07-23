package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public interface Trump {
    //Compare() returns one of these values as the winner
    public static final int FIRST = 1;
    public static final int SECOND = 2;

    public int Compare(Card first, Card second);
    //We can assume the first card is the leading suit (or trump)

}

package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class HighTrump implements Trump {

    public HighTrump() {

    }

    public int Compare(Card first, Card second) {
        //We can assume the first card is the leading suit (or trump)
        return FIRST;  //TODO: fill in function
    }
}
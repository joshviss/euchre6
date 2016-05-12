package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 8/4/2015.
  * Edited by Josh on 5/11/2016
 */
public class BasicAI extends Player {

    public BasicAI() {

    }

    public Card playCard() {
        //Todo: implement logic
        return hand.playCard(0);
    }
}

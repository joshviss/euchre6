package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Game {

    public static final int NUM_PLAYERS = 6;

    private int mScores[];
    private Round mCurrentRound;

    public Game() {
        mScores = new int[NUM_PLAYERS];
        for (int i = 0; i < NUM_PLAYERS; i++) {
            mScores[i] = 0;
        }
    }
}

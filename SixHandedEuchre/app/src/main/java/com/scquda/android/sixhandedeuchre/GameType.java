package com.scquda.android.sixhandedeuchre;

import android.content.Context;

/**
 * Created by tony 05/01/2016
 * Description:
 */
public class GameType {

    // Type of game
    public static final enum type {LOCAL, SINGLE, WORLD};

    private int gameType;

    GameType(int typeOfGame) {
        gameType = typeOfGame;
    }

    public Rank getRank() {
        return mRank;
    }
}

package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class SuitTrump
{
    //Compare() returns one of these values as the winner
    public static final int FIRST = 1;
    public static final int SECOND = 2;

    private Card.Suit mTrumpSuit;

    public SuitTrump(Card.Suit trump) {
        mTrumpSuit = trump;
    }

    public int Compare(Card first, Card second) {
		// First card is trump
		// Second card is trump
		// Neither are trump, traditional comparison. If the same card, first always wins
		if (first.getSuit().equals(mTrumpSuit)) && !second.getSuit().equals(mTrumpSuit)){
			return FIRST;
		}if (!first.getSuit().equals(mTrumpSuit)) && second.getSuit().equals(mTrumpSuit)){
			return SECOND;
		}if (first.getSuit().equals(mTrumpSuit)) && second.getSuit().equals(mTrumpSuit)){
			if (first.getRank() >= second.getRank){
				return FIRST;
			}
			return SECOND;
		}
    }
}

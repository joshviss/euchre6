package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class HighTrump extends SuitTrump {

    public HighTrump() {
        super(Card.Suit.CLUB);
    }

    public int Compare(Card first, Card second) {
		if (first.getSuit() == second.getSuit()){
			if (first.getRank() >= second.getRank){
					return FIRST;
			}else{
				return SECOND;
			}
		}
		return FIRST;
    }
}

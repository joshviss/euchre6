package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Bidding {

    private SuitTrump mTrump;
    private int mBiddingPlayer;

    public enum TrumpType {SUIT, HIGH, LOW};

    public Bidding(int bidder, TrumpType type, Card.Suit trumpSuit) {
        mBiddingPlayer = bidder;

        if (type == TrumpType.SUIT) {
            mTrump = new SuitTrump(trumpSuit);
        } else if (type == TrumpType.HIGH) {
            mTrump = new HighTrump();
        } else if (type == TrumpType.LOW) {
            mTrump = new LowTrump();
        }

    }

    public int compareCards(Card first, Card second) {
        return mTrump.Compare(first, second);
    }

    public int getBiddingPlayer() {
        return mBiddingPlayer;
    }
}

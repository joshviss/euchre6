package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
 */
public class Round {

    private Bidding mCurrentBid;
    private int startingBidPlayer;
    private Hand[] mHands;
    private int numTricks;
    private GameType gameType;
    
    //numTricks of the card
    public enum numTricks {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, SHOOT, DOUBLE_SHOOT, TRIPLE_SHOOT};
    
    public Round(GameType type) {
        gameType = type;
        Deck deck = new Deck();
        mHands = new Hand[Game.NUM_PLAYERS];
        int playerNum = 0;
        
        // Set which hand belongs to which player
        for (int i = 0; i < Game.NUM_PLAYERS; i++){
            mHands[i] = new Hand(i)
        }
        deck.DealCards(mHands);

        //TODO: Randomize the starting player
        startingBidPlayer = 0;
        reArrangeStartingPlayer(startingBidPlayer);
        
        //TODO: Display cards player has
    
        // Gameplay differs with each mode
        if (gameType == AvailableGameTypes.SINGLE){
            for (int i = 0; i < Game.NUM_PLAYERS; i++){
                // TODO: Bidding
            }
            
            // Play cards
            for (int i = 0; i < 8; i++){
                for (int j = 0; j < Game.NUM_PLAYERS; j++){
                    // TODO: Play cards, compare, select winner
                    winner = 0;
                    reArrangeStartingPlayer(winner);
                }
            }
        }else if (gameType == AvailableGameTypes.LOCAL){
            //TODO
        }else if (gameType == AvailableGameTypes.WORLD){
            //TODO
        }
        
    }

    public Hand getHand(int player) {
        return mHands[player];
    }

    public int getScore(int player) {
        return 0;
        //TODO: implement
    }
    
    private void reArrangeStartingPlayer(int newStartingPlayer){
        for (int i = 0; i < newStartingPlayer; i++){
            mHands.add(mHands[0]);
            mHands.remove(0);
        }
    }
}

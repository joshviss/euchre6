package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
  * Edited by Josh on 5/11/2016
 */
public class Round {

    private Bidding mCurrentBid;
    private int startingBidPlayer;
    private Player[] players;
    private int numTricks;
    private GameType gameType;
    
    //numTricks of the card
    public enum numTricks {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, SHOOT, DOUBLE_SHOOT, TRIPLE_SHOOT};
    
    public Round(GameType type) {
        gameType = type;
        Deck deck = new Deck();
        player = new Player[Game.NUM_PLAYERS];
        int playerNum = 0;
        
        // Set which hand belongs to which player
        for (int i = 0; i < Game.NUM_PLAYERS; i++){
            players[i] = new Player(i)
        }
        deck.DealCards(players);

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

    public Player getPlayer(int playerNum) {
        return players[playerNum];
    }

    public int getScore(int player) {
        return 0;
        //TODO: implement
    }
    
    private void reArrangeStartingPlayer(int newStartingPlayer){
        for (int i = 0; i < newStartingPlayer; i++){
            players.add(players[0]);
            players.remove(0);
        }
    }
}

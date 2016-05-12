package com.scquda.android.sixhandedeuchre;

/**
 * Created by Scott on 7/22/2015.
  * Edited by Josh on 5/11/2016
 */
public class Deck {

    private Card[] mCards;

    public final static int DECK_SIZE = 48;
    private final static int CARD_COPIES = 2;

    public Deck() {
        mCards = new Card[DECK_SIZE];

        int curCard = 0;
        Card.Rank[] ranks = Card.Rank.values();
        Card.Suit[] suits = Card.Suit.values();

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                for (int k = 0; k < CARD_COPIES; k++) {
                    mCards[curCard] = new Card(ranks[i], suits[j]);
                    curCard++;
                }
            }
        }

        Shuffle();
    }

    private void Shuffle() {
        List<Card> list = Arrays.asList(mCards);
        Collections.shuffle(list);
        mCards = list.toArray();
    }

    public void DealCards(Player[] players) {
        // 8 cards in each player's hand
        for (int j = 0; j < players.length +; j++){
            for (int i = 0; i < 8; i++){
                players[j].addCard(mCards[i + (8 * j)]);
            }
        }
    }
}

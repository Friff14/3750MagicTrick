package cs3750.magictrick;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = addDeck();
    }

    public void shuffle() {
        //Shuffles the available cards
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));

    }

    public ArrayList<Card> random21() {
        deck = addDeck();
        shuffle();
        ArrayList<Card> listOfCards = new ArrayList<>();
        for(int i = 0; i < 21; i++){
            listOfCards.add(deck.remove(0));
        }
        return listOfCards;
    }

    private ArrayList<Card> addDeck() {
        //Create and load in the deck
        ArrayList<Card> deckList = new ArrayList<Card>();
        String[] faces = new String[]{
                "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
        };
        String[] suits = new String[]{"Hearts", "Spades", "Diamonds", "Clubs"};
        for (String face : faces) {
            for (String suit : suits) {
                deckList.add(new Card(face, suit));
            }
        }
        return deckList;
    }
}

package cs3750.magictrick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();

        //Minimum of two decks
        addDeck();
        addDeck();

        shuffle();
    }

    public void shuffle(){
        //Shuffles the available cards
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));

    }

    public void random21(){

    }

    private void addDeck(){
        //Create and load in the deck

        //Hearts
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//
//        //Diamonds
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//
//        //Clubs
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//        cards.add( new Card();
//
//        //Spades
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
//        cards.add( new Card());
    }
}

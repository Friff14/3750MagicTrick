package cs3750.magictrick;

import java.util.Stack;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Dealer {
    private int dealNumber;
    private Stack<Card> pickedUpCards;
    private Deck deck;
    private Board board;

    public Dealer(){
        dealNumber = 0;
        pickedUpCards = new Stack<>();
        board = new Board();
        deck = new Deck();
        deck.shuffle();

        for (Card card : deck.random21())
        {
            pickedUpCards.push(card);
        }
    }

    public Column[] deal()
    {
        
        int i = 0;
        while (!pickedUpCards.isEmpty())
        {
            board.addToColumn(i,pickedUpCards.pop());
            i++;

            if (i>=3)
            {
                i=0;
            }
        }
    }
    public void revealCard(){

    }
    public void pickUpCard(){
        Player player = new Player();
        Board
    }
}

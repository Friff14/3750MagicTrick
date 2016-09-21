package cs3750.magictrick;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Dealer {
    public int dealNumber;
    private Stack<Card> hand;
    private Deck deck;

    public Dealer(){
        dealNumber = 0;
        hand = new Stack<>();
        deck = new Deck();
        //deck.shuffle();
        ArrayList<Card> c = deck.random21();
        for (Card card : c)
        {
            hand.push(card);
        }
    }

    public void deal(Board board)
    {
        int i = 0;
        while (!hand.isEmpty())
        {
            board.addToColumn(i,hand.pop());
            i++;

            if (i>=3)
            {
                i=0;
            }
        }
        dealNumber++;
    }

    public Card revealCard(Board board)
    {
        return board.getColumn(1)[3];
    }

    //Picks up the cards in board in the correct order for the trick
    public void pickUpCards(Board board, int columnSelected)
    {
        switch (columnSelected)
        {
            case 0:
                pickUpColumn(board,1);
                pickUpColumn(board,0);
                pickUpColumn(board,2);
                break;
            case 1:
                pickUpColumn(board,0);
                pickUpColumn(board,1);
                pickUpColumn(board,2);
                break;
            case 2:
                pickUpColumn(board,0);
                pickUpColumn(board,2);
                pickUpColumn(board,1);
                break;
        }
    }

    // Picks up the column indicated and adds the cards to pickedUpCards.
    private void pickUpColumn(Board board, int id)
    {
        for(Card card: board.getColumn(id))
        {
            hand.add(card);
        }
    }
}

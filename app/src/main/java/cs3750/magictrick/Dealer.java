package cs3750.magictrick;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Dealer {
    private int dealNumber;
    private Stack<Card> pickedUpCards;
    private Deck deck;

    public Dealer(){
        dealNumber = 0;
        pickedUpCards = new Stack<>();
        deck = new Deck();
        //deck.shuffle();
        ArrayList<Card> c = deck.random21();
        for (Card card : c)
        {
            pickedUpCards.push(card);
        }
    }

    public void deal(Board board)
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

    public Card revealCard(Board board)
    {
        return board.getColumn(2)[4];
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
            pickedUpCards.add(card);
        }
    }
}

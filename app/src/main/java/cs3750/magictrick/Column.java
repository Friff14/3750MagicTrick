package cs3750.magictrick;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Column {
    private int id;
    Card[] cards;
    int nextEmptySpot;

    public void resetNextEmptySpot(){
        nextEmptySpot = 0;
    }

    public  Column(){
        cards = new Card[7];
        nextEmptySpot = 0;
    }

    public void addCard(Card card){
        cards[nextEmptySpot] = card;
        nextEmptySpot++;
    }
}

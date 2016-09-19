package cs3750.magictrick;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Board {

    Column[] columns;

    public Board(){
       columns = new Column[3];
    }

    public void addToColumn(int columnID, Card card) {

        columns[columnID].addCard(card);
    }

    public Card[] getColumn(int columnID){

        return columns[columnID].cards;
    }
}

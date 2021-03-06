package cs3750.magictrick;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Board {

    Column[] columns;

    public Board(){
        columns = new Column[3];
        columns[0] = new Column();
        columns[1] = new Column();
        columns[2] = new Column();
    }

    public void addToColumn(int columnID, Card card) {

        columns[columnID].addCard(card);
    }

    public Card[] getColumn(int columnID){

        return columns[columnID].cards;
    }
    public void resetBoard(){
        for(int i = 0; i < 3; i++)
            columns[i].resetNextEmptySpot();
    }
}

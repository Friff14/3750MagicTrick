package cs3750.magictrick;

import android.app.Activity;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Player
{
    //flag that indicates that a card has been chosen.
    private boolean hasSelectedCard;


    /**
     * Constructor. sets hasSelectedCard to false;
     */
    public Player()
    {
        hasSelectedCard = false;
    }

    /**
     * Indicates a column
     */
    public void indicateColumn(int column)
    {
        /*TODO Prompt a user somewhere to choose a column?
        maybe we should have a message area that's always on the screen, rather than taking up space with a dialog box.
         */
    }

    /**
     * Indicates that a card has been selected
     */
    public void pickCard()
    {
        //TODO probably more stuff.
        hasSelectedCard = true;
    }
}

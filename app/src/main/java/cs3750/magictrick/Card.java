package cs3750.magictrick;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Card {
    private String face;
    private String suit;

    public void setFace(String face) {
        this.face = face;
    }
    public String getFace(){
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Card(String face, String suit){

    }
}

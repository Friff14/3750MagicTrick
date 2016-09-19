package cs3750.magictrick;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sethalumps on 9/14/2016.
 */
public class Card {
    private String face;
    private String suit;
    private static Map<String, HashMap> cardImages = null;

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

    private void putCards(){
        cardImages = new HashMap<>();
        cardImages.put("Clubs", new HashMap<String, Integer>());
        cardImages.put("Hearts", new HashMap<String, Integer>());
        cardImages.put("Spades", new HashMap<String, Integer>());
        cardImages.put("Diamonds", new HashMap<String, Integer>());

        HashMap clubs = cardImages.get("Clubs");
        clubs.put("A", R.drawable.ace_clubs);
        clubs.put("2", R.drawable.two_clubs);
        clubs.put("3", R.drawable.three_clubs);
        clubs.put("4", R.drawable.four_clubs);
        clubs.put("5", R.drawable.five_clubs);
        clubs.put("6", R.drawable.six_clubs);
        clubs.put("7", R.drawable.seven_clubs);
        clubs.put("8", R.drawable.eight_clubs);
        clubs.put("9", R.drawable.nine_clubs);
        clubs.put("10", R.drawable.ten_clubs);
        clubs.put("J", R.drawable.jack_clubs);
        clubs.put("Q", R.drawable.queen_clubs);
        clubs.put("K", R.drawable.king_clubs);

        HashMap diamonds = cardImages.get("Diamonds");
        diamonds.put("A", R.drawable.ace_diamonds);
        diamonds.put("2", R.drawable.two_diamonds);
        diamonds.put("3", R.drawable.three_diamonds);
        diamonds.put("4", R.drawable.four_diamonds);
        diamonds.put("5", R.drawable.five_diamonds);
        diamonds.put("6", R.drawable.six_diamonds);
        diamonds.put("7", R.drawable.seven_diamonds);
        diamonds.put("8", R.drawable.eight_diamonds);
        diamonds.put("9", R.drawable.nine_diamonds);
        diamonds.put("10", R.drawable.ten_diamonds);
        diamonds.put("J", R.drawable.jack_diamonds);
        diamonds.put("Q", R.drawable.queen_diamonds);
        diamonds.put("K", R.drawable.king_diamonds);

        HashMap spades = cardImages.get("Spades");
        spades.put("A", R.drawable.ace_spades);
        spades.put("2", R.drawable.two_spades);
        spades.put("3", R.drawable.three_spades);
        spades.put("4", R.drawable.four_spades);
        spades.put("5", R.drawable.five_spades);
        spades.put("6", R.drawable.six_spades);
        spades.put("7", R.drawable.seven_spades);
        spades.put("8", R.drawable.eight_spades);
        spades.put("9", R.drawable.nine_spades);
        spades.put("10", R.drawable.ten_spades);
        spades.put("J", R.drawable.jack_spades);
        spades.put("Q", R.drawable.queen_spades);
        spades.put("K", R.drawable.king_spades);

        HashMap hearts = cardImages.get("Hearts");
        hearts.put("A", R.drawable.ace_hearts);
        hearts.put("2", R.drawable.two_hearts);
        hearts.put("3", R.drawable.three_hearts);
        hearts.put("4", R.drawable.four_hearts);
        hearts.put("5", R.drawable.five_hearts);
        hearts.put("6", R.drawable.six_hearts);
        hearts.put("7", R.drawable.seven_hearts);
        hearts.put("8", R.drawable.eight_hearts);
        hearts.put("9", R.drawable.nine_hearts);
        hearts.put("10", R.drawable.ten_hearts);
        hearts.put("J", R.drawable.jack_hearts);
        hearts.put("Q", R.drawable.queen_hearts);
        hearts.put("K", R.drawable.king_hearts);

    }
    public Card(String face, String suit){
        setFace(face);
        setSuit(suit);
        if (cardImages == null){
            putCards();
        }
    }

    public int getCardImage(){
        return (int) cardImages.get(getSuit()).get(getFace());
    }
}

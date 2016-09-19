/*
 * MainActivity is the Player
 */
package cs3750.magictrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] imageViews;
    protected boolean hasSelectedCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViews = new ImageView[] {(ImageView)findViewById(R.id.imageView1),
                (ImageView)findViewById(R.id.imageView2),(ImageView)findViewById(R.id.imageView3),
                (ImageView)findViewById(R.id.imageView4),(ImageView)findViewById(R.id.imageView5),
                (ImageView)findViewById(R.id.imageView6),(ImageView)findViewById(R.id.imageView7),
                (ImageView)findViewById(R.id.imageView8),(ImageView)findViewById(R.id.imageView9),
                (ImageView)findViewById(R.id.imageView10),(ImageView)findViewById(R.id.imageView11),
                (ImageView)findViewById(R.id.imageView12),(ImageView)findViewById(R.id.imageView13),
                (ImageView)findViewById(R.id.imageView14),(ImageView)findViewById(R.id.imageView15),
                (ImageView)findViewById(R.id.imageView16),(ImageView)findViewById(R.id.imageView17),
                (ImageView)findViewById(R.id.imageView18),(ImageView)findViewById(R.id.imageView19),
                (ImageView)findViewById(R.id.imageView20),(ImageView)findViewById(R.id.imageView21),
        };


        Integer[] imageId = {
                R.drawable.ace_clubs,
                R.drawable.ace_diamonds,
                R.drawable.ace_hearts,
                R.drawable.ace_spades,
                R.drawable.king_clubs,
                R.drawable.king_diamonds,
                R.drawable.king_hearts,
                R.drawable.ace_clubs,
                R.drawable.ace_diamonds,
                R.drawable.ace_hearts,
                R.drawable.ace_spades,
                R.drawable.king_clubs,
                R.drawable.king_diamonds,
                R.drawable.king_hearts,
                R.drawable.ace_clubs,
                R.drawable.ace_diamonds,
                R.drawable.ace_hearts,
                R.drawable.ace_spades,
                R.drawable.king_clubs,
                R.drawable.king_diamonds,
                R.drawable.king_hearts
        };
        for(int i = 0; i < 7; i++){
            imageViews[i].setImageResource(imageId[i]);
        }
        for(int i = 7; i < 14; i++){
            imageViews[i].setImageResource(imageId[i]);
        }
        for(int i = 14; i < 21; i++){
            imageViews[i].setImageResource(imageId[i]);
        }

        //don't have a good spot for this as of this moment.
        hasSelectedCard = false;
    } // onCreate

    /**
     * Indicates a column
     */
    public int indicateColumn() {

        //this will get replaced by the UI that actually indicates the column choice
        int playerChoice = 0;

        return playerChoice;
    }

    /**
     * Setter for hasSelectedCard. Indicates that a card has been selected
     */
    public void pickCard() {
        hasSelectedCard = true;
    }
}
/*
 * MainActivity is the Player
 */
package cs3750.magictrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView[][] imageViews;
    protected boolean hasSelectedCard;
    private Dealer dealer = new Dealer();
    private Board board = new Board();
    private Button columnOne;
    private Button columnTwo;
    private Button columnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViews = new ImageView[][] {
            {(ImageView)findViewById(R.id.imageView1),(ImageView)findViewById(R.id.imageView2),
             (ImageView)findViewById(R.id.imageView3),(ImageView)findViewById(R.id.imageView4),
             (ImageView)findViewById(R.id.imageView5),(ImageView)findViewById(R.id.imageView6),
             (ImageView)findViewById(R.id.imageView7)},
            {(ImageView)findViewById(R.id.imageView8),(ImageView)findViewById(R.id.imageView9),
             (ImageView)findViewById(R.id.imageView10),(ImageView)findViewById(R.id.imageView11),
             (ImageView)findViewById(R.id.imageView12),(ImageView)findViewById(R.id.imageView13),
             (ImageView)findViewById(R.id.imageView14)},
            {(ImageView)findViewById(R.id.imageView15),(ImageView)findViewById(R.id.imageView16),
             (ImageView)findViewById(R.id.imageView17),(ImageView)findViewById(R.id.imageView18),
             (ImageView)findViewById(R.id.imageView19),(ImageView)findViewById(R.id.imageView20),
             (ImageView)findViewById(R.id.imageView21)}
        };
        columnOne   = (Button)findViewById(R.id.columnOne);
        columnTwo   = (Button)findViewById(R.id.columnTwo);
        columnThree = (Button)findViewById(R.id.columnThree);

        columnOne.setOnClickListener(this);
        columnTwo.setOnClickListener(this);
        columnThree.setOnClickListener(this);
        displayBoard();


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
    private void displayBoard(){
        dealer.deal(board);
        Card[] c;
        for(int i = 0; i < 3; i++){
            c = board.getColumn(i);
            for(int j = 0; j < 7; j++){
                imageViews[i][j].setImageResource(c[j].getCardImage());
            }
        }
    }



    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.columnOne :
                dealer.pickUpCards(board,0);
                break;
            case R.id.columnTwo :
                dealer.pickUpCards(board,1);
                break;
            case R.id.columnThree :
                dealer.pickUpCards(board,2);
                break;
            default:
                break;
        }
        this.displayBoard();
        //Toast.makeText(MainActivity.this,testText,Toast.LENGTH_SHORT).show();
    }
}
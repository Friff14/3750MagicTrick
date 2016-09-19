package cs3750.magictrick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] imageViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViews = new ImageView[] {(ImageView)findViewById(R.id.imageView1),
                (ImageView)findViewById(R.id.imageView4),(ImageView)findViewById(R.id.imageView7),
                (ImageView)findViewById(R.id.imageView10),(ImageView)findViewById(R.id.imageView13),
                (ImageView)findViewById(R.id.imageView16),(ImageView)findViewById(R.id.imageView19),
                (ImageView)findViewById(R.id.imageView2),(ImageView)findViewById(R.id.imageView5),
                (ImageView)findViewById(R.id.imageView8),(ImageView)findViewById(R.id.imageView11),
                (ImageView)findViewById(R.id.imageView14),(ImageView)findViewById(R.id.imageView17),
                (ImageView)findViewById(R.id.imageView20),(ImageView)findViewById(R.id.imageView3),
                (ImageView)findViewById(R.id.imageView6),(ImageView)findViewById(R.id.imageView9),
                (ImageView)findViewById(R.id.imageView12),(ImageView)findViewById(R.id.imageView15),
                (ImageView)findViewById(R.id.imageView18),(ImageView)findViewById(R.id.imageView21),
        };
        Dealer dealer = new Dealer();
        Board board = new Board();
        dealer.deal(board);
        Card[] c;
        for(int i = 0; i<3; i++){
            c = board.getColumn(i);
            for(int j = 0; j < 21; j++){
                imageViews[j].setImageResource(c[j].getCardImage());
            }
        }
    }
}
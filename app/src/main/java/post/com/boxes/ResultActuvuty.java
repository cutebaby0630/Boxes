package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActuvuty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_actuvuty);
        TextView box = findViewById(R.id.box);
        TextView dimention = findViewById(R.id.dimention);
        TextView price = findViewById(R.id.price);
        float result = getIntent().getFloatExtra("box",3);
        if(result ==3){
            box.setText("Box 3");
            dimention.setText("Dimension: 23 / 14 / 13 cm");
            price.setText("Price:  65");
        }
        else {
            box.setText("Box 5");
            dimention.setText("Dimension: 39.5 / 27.5 / 23 cm");
            price.setText("Price:  90");
        }

    }
}

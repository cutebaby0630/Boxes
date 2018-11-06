package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public float BOX3 =3;
    public float BOX5 = 5;
    private EditText edlength;
    private EditText edwidth;
    private EditText edheight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View view){
        edlength = findViewById(R.id.ed_length);
        edwidth = findViewById(R.id.ed_width);
        edheight = findViewById(R.id.ed_height);
        float length = Float.parseFloat(edlength.getText().toString());
        float width = Float.parseFloat(edwidth.getText().toString());
        float height = Float.parseFloat(edheight.getText().toString());
        Intent intent = new Intent(this,ResultActuvuty.class);
        if(length<=23&&width<=14&&height<=13){
            intent.putExtra("box",BOX3);
            startActivity(intent);
        }else{
            intent.putExtra("box",BOX5);
            startActivity(intent);
        }

    }
}

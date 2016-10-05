package org.t_robop.kishimoto.omikuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5;
    int name[] =new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent i = getIntent();
        name = i.getIntArrayExtra("point");

        textView1 = (TextView)findViewById(R.id.text1);
        textView2 = (TextView)findViewById(R.id.text2);
        textView3 = (TextView)findViewById(R.id.text3);
        textView4 = (TextView)findViewById(R.id.text4);
        textView5 = (TextView)findViewById(R.id.text5);

        textView1.setText("大吉 "+String.valueOf(name[0])+"回");
        textView2.setText("中吉 "+String.valueOf(name[1])+"回");
        textView3.setText("小吉 "+String.valueOf(name[2])+"回");
        textView4.setText("吉 "+String.valueOf(name[3])+"回");
        textView5.setText("凶 "+String.valueOf(name[4])+"回");

    }
}

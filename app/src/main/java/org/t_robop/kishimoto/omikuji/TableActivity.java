package org.t_robop.kishimoto.omikuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5;
    int name1,name2,name3,name4,name5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        /**隠す**/
        Intent i = getIntent();
        name1 = i.getIntExtra("point1",0);
        name2 = i.getIntExtra("point2",0);
        name3 = i.getIntExtra("point3",0);
        name4 = i.getIntExtra("point4",0);
        name5 = i.getIntExtra("point5",0);
        /**隠す**/


        textView1 = (TextView)findViewById(R.id.text1);
        textView2 = (TextView)findViewById(R.id.text2);
        textView3 = (TextView)findViewById(R.id.text3);
        textView4 = (TextView)findViewById(R.id.text4);
        textView5 = (TextView)findViewById(R.id.text5);

        textView1.setText("大吉 "+String.valueOf(name1)+"回");
        textView2.setText("中吉 "+String.valueOf(name2)+"回");
        textView3.setText("小吉 "+String.valueOf(name3)+"回");
        textView4.setText("吉 "+String.valueOf(name4)+"回");
        textView5.setText("凶 "+String.valueOf(name5)+"回");

    }
}

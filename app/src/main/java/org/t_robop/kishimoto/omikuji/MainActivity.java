package org.t_robop.kishimoto.omikuji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //占うボタンを押したときの動作
    public void onClick(View v){

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);

        if(count == 0) {
            //乱数を生成させる
            Random r = new Random();
            int num = r.nextInt(5);

            imageView = (ImageView) findViewById(R.id.imageView);

            //生成した乱数によって場合分け
            if (num == 0) {
                imageView.setImageResource(R.drawable.daikichitext2);
            } else if (num == 1) {
                imageView.setImageResource(R.drawable.tyuukichitext);
            } else if (num == 2) {
                imageView.setImageResource(R.drawable.syoukichitext);
            } else if (num == 3) {
                imageView.setImageResource(R.drawable.kichitext);
            } else {
                imageView.setImageResource(R.drawable.kyoutext);
            }

            button.setText("戻る");

            count++;
        }

        else if(count == 1){
            imageView.setImageResource(R.drawable.omkj3);
            button.setText("占う");
            count--;
        }
    }


}

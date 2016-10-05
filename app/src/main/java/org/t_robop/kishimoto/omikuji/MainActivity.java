package org.t_robop.kishimoto.omikuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    boolean count = false;
    ImageView imageView;
    Button button;
    int point[] = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
    }

    //占うボタンを押したときの動作
    public void onClick(View v){

        if(count == false) {
            //乱数を生成させる
            Random r = new Random();
            int num = r.nextInt(5);

            imageView = (ImageView) findViewById(R.id.imageView);

            //生成した乱数によって場合分け
            switch (num){

                case 0:
                    imageView.setImageResource(R.drawable.daikichitext);
                    point[0]++;
                    break;


                case 1:
                    imageView.setImageResource(R.drawable.tyuukichitext);
                    point[1]++;
                    break;


                case 2:
                    imageView.setImageResource(R.drawable.syoukichitext);
                    point[2]++;
                    break;


                case 3:
                    imageView.setImageResource(R.drawable.kichitext);
                    point[3]++;
                    break;


                case 4:
                    imageView.setImageResource(R.drawable.kyoutext);
                    point[4]++;
                    break;


                default:
                    break;


            }


            /*
            if (num == 0) {
                imageView.setImageResource(R.drawable.daikichitext);
            }

            else if (num == 1) {
                imageView.setImageResource(R.drawable.tyuukichitext);
            }

            else if (num == 2) {
                imageView.setImageResource(R.drawable.syoukichitext);
            }

            else if (num == 3) {
                imageView.setImageResource(R.drawable.kichitext);
            }

            else {
                imageView.setImageResource(R.drawable.kyoutext);
            }
            */


            button.setText(R.string.Return);

            count = true;
        }

        else if(count == true){
            imageView.setImageResource(R.drawable.omkj);
            button.setText(R.string.button1);
            count = false;
        }
    }

//    public void onClick2(View v){
//        Intent intent = new Intent(this, TableActivity.class);
//        intent.putExtra("point", point[0]);
//        startActivity(intent);
//    }

}

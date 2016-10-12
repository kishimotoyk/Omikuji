package org.t_robop.kishimoto.omikuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

//メイン文
public class MainActivity extends AppCompatActivity {

    //場合分けに使うための整数の入る変数
    int num;

    //ボタンの押された時の動作を二個用意するための◯×が入る変数
    boolean count = false;

    //画像を入れるための変数
    ImageView imageView;

    //ボタンのテキストを変えるのに使う変数
    Button button;

    //統計に関する出た回数をカウントする変数
    int point1,point2,point3,point4,point5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xmlとの関連付け
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button)findViewById(R.id.button);
    }

    //ボタンを押したときの動作
    public void onClick(View v){

        //占うボタンが押された時の動作
        if(count == false) {

            //乱数を生成させる
            Random r = new Random();
            num = r.nextInt(5);

            //生成した乱数によって場合分け
            switch (num){

                //乱数の結果大吉だった場合
                case 0:
                    //大吉の画像をセットする
                    imageView.setImageResource(R.drawable.daikichitext);
                    //統計を取るためにカウントする
                    point1++;
                    //switchのループから脱出
                    break;

                //乱数の結果中吉だった場合
                case 1:
                    //中吉の画像をセットする
                    imageView.setImageResource(R.drawable.tyuukichitext);
                    //統計を取るためにカウントする
                    point2++;
                    //switchのループから脱出
                    break;

                //乱数の結果小吉だった場合
                case 2:
                    //小吉の画像をセットする
                    imageView.setImageResource(R.drawable.syoukichitext);
                    //統計を取るためにカウントする
                    point3++;
                    //switchのループから脱出
                    break;

                //乱数の結果吉だった場合
                case 3:
                    //吉の画像をセットする
                    imageView.setImageResource(R.drawable.kichitext);
                    //統計を取るためにカウントする
                    point4++;
                    //switchのループから脱出
                    break;

                //乱数の結果凶だった場合
                case 4:
                    //凶の画像をセットする
                    imageView.setImageResource(R.drawable.kyoutext);
                    //統計を取るためにカウントする
                    point5++;
                    //switchのループから脱出
                    break;

                //ここでは使用しないが、上の場合に当てはまらない場合にここで書いた文が実行される
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

            //ボタンの「占う」というテキストを「戻る」に変える
            button.setText(R.string.Return);

            //boolean型の変数countをtrueにして、次にボタンが押された時の動作を変える
            count = true;
        }

        //戻るボタンが押された時の動作
        else if(count == true){

            //画像を元の引いてないときの画像に戻す
            imageView.setImageResource(R.drawable.omkj);

            //ボタンの「戻る」というテキストを「占う」に戻す
            button.setText(R.string.button1);

            //boolean型の変数countを、falseに戻して次にボタンが押された時の動作を元に戻す
            count = false;
        }


//        RotateAnimation rotate = new RotateAnimation(0, 360, imageView.getWidth()/2, imageView.getHeight()/2); // imgの中心を軸に、0度から360度にかけて回転
//        rotate.setDuration(500); // 3000msかけてアニメーションする
//        imageView.startAnimation(rotate); // アニメーション適用


    }


    public void onStatisticsClick(View v){
        Intent intent = new Intent(this, TableActivity.class);
        intent.putExtra("point1", point1);
        intent.putExtra("point2", point2);
        intent.putExtra("point3", point3);
        intent.putExtra("point4", point4);
        intent.putExtra("point5", point5);
        startActivity(intent);
    }

}

package org.t_robop.omikuji;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClick (View v){



            switch (num) {
                case 0:
                    //大吉
                    break;
                case 1:
                    //中吉
                    break;
                case 2:
                    //小吉
                    break;
                case 3:
                    //吉
                    break;
                case 4:
                    //凶
                    break;
            }

    }



    public static int RandomNumber(int num){
        Random r = new Random();
        num = r.nextInt(5);
        return num;
    }
}

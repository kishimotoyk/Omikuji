package org.t_robop.omikuji;

import java.util.Random;

/**
 * Created by Kishimoto on 2016/10/12.
 */

public class Secret {

    //隠蔽予定の乱数生成メソッド
    public static int RandomNumber(int num){
        Random r = new Random();
        num = r.nextInt(5);
        return num;
    }

}

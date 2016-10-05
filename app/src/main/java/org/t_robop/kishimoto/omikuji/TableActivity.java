package org.t_robop.kishimoto.omikuji;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent i = getIntent();
        int name = i.getIntExtra("point",0);
    }
}

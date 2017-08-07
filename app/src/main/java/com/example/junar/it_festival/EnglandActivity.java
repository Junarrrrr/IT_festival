package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Junar on 2017-08-01.
 */

public class EnglandActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_england);

        //HomeButton
        Button btn_home_eng = (Button) findViewById(R.id.home_Button_eng);
        btn_home_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home_eng = new Intent(EnglandActivity.this, MainActivity.class);
                startActivity(intent_home_eng);
            }
        });
    }
}

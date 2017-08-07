package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Junar on 2017-08-01.
 */

public class ThaiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai);

        //HomeButton
        Button btn_home_thai = (Button) findViewById(R.id.home_Button_thai);
        btn_home_thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home_thai = new Intent(ThaiActivity.this, MainActivity.class);
                startActivity(intent_home_thai);
            }
        });
    }
}

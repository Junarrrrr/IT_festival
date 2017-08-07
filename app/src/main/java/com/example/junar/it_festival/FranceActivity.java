package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Junar on 2017-08-01.
 */

public class FranceActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france);

        //HomeButton
        Button btn_home_fr = (Button) findViewById(R.id.home_Button_fr);
        btn_home_fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home_fr = new Intent(FranceActivity.this, MainActivity.class);
                startActivity(intent_home_fr);
            }
        });

    }
}

package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Junar on 2017-08-01.
 */

public class SingaporeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singapore);

        //HomeButton
        Button btn_home_sgp = (Button) findViewById(R.id.home_Button_sgp);
        btn_home_sgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home_sgp = new Intent(SingaporeActivity.this, MainActivity.class);
                startActivity(intent_home_sgp);
            }
        });

    }
}

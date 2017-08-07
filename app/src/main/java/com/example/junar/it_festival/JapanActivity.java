package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Junar on 2017-07-31.
 */

public class JapanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);
        

        //homeButton
        Button btn_home_jpn = (Button) findViewById(R.id.home_Button_japan);

        btn_home_jpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home = new Intent(JapanActivity.this, MainActivity.class);
                startActivity(intent_home);
            }
        });
    }
}

package com.example.junar.it_festival;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final long FINISH_INTERVAL_TIME=2000;
    private long backPressedTime=0;

    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime-backPressedTime;

        if(0<=intervalTime&&FINISH_INTERVAL_TIME>=intervalTime)
        {
            ActivityCompat.finishAffinity(this);
            System.runFinalizersOnExit(true);
            System.exit(0);
        } else {
            backPressedTime=tempTime;
            Toast.makeText(getApplicationContext(), "한번 더 뒤로가기 버튼을 누르면 앱이 종료됩니다.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_travel = (ImageButton) findViewById(R.id.imageButton_travel);
        ImageButton btn_calc = (ImageButton) findViewById(R.id.imageButton_calc);
        ImageButton btn_togo = (ImageButton) findViewById(R.id.imageButton_togo);


        btn_travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "여행 정보에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, TravelActivity.class);
                startActivity(intent);
            }
        });

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "환율 계산기에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
            }
        });

        btn_togo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "마이 리스트에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
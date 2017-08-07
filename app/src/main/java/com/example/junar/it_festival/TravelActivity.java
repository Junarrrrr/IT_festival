package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Junar on 2017-07-31.
 */

public class TravelActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_select);

        Spinner Main_Spinner = (Spinner)findViewById(R.id.spinner);
        Button btn_home = (Button) findViewById(R.id.home_Button_select);
        final Button btn_select = (Button) findViewById(R.id.selectButton);

        //스피너 어댑터 설정
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.location, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Main_Spinner.setAdapter(adapter);

        //스피너 이벤트 발생
        Main_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id){
                btn_select.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(position==0){
                            Toast.makeText(TravelActivity.this, "한 때 적수였지만 아름다운 애니메이션의 나라, 일본에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                            Intent intent_japan = new Intent(TravelActivity.this, JapanActivity.class);
                            startActivity(intent_japan);
                        }
                        if(position==1){
                            Toast.makeText(TravelActivity.this, "일상의 반복이 힘들 때 힐링이 되어줄 수 있는 나라, 태국에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                            Intent intent_thai = new Intent(TravelActivity.this, ThaiActivity.class);
                            startActivity(intent_thai);
                        }
                        if(position==2){
                            Toast.makeText(TravelActivity.this, "지중해와 대서양을 끼고 있고 에펠탑이 아름다운 나라, 프랑스에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                            Intent intent_france = new Intent(TravelActivity.this, FranceActivity.class);
                            startActivity(intent_france);
                        }
                        if(position==3){
                            Toast.makeText(TravelActivity.this, "섬이지만 섬이라고 할 수 없는 나라, 세계 시간의 중심, 영국에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                            Intent intent_england = new Intent(TravelActivity.this, EnglandActivity.class);
                            startActivity(intent_england);
                        }
                        if(position==4){
                            Toast.makeText(TravelActivity.this, "세계에서 가장 작은 나라 중 하나지만 야경이 아름다운 나라, 싱가포르에 오신 것을 환영합니다.", Toast.LENGTH_SHORT).show();
                            Intent intent_singapore = new Intent(TravelActivity.this, SingaporeActivity.class);
                            startActivity(intent_singapore);
                        }
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //HomeButton
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_home = new Intent(TravelActivity.this, MainActivity.class);
                startActivity(intent_home);
            }
        });
    }
}

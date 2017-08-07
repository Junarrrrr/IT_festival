package com.example.junar.it_festival;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Junar on 2017-08-04.
 */

public class MyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView;
        CustomChoiceListViewAdapter adapter;
        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //adapter create
        adapter = new CustomChoiceListViewAdapter();

        //리스트뷰 참조 및 Adapter 달기
        listView = (ListView) findViewById(R.id.listview1);
        listView.setAdapter(adapter);

    }
}

package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//connect java and xml, let screen=activity

        //tap button change text color

        //reference Text views use "id" in main java
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tap button change text color
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });
    }
}
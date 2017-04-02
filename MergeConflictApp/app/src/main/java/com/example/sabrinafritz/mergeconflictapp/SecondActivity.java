package com.example.sabrinafritz.mergeconflictapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = getIntent().getStringExtra("name");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Hallo "+name);
    }
}

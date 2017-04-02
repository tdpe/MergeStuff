package com.example.sabrinafritz.mergeconflictapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonActions();
    }


    public void setButtonActions() {
        Button btnStore = (Button) findViewById(R.id.button_store);
        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(MainActivity.this, SecondActivity.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                String name = editText.getText().toString();
                System.out.println(name);
                nextActivity.putExtra("name", name);

                startActivity(nextActivity);
            }
        });

    }

}

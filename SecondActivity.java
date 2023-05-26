package com.example.prep1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       btn=findViewById(R.id.buttonX);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goFirstActivity();
            }
        });

    }

    private void goFirstActivity(){
        Intent intent = new Intent( SecondActivity.this, MainActivity.class );
        startActivity(intent);
    }
}
package com.example.prep1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    private TextView total;

    private Button nextActivity;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.button3);
        total=findViewById(R.id.textView);
        nextActivity=findViewById(R.id.button4);

        counter=0;

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                total.setText("" + counter);
            }
        });


        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goSecondActivity();
            }
        });

        }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY_COUNTER" , counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter=savedInstanceState.getInt("KEY_COUNTER" , 0);
        total.setText(" " + counter );
    }

    private void goSecondActivity(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }







}
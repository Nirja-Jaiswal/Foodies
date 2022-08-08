package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout linearburger;
    LinearLayout linearpizza;
    LinearLayout lineardessart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        linearburger = findViewById(R.id.linearburger);
        linearpizza = findViewById(R.id.linearpizza);
        lineardessart = findViewById(R.id.lineardessart);


        linearburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linearburger.setBackgroundColor(Color.parseColor("#FFC107"));
                linearpizza.setBackgroundColor(Color.parseColor("#FFFFFF"));
                lineardessart.setBackgroundColor(Color.parseColor("#FFFFFF"));

            }
        });

        linearpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearpizza.setBackgroundColor(Color.parseColor("#FFC107"));
                linearburger.setBackgroundColor(Color.parseColor("#FFFFFF"));
                lineardessart.setBackgroundColor(Color.parseColor("#FFFFFF"));

            }
        });

        lineardessart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lineardessart.setBackgroundColor(Color.parseColor("#FFC107"));
                linearburger.setBackgroundColor(Color.parseColor("#FFFFFF"));
                linearpizza.setBackgroundColor(Color.parseColor("#FFFFFF"));



            }
        });




    }



    public void baack(View view) {
        onBackPressed();

    }
}
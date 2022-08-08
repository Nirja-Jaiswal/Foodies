package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button cart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        cart = findViewById(R.id.cart);


        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


              Intent intent =new Intent(MainActivity5.this,MainActivity2.class);
              startActivity(intent);
            }
        });
    }

    public void back(View view) {
        onBackPressed();
    }
}
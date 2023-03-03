package com.example.pizzaorderapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondOrder extends AppCompatActivity {

    TextView orderSummary;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_order);
        orderSummary = findViewById(R.id.orderSummary);
        Bundle dataFromMain = getIntent().getExtras();
        orderSummary.setText(dataFromMain.getString("order"));
    }

    public void onClick(View view){
        Intent changeActivity = new Intent(this, MainActivity.class);
        startActivity(changeActivity);
    }

    public void quit(View view){
        finishAffinity();
    }
}
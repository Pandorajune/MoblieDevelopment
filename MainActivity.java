package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton redRadioButton;
    RadioButton yellowRadioButton;
    RadioButton greenRadioButton;
    ImageView imageView;

    //Drawable red = getDrawable(Integer.parseInt("red_light"));


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redRadioButton = findViewById(R.id.redRadioButton);
        yellowRadioButton = findViewById(R.id.yellowRadioButton);
        greenRadioButton = findViewById(R.id.greenRadioButton);
        imageView = findViewById(R.id.imageView);

    }
    public void trafficLights(View view){

        if(redRadioButton.isChecked()){
            imageView.setImageResource(R.drawable.red_light);
        }
        if(yellowRadioButton.isChecked()){
            imageView.setImageResource(R.drawable.yellow_light);
        }
        if(greenRadioButton.isChecked()){
            imageView.setImageResource(R.drawable.green_light);
        }
    }

}
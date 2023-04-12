package com.example.buttoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button upButton;
    Button downButton;

    TextView countText;
    int counter;
    int start = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upButton.findViewById(R.id.buttonUp);
        downButton.findViewById(R.id.buttonDown);
        countText.findViewById(R.id.textView);

        countText.setText(String.valueOf(start));

    }

    public void onClick(){

        if(upButton.isActivated()){
            counter++;
            countText.setText(String.valueOf(counter));
        }
        if(downButton.isActivated()){
            counter--;
            countText.setText(String.valueOf(counter));
        }else if(counter < 0){
            downButton.setClickable(false);
            counter = 0;
            countText.setText(String.valueOf(counter));
            Toast.makeText(this, "You can't go below 0!", Toast.LENGTH_SHORT).show();
        }


    }
}
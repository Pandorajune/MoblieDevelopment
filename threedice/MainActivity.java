package com.example.threedice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView diceOneImage;
    ImageView diceTwoImage;
    ImageView diceThreeImage;
    Button rollDiceButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceOneImage = findViewById(R.id.diceOneImage);
        diceTwoImage = findViewById(R.id.diceTwoImage);
        diceThreeImage = findViewById(R.id.diceThreeImage);
        rollDiceButton = findViewById(R.id.rollDiceButton);
    }

    //imageView.setImageResource(R.drawable.one);

    public void onClick(View view){
        Random randomNumberOne = new Random();
        Random randomNumberTwo = new Random();
        Random randomNumberThree = new Random();

        int diceOne = randomNumberOne.nextInt(6);
        switch(diceOne){
            case 0:
                diceOneImage.setImageResource(R.drawable.one);
                break;
            case 1:
                diceOneImage.setImageResource(R.drawable.two);
                break;
            case 2:
                diceOneImage.setImageResource(R.drawable.three);
                break;
            case 3:
                diceOneImage.setImageResource(R.drawable.four);
                break;
            case 4:
                diceOneImage.setImageResource(R.drawable.five);
                break;
            case 5:
                diceOneImage.setImageResource(R.drawable.six);
                break;
        }

        int diceTwo = randomNumberTwo.nextInt(6);
        switch (diceTwo){
            case 0:
                diceTwoImage.setImageResource(R.drawable.one);
                break;
            case 1:
                diceTwoImage.setImageResource(R.drawable.two);
                break;
            case 2:
                diceTwoImage.setImageResource(R.drawable.three);
                break;
            case 3:
                diceTwoImage.setImageResource(R.drawable.four);
                break;
            case 4:
                diceTwoImage.setImageResource(R.drawable.five);
                break;
            case 5:
                diceTwoImage.setImageResource(R.drawable.six);
                break;
        }

        int diceThree = randomNumberThree.nextInt(6);
        switch (diceThree) {
            case 0:
                diceThreeImage.setImageResource(R.drawable.one);
                break;
            case 1:
                diceThreeImage.setImageResource(R.drawable.two);
                break;
            case 2:
                diceThreeImage.setImageResource(R.drawable.three);
                break;
            case 3:
                diceThreeImage.setImageResource(R.drawable.four);
                break;
            case 4:
                diceThreeImage.setImageResource(R.drawable.five);
                break;
            case 5:
                diceThreeImage.setImageResource(R.drawable.six);
                break;
        }

        if(diceOne==diceTwo||diceTwo==diceThree||diceOne==diceThree){
            if((diceOne == diceTwo)&&(diceOne == diceThree)){
                Toast.makeText(this, "You rolled Three of a kind!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "You rolled Two of a kind!", Toast.LENGTH_SHORT).show();
            }
        }



    }
}
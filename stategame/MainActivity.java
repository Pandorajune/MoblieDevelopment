package com.example.stategame;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    ImageView stateImageView;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    TextView correct;
    TextView incorrect;
    Button restart;

    int stateID;


    String[] stateNames = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
            "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
            "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
            "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

    Integer[] stateImageIDs = {R.drawable.alabama, R.drawable.alaska, R.drawable.arizona, R.drawable.arkansas, R.drawable.california, R.drawable.colorado,
            R.drawable.connecticut, R.drawable.delaware, R.drawable.florida, R.drawable.georgia, R.drawable.hawaii, R.drawable.idaho, R.drawable.illinois,
            R.drawable.indiana, R.drawable.iowa, R.drawable.kansas, R.drawable.kentucky, R.drawable.louisiana, R.drawable.maine, R.drawable.maryland,
            R.drawable.massachusetts, R.drawable.michigan, R.drawable.minnesota, R.drawable.mississippi, R.drawable.missouri, R.drawable.montana,
            R.drawable.nebraska, R.drawable.nevada, R.drawable.new_hampshire, R.drawable.new_jersey, R.drawable.new_mexico, R.drawable.new_york,
            R.drawable.north_carolina, R.drawable.north_dakota, R.drawable.ohio, R.drawable.oklahoma, R.drawable.oregon, R.drawable.pennsylvania,
            R.drawable.rhode_island, R.drawable.south_carolina, R.drawable.south_dakota, R.drawable.tennessee, R.drawable.texas, R.drawable.utah,
            R.drawable.vermont, R.drawable.virginia, R.drawable.washington, R.drawable.west_virginia, R.drawable.wisconsin, R.drawable.wyoming};

    String correctAnswer;
    ArrayList<String> guesses = new ArrayList<>();

    int correctScore = 0;
    int incorrectScore = 0;
    int startScore = 0;
    Random random = new Random();
    int rand = random.nextInt(51);


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stateImageView = findViewById(R.id.imageView);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        correct = findViewById(R.id.correctScore);
        incorrect = findViewById(R.id.incorrectScore);
        restart = findViewById(R.id.restartButon);

        correct.setText(String.valueOf(correctScore));
        incorrect.setText(String.valueOf(incorrectScore));

        setup();

    }

    public void setup() {

            stateID =  stateImageIDs[rand];

        Log.d("DEBUG", "STATE IMAGES: " + Arrays.toString(stateImageIDs));

        Log.d("DEBUG", "STATE ID: " + stateID);

        stateImageView.setImageResource(stateID);

        correctAnswer = stateNames[rand];
        guesses.add(correctAnswer);

        Collections.shuffle(Arrays.asList(stateNames));

        for(int i = 1; i < 4; i++){
            guesses.add(String.valueOf(stateNames[i]));
        }

        Collections.shuffle(guesses);

        button1.setText(guesses.get(0));
        button2.setText(guesses.get(1));
        button3.setText(guesses.get(2));
        button4.setText(guesses.get(3));

    }

    public void setButton1(View view){
        String clickedButton = String.valueOf(button1.getText());

        if(correctAnswer.equals(clickedButton)){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            correctScore++;
            correct.setText(String.valueOf(correctScore));

        }else{
            Toast.makeText(this, "Incorrect, the correct answer is: " + correctAnswer, Toast.LENGTH_SHORT).show();
            incorrectScore++;
            incorrect.setText(String.valueOf(incorrectScore));
        }

    }
    public void setButton2(View view){
        String clickedButton = String.valueOf(button2.getText());

        if(correctAnswer.equals(clickedButton)){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            correctScore++;
            correct.setText(String.valueOf(correctScore));
        }else{
            Toast.makeText(this, "Incorrect, the correct answer is: " + correctAnswer, Toast.LENGTH_SHORT).show();
            incorrectScore++;
            incorrect.setText(String.valueOf(incorrectScore));
        }

    }
    public void setButton3(View view){
        String clickedButton = String.valueOf(button3.getText());

        if(correctAnswer.equals(clickedButton)){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            correctScore++;
            correct.setText(String.valueOf(correctScore));
        }else{
            Toast.makeText(this, "Incorrect, the correct answer is: " + correctAnswer, Toast.LENGTH_SHORT).show();
            incorrectScore++;
            incorrect.setText(String.valueOf(incorrectScore));
        }
    }
    public void setButton4(View view){
        String clickedButton = String.valueOf(button4.getText());

        if(correctAnswer.equals(clickedButton)){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            correctScore++;
            correct.setText(String.valueOf(correctScore));
        }else{
            Toast.makeText(this, "Incorrect, the correct answer is: " + correctAnswer, Toast.LENGTH_SHORT).show();
            incorrectScore++;
            incorrect.setText(String.valueOf(incorrectScore));
        }
    }

    public void restartButton(View view){
        correctScore = 0;
        incorrectScore = 0;
        correct.setText(String.valueOf(startScore));
        incorrect.setText(String.valueOf(startScore));

       // setup();
    }

}
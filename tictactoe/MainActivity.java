package com.example.tictactoe;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.TimedMetaData;
import android.os.Bundle;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    ImageView imageOne;
    ImageView imageTwo;
    ImageView imageThree;
    ImageView imageFour;
    ImageView imageFive;
    ImageView imageSix;
    ImageView imageSeven;
    ImageView imageEight;
    ImageView imageNine;
    ImageView graphImageView;
    Button playAgainButton;

    int player = 0;
    int count = 0;

    int redCount = 0;
    int yellowCount = 0;

    int[][] winPlaces = { {0, 1, 2} , {3, 4, 5} , {6, 7, 8} , {0, 3, 6} , {1, 4, 7} , {2, 5, 8} , {0, 4, 8} , {2, 4, 6} };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageOne = findViewById(R.id.imageView1);
        imageOne.setImageResource(R.drawable.whitegamepiece);
        imageTwo = findViewById(R.id.imageView2);
        imageTwo.setImageResource(R.drawable.whitegamepiece);
        imageThree = findViewById(R.id.imageView3);
        imageThree.setImageResource(R.drawable.whitegamepiece);
        imageFour = findViewById(R.id.imageView4);
        imageFour.setImageResource(R.drawable.whitegamepiece);
        imageFive = findViewById(R.id.imageView5);
        imageFive.setImageResource(R.drawable.whitegamepiece);
        imageSix = findViewById(R.id.imageView6);
        imageSix.setImageResource(R.drawable.whitegamepiece);
        imageSeven = findViewById(R.id.imageView7);
        imageSeven.setImageResource(R.drawable.whitegamepiece);
        imageEight = findViewById(R.id.imageView8);
        imageEight.setImageResource(R.drawable.whitegamepiece);
        imageNine = findViewById(R.id.imageView9);
        imageNine.setImageResource(R.drawable.whitegamepiece);
        graphImageView = findViewById(R.id.graphImageView);
        graphImageView.setImageResource(R.drawable.board);
        playAgainButton = findViewById(R.id.playAgainButton);
        player = 0;
        Toast.makeText(this, "Red Starts", Toast.LENGTH_SHORT).show();

    }

    @SuppressLint({"ResourceType", "UseCompatLoadingForDrawables"})
    public void onImageClick(View view) {

        if (player == 0) {

            if (imageOne.isPressed()) {
                imageOne.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageOne.setClickable(false);
            }
            if (imageTwo.isPressed()) {
                imageTwo.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageTwo.setClickable(false);
            }
            if (imageThree.isPressed()) {
                imageThree.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageThree.setClickable(false);
            }
            if (imageFour.isPressed()) {
                imageFour.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageFour.setClickable(false);
            }
            if (imageFive.isPressed()) {
                imageFive.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageFive.setClickable(false);
            }
            if (imageSix.isPressed()) {
                imageSix.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageSix.setClickable(false);
            }
            if (imageSeven.isPressed()) {
                imageSeven.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageSeven.setClickable(false);
            }
            if (imageEight.isPressed()) {
                imageEight.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageEight.setClickable(false);
            }
            if (imageNine.isPressed()) {
                imageNine.setImageResource(R.drawable.redgamepiece);
                player = 1;
                if(count < 8) {
                    Toast.makeText(this, "Yellow Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                redCount++;
                imageNine.setClickable(false);
            }

        } else if (player == 1) {
            if (imageOne.isPressed()) {
                imageOne.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageOne.setClickable(false);
            }
            if (imageTwo.isPressed()) {
                imageTwo.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageTwo.setClickable(false);
            }
            if (imageThree.isPressed()) {
                imageThree.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageThree.setClickable(false);
            }
            if (imageFour.isPressed()) {
                imageFour.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageFour.setClickable(false);
            }
            if (imageFive.isPressed()) {
                imageFive.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageFive.setClickable(false);
            }
            if (imageSix.isPressed()) {
                imageSix.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageSix.setClickable(false);
            }
            if (imageSeven.isPressed()) {
                imageSeven.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageSeven.setClickable(false);
            }
            if (imageEight.isPressed()) {
                imageEight.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageEight.setClickable(false);
            }
            if (imageNine.isPressed()) {
                imageNine.setImageResource(R.drawable.yellowgamepiece);
                player = 0;
                if(count < 8) {
                    Toast.makeText(this, "Red Player's Turn", Toast.LENGTH_SHORT).show();
                }
                count++;
                yellowCount++;
                imageNine.setClickable(false);
            }

        }
        if (count == 9) {
            Toast.makeText(this, "Board Full, Game Over", Toast.LENGTH_SHORT).show();
            count = 0;
        }




       // if ((imageOne == imageTwo && imageOne == imageThree) || (imageFour == imageFive && imageFour == imageSix) ||
             //   (imageSeven == imageEight && imageSeven == imageNine) || (imageOne == imageFour && imageOne == imageSeven)
              //  || (imageTwo == imageFive && imageTwo == imageEight) || (imageThree == imageSix && imageThree == imageNine) ||
              //  (imageOne == imageFive && imageOne == imageNine) || (imageThree == imageFive && imageThree == imageSeven)) {

         //   Toast.makeText(this, "Red Wins!", Toast.LENGTH_SHORT).show();

      //  }

    }

    public void restart(View view){

        player = 0;
        count = 0;
        Toast.makeText(this, "Red Starts", Toast.LENGTH_SHORT).show();

        imageOne.setImageResource(R.drawable.whitegamepiece);
        imageTwo.setImageResource(R.drawable.whitegamepiece);
        imageThree.setImageResource(R.drawable.whitegamepiece);
        imageFour.setImageResource(R.drawable.whitegamepiece);
        imageFive.setImageResource(R.drawable.whitegamepiece);
        imageSix.setImageResource(R.drawable.whitegamepiece);
        imageSeven.setImageResource(R.drawable.whitegamepiece);
        imageEight.setImageResource(R.drawable.whitegamepiece);
        imageNine.setImageResource(R.drawable.whitegamepiece);

        imageOne.setClickable(true);
        imageTwo.setClickable(true);
        imageThree.setClickable(true);
        imageFour.setClickable(true);
        imageFive.setClickable(true);
        imageSix.setClickable(true);
        imageSeven.setClickable(true);
        imageEight.setClickable(true);
        imageNine.setClickable(true);


    }

}

//if ((imageOne == imageTwo && imageOne == imageThree) || (imageFour == imageFive && imageFour == imageSix) ||
//                (imageSeven == imageEight && imageSeven == imageNine) || (imageOne == imageFour && imageOne == imageSeven)
//                || (imageTwo == imageFive && imageTwo == imageEight) || (imageThree == imageSix && imageThree == imageNine) ||
//                (imageOne == imageFive && imageOne == imageNine) || (imageThree == imageFive && imageThree == imageSeven)) {
//
//            Toast.makeText(this, "Red Wins!", Toast.LENGTH_SHORT).show();
//            scoreCountRed++;
//            scoreRed.setText(scoreCountRed);
//
//        }


//if((redCount == 3) && ((imageOne.isActivated() && imageTwo.isActivated() && imageThree.isActivated()) || (imageFour.isActivated() && imageFive.isActivated() && imageSix.isActivated())  ||
//(imageSeven.isActivated()&& imageEight.isActivated() && imageNine.isActivated()) || (imageOne.isActivated() && imageFour.isActivated() && imageSeven.isActivated())
// || (imageTwo.isActivated() && imageFive.isActivated() && imageEight.isActivated()) || (imageThree.isActivated() && imageSix.isActivated() && imageNine.isActivated())||
//(imageOne.isActivated() && imageFive.isActivated() && imageNine.isActivated()) || (imageThree.isActivated() && imageFive.isActivated() && imageSeven.isActivated()) )) {

//System.out.println(redCount);
//Toast.makeText(this, "Red Wins!", Toast.LENGTH_SHORT).show();
//}


//if ((player = 0) && Arrays.toString(winPlaces[0]) || Arrays.toString(winPlaces[1]) || Arrays.toString(winPlaces[2]) || Arrays.toString(winPlaces[3]) || Arrays.toString(winPlaces[4])
//|| Arrays.toString(winPlaces[5]) || Arrays.toString(winPlaces[6]) || Arrays.toString(winPlaces[7])) {
//Toast.makeText(this, "Red Wins!", Toast.LENGTH_SHORT).show();
// }

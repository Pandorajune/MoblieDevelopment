package com.example.matchinggame;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Telephony;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;

    ArrayList<ImageView> imageViewArrayList = new ArrayList<>();

    ArrayList<Integer> animalArrayList = new ArrayList<>(Arrays.asList(R.drawable.crab, R.drawable.deer, R.drawable.elephant, R.drawable.fox,
            R.drawable.frog, R.drawable.hippo, R.drawable.ladybug, R.drawable.lion,
            R.drawable.mouse, R.drawable.panda, R.drawable.pig, R.drawable.rabbit,
            R.drawable.rhino, R.drawable.sheep, R.drawable.turtle, R.drawable.whale));

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);

        imageViewArrayList = new ArrayList<>(Arrays.asList(imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
                imageView9, imageView10, imageView11, imageView12));

        setUp();
    }

    /**** Shuffle and set cards ****/
    public void setUp() {

        Collections.shuffle(animalArrayList);
        for (int i = 0; i < 6; i++) {
            imageViewArrayList.get(i).setImageResource(animalArrayList.get(i));
            imageViewArrayList.get(i).setId(animalArrayList.get(i));
        }
        Collections.shuffle(animalArrayList.subList(0, 5));
        imageView7.setImageResource(animalArrayList.get(0));
        imageViewArrayList.get(6).setId(animalArrayList.get(0));
        imageView8.setImageResource(animalArrayList.get(1));
        imageViewArrayList.get(7).setId(animalArrayList.get(1));
        imageView9.setImageResource(animalArrayList.get(2));
        imageViewArrayList.get(8).setId(animalArrayList.get(2));
        imageView10.setImageResource(animalArrayList.get(3));
        imageViewArrayList.get(9).setId(animalArrayList.get(3));
        imageView11.setImageResource(animalArrayList.get(4));
        imageViewArrayList.get(10).setId(animalArrayList.get(4));
        imageView12.setImageResource(animalArrayList.get(5));
        imageViewArrayList.get(11).setId(animalArrayList.get(5));

        for (int i = 0; i < 12; i++) {
            imageViewArrayList.get(i).setImageResource(R.drawable.question_mark);
        }
    }

    @SuppressLint("ResourceType")
    public void onClick(View view) throws InterruptedException {
        int twoCards = 0;



/**** So you don't press more then two at a time *****/
        if(imageView1.isPressed() || imageView2.isPressed() || imageView3.isPressed() || imageView4.isPressed() || imageView5.isPressed() || imageView6.isPressed()){
            twoCards = 1;
            if(imageView1.isPressed()){
                imageView2.setClickable(false);
                imageView3.setClickable(false);
                imageView4.setClickable(false);
                imageView5.setClickable(false);
                imageView6.setClickable(false);
                imageView1.setImageResource(imageView1.getId());

            }
            if(imageView2.isPressed()){
                imageView1.setClickable(false);
                imageView3.setClickable(false);
                imageView4.setClickable(false);
                imageView5.setClickable(false);
                imageView6.setClickable(false);
                imageView2.setImageResource(imageView2.getId());

            }
            if(imageView3.isPressed()){
                imageView1.setClickable(false);
                imageView2.setClickable(false);
                imageView4.setClickable(false);
                imageView5.setClickable(false);
                imageView6.setClickable(false);
                imageView3.setImageResource(imageView3.getId());

            }
            if(imageView4.isPressed()){
                imageView1.setClickable(false);
                imageView2.setClickable(false);
                imageView3.setClickable(false);
                imageView5.setClickable(false);
                imageView6.setClickable(false);
                imageView4.setImageResource(imageView4.getId());

            }
            if(imageView5.isPressed()){
                imageView1.setClickable(false);
                imageView2.setClickable(false);
                imageView3.setClickable(false);
                imageView4.setClickable(false);
                imageView6.setClickable(false);
                imageView5.setImageResource(imageView5.getId());

            }
            if(imageView6.isPressed()){
                imageView1.setClickable(false);
                imageView2.setClickable(false);
                imageView3.setClickable(false);
                imageView4.setClickable(false);
                imageView5.setClickable(false);
                imageView6.setImageResource(imageView6.getId());

            }
        }
        if(imageView7.isPressed() || imageView8.isPressed() || imageView9.isPressed() || imageView10.isPressed() || imageView11.isPressed() || imageView12.isPressed()) {
            twoCards = 2;

            if(imageView7.isPressed()){
                imageView8.setClickable(false);
                imageView9.setClickable(false);
                imageView10.setClickable(false);
                imageView11.setClickable(false);
                imageView12.setClickable(false);
                imageView7.setImageResource(imageView7.getId());

            }
            if(imageView8.isPressed()){
                imageView7.setClickable(false);
                imageView9.setClickable(false);
                imageView10.setClickable(false);
                imageView11.setClickable(false);
                imageView12.setClickable(false);
                imageView8.setImageResource(imageView8.getId());

            }
            if(imageView9.isPressed()){
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView10.setClickable(false);
                imageView11.setClickable(false);
                imageView12.setClickable(false);
                imageView9.setImageResource(imageView9.getId());

            }
            if(imageView10.isPressed()){
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
                imageView11.setClickable(false);
                imageView12.setClickable(false);
                imageView10.setImageResource(imageView10.getId());

            }
            if(imageView11.isPressed()){
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
                imageView10.setClickable(false);
                imageView12.setClickable(false);
                imageView11.setImageResource(imageView11.getId());

            }
            if(imageView12.isPressed()){
                imageView7.setClickable(false);
                imageView8.setClickable(false);
                imageView9.setClickable(false);
                imageView10.setClickable(false);
                imageView11.setClickable(false);
                imageView12.setImageResource(imageView12.getId());

            }
        }

            /***** Flip back to Question Mark if they don't match
             * Allow clicking the other cards again
             * Thread.sleep(1000) should delay flip by a second
             * The matched statements do work
             * struggling with flipping 7 when clicked to view the card ******/

            while(twoCards == 2) {

                 if(imageView1 != imageView7 || imageView1 != imageView8 || imageView1 != imageView9 || imageView1 != imageView10 || imageView1 != imageView11 || imageView1 != imageView12){


                        imageView1.setImageResource(R.drawable.question_mark);

                        if(imageView7.isPressed() || imageView8.isPressed() || imageView9.isPressed() || imageView10.isPressed() || imageView11.isPressed() || imageView12.isPressed()){
                            if(imageView7.isPressed()) {
                                imageView7.setImageResource(R.drawable.question_mark);
                            }
                            imageView8.setImageResource(R.drawable.question_mark);
                            imageView9.setImageResource(R.drawable.question_mark);
                            imageView10.setImageResource(R.drawable.question_mark);
                            imageView11.setImageResource(R.drawable.question_mark);
                            imageView12.setImageResource(R.drawable.question_mark);
                        }
                    }



                imageView1.setClickable(true);
                imageView2.setClickable(true);
                imageView3.setClickable(true);
                imageView4.setClickable(true);
                imageView5.setClickable(true);
                imageView6.setClickable(true);
                imageView7.setClickable(true);
                imageView8.setClickable(true);
                imageView9.setClickable(true);
                imageView10.setClickable(true);
                imageView11.setClickable(true);
                imageView12.setClickable(true);


                twoCards = 0;
            }
    }
}


/*** Tested lines of Code ***/

//if (imageView1.getId() == imageViewArrayList.get(i).getId()) {
//                 if (imageView1.isPressed()) {
//                    twoCards++;
//                    imageView1.setImageResource(imageView1.getId());
//               }
//                if (imageViewArrayList.get(i).isPressed()) {
//                    twoCards++;
//                    imageViewArrayList.get(i).setImageResource(imageViewArrayList.get(i).getId());
//                }
//            } else if (imageView1.getId() != imageViewArrayList.get(i).getId()) {
//                imageViewArrayList.get(i).setImageResource(imageViewArrayList.get(i).getId());
//                if (twoCards == 2) {
//                    imageViewArrayList.get(i).setImageResource(R.drawable.question_mark);
//                    imageView1.setImageResource(R.drawable.question_mark);
//                    twoCards = 0;
//                }
//            }



//if(imageView1.isPressed() && (imageView2.isPressed() || imageView3.isPressed() || imageView4.isPressed() || imageView5.isPressed() || imageView6.isPressed()
//        || imageView7.isPressed() || imageView8.isPressed() || imageView9.isPressed() || imageView10.isPressed() || imageView11.isPressed() || imageView12.isPressed())) {
//                if (imageView1.getId() == imageViewArrayList.get(i).getId()) {
//                    imageView1.setImageResource(imageView1.getId());
//                    imageViewArrayList.get(i).setImageResource(imageViewArrayList.get(i).getId());
//
//                } else if (imageView1.getId() != imageViewArrayList.get(i).getId()) {
//                    imageView1.setImageResource(R.drawable.question_mark);
//                    imageViewArrayList.get(i).setImageResource(R.drawable.question_mark);
//                }
//            }


//if(imageView1.getId() == imageView7.getId() || imageView1.getId() == imageView8.getId() || imageView1.getId() == imageView9.getId() || imageView1.getId() ==
//                    imageView10.getId() || imageView1.getId() == imageView11.getId() || imageView1.getId() == imageView12.getId()){
//                Toast.makeText(this, "Matched", Toast.LENGTH_SHORT).show();
//            }else{
//                imageView1.setImageResource(R.drawable.question_mark);
//            }


// if(imageView1 != imageView7 || imageView1 != imageView8 || imageView1 != imageView9 || imageView1 != imageView10 || imageView1 != imageView11 || imageView1 != imageView12){


//imageView1.setImageResource(R.drawable.question_mark);

//if(imageView7.isPressed() || imageView8.isPressed() || imageView9.isPressed() || imageView10.isPressed() || imageView11.isPressed() || imageView12.isPressed()){
//   imageView7.setImageResource(R.drawable.question_mark);
//   imageView8.setImageResource(R.drawable.question_mark);
//  imageView9.setImageResource(R.drawable.question_mark);
//  imageView10.setImageResource(R.drawable.question_mark);
//  imageView11.setImageResource(R.drawable.question_mark);
//  imageView12.setImageResource(R.drawable.question_mark);
// }
// }

//if(imageView1.getId() != imageView8.getId()){
//                        Thread.sleep(1000);
//                        imageView1.setImageResource(R.drawable.question_mark);
//                        imageView8.setImageResource(R.drawable.question_mark);
//                    }
//                    if(imageView1.getId() != imageView9.getId()){
//                        Thread.sleep(1000);
//                        imageView1.setImageResource(R.drawable.question_mark);
//                        imageView9.setImageResource(R.drawable.question_mark);
//                    }
//                    if(imageView1.getId() != imageView10.getId()){
//                        Thread.sleep(1000);
//                        imageView1.setImageResource(R.drawable.question_mark);
//                        imageView10.setImageResource(R.drawable.question_mark);
//                    }
//                    if(imageView1.getId() != imageView11.getId()){
//                        Thread.sleep(1000);
//                        imageView1.setImageResource(R.drawable.question_mark);
//                        imageView11.setImageResource(R.drawable.question_mark);
//                    }
//                    if(imageView1.getId() != imageView12.getId()){
//                        Thread.sleep(1000);
//                        imageView1.setImageResource(R.drawable.question_mark);
//                        imageView12.setImageResource(R.drawable.question_mark);
//                    }

//System.out.println(imageView1.getId());
//System.out.println(imageView7.getId());

//if (imageView1.getId() != imageView7.getId() || imageView1.getId() != imageView8.getId() || imageView1.getId() != imageView9.getId() ||
//                        imageView1.getId() != imageView10.getId() || imageView1.getId() != imageView11.getId() || imageView1.getId() != imageView12.getId()) {
//
//                   // Thread.sleep(1000);
//
//                }else if (imageView1.getId() == imageView7.getId() || imageView1.getId() == imageView8.getId() || imageView1.getId() == imageView9.getId() ||
//                        imageView1.getId() == imageView10.getId() || imageView1.getId() == imageView11.getId() || imageView1.getId() == imageView12.getId()) {
//
//
//
//
//
//                }

//if(imageViewArrayList.get(i).isPressed()) {
//                        if (imageViewArrayList.get(i).getId() != imageViewArrayList.get(i).getId()) {
//                            imageViewArrayList.get(i).setImageResource(R.drawable.question_mark);
//                        } else if (imageViewArrayList.get(i).getId() == imageViewArrayList.get(i).getId()) {
//                            imageViewArrayList.get(i).setVisibility(View.INVISIBLE);
//                            Toast.makeText(this, "Matched!", Toast.LENGTH_SHORT).show();
//                        }
//                    }

//if(flip){
//                    if(imageView1.getId() != imageView7.getId() || imageView1.getId() != imageView8.getId() || imageView1.getId() != imageView9.getId() ||
//                            imageView1.getId() != imageView10.getId() || imageView1.getId() != imageView11.getId() || imageView1.getId() != imageView12.getId() ){
//                        flip = false;
//                    } else if(imageView1.getId() == imageView7.getId() || imageView1.getId() == imageView8.getId() || imageView1.getId() == imageView9.getId() ||
//                            imageView1.getId() == imageView10.getId() || imageView1.getId() == imageView11.getId() || imageView1.getId() == imageView12.getId() ){
//
//
//                        imageView1.setVisibility(View.INVISIBLE);
//                        if(imageView1.getId() == imageView7.getId()) {
//                            imageView7.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView1.getId() == imageView8.getId()) {
//                            imageView8.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView1.getId() == imageView9.getId()) {
//                            imageView9.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView1.getId() == imageView10.getId()) {
//                            imageView10.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView1.getId() == imageView11.getId()) {
//                            imageView11.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView1.getId() == imageView12.getId()) {
//                            imageView12.setVisibility(View.INVISIBLE);
//                        }
//                    }
//
//                    if(!flip){
//                        imageView1.setVisibility(R.drawable.question_mark);
//                        if(imageView1.getId() != imageView7.getId()) {
//                            imageView7.setVisibility(R.drawable.question_mark);
//                        }
//                        if(imageView1.getId() != imageView8.getId()) {
//                            imageView8.setVisibility(R.drawable.question_mark);
//                        }
//                        if(imageView1.getId() != imageView9.getId()){
//                            imageView9.setVisibility(R.drawable.question_mark);
//                        }
//                        if(imageView1.getId() != imageView10.getId()){
//                            imageView10.setVisibility(R.drawable.question_mark);
//                        }
//                        if(imageView1.getId() != imageView11.getId()){
//                            imageView11.setVisibility(R.drawable.question_mark);
//                        }
//                        if(imageView1.getId() != imageView12.getId()){
//                            imageView12.setVisibility(R.drawable.question_mark);
//                        }
//
//
//
//                    }
//
//                }


//for(int i = 0; i < 12; i++){
//                    if(imageViewArrayList.get(i).getId() != imageViewArrayList.get(i).getId()){
//                        flip = false;
//                    }
//                    if(imageViewArrayList.get(i).getId() == imageViewArrayList.get(i).getId()){
//                        flip = true;
//                    }
//                }
//
//
//                if(flip){
//                    for(int i = 0; i < 12; i++){
//                        if(imageViewArrayList.get(i).isPressed()){
//                            if(imageViewArrayList.get(i).getId() == imageViewArrayList.get(i).getId()){
//                                imageViewArrayList.get(i).setImageResource(imageViewArrayList.get(i).getId());
//
//                            }
//                        }
//                    }
//
//                }
//                if(!flip){
//                    for(int i = 0; i < 12; i++){
//                        if(imageViewArrayList.get(i).isPressed()){
//                            if(imageViewArrayList.get(i).getId() != imageViewArrayList.get(i).getId()){
//                                imageViewArrayList.get(i).setImageResource(R.drawable.question_mark);
//
//                            }
//                        }
//                    }
//                }


//if (imageView1.getId() != imageView7.getId()) {

//imageView1.setImageResource(R.drawable.question_mark);
// imageView7.setImageResource(R.drawable.question_mark);

//} else if (imageView1.getId() == imageView7.getId()) {
// imageView1.setVisibility(View.INVISIBLE);
// imageView7.setVisibility(View.INVISIBLE);
//  Toast.makeText(this, "Matched!", Toast.LENGTH_SHORT).show();

//if(imageView1.getId() == imageView7.getId() || imageView1.getId() == imageView8.getId() || imageView1.getId() == imageView9.getId() || imageView1.getId() == imageView10.getId() || imageView1.getId()
//                == imageView11.getId() || imageView1.getId() == imageView12.getId()){
//
//                    imageView1.setImageResource(imageView1.getId());
//
//                    if(imageView7.isPressed()){
//                        imageView7.setImageResource(imageView7.getId());
//                    }
//                    if(imageView8.isPressed()){
//                        imageView8.setImageResource(imageView8.getId());
//                    }
//                    if(imageView9.isPressed()){
//                        imageView9.setImageResource(imageView9.getId());
//                    }
//                    if(imageView10.isPressed()){
//                        imageView10.setImageResource(imageView10.getId());
//                    }
//                    if(imageView11.isPressed()){
//                        imageView11.setImageResource(imageView11.getId());
//                    }
//                    if(imageView12.isPressed()){
//                        imageView12.setImageResource(imageView12.getId());
//                    }
//
//                } else{
//                    imageView1.setImageResource(R.drawable.question_mark);
//                    imageView7.setImageResource(R.drawable.question_mark);
//                }

//if(imageView1.isPressed() || imageView2.isPressed() || imageView3.isPressed() || imageView4.isPressed() || imageView5.isPressed() || imageView6.isPressed()) {
//                    if (imageView1.getId() == imageView7.getId() || imageView1.getId() == imageView8.getId() || imageView1.getId() == imageView9.getId() || imageView1.getId() == imageView10.getId()
//                            || imageView1.getId() == imageView11.getId() || imageView1.getId() == imageView12.getId()) {
//
//                        if(imageView1.isPressed()) {
//                            imageView1.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView2.isPressed()) {
//                            if (imageView2.getId() == imageView7.getId() || imageView2.getId() == imageView8.getId() || imageView2.getId() == imageView9.getId() || imageView2.getId() == imageView10.getId()
//                                    || imageView2.getId() == imageView11.getId() || imageView2.getId() == imageView12.getId()) {
//                                imageView2.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView3.isPressed()) {
//                            if (imageView3.getId() == imageView7.getId() || imageView3.getId() == imageView8.getId() || imageView3.getId() == imageView9.getId() || imageView3.getId() == imageView10.getId()
//                                    || imageView3.getId() == imageView11.getId() || imageView3.getId() == imageView12.getId()) {
//                                imageView3.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView4.isPressed()) {
//                            if (imageView4.getId() == imageView7.getId() || imageView4.getId() == imageView8.getId() || imageView4.getId() == imageView9.getId() || imageView4.getId() == imageView10.getId()
//                                    || imageView4.getId() == imageView11.getId() || imageView4.getId() == imageView12.getId()) {
//                                imageView4.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView5.isPressed()) {
//                            if (imageView5.getId() == imageView7.getId() || imageView5.getId() == imageView8.getId() || imageView5.getId() == imageView9.getId() || imageView5.getId() == imageView10.getId()
//                                    || imageView5.getId() == imageView11.getId() || imageView5.getId() == imageView12.getId()) {
//                                imageView5.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView6.isPressed()) {
//                            if (imageView6.getId() == imageView7.getId() || imageView6.getId() == imageView8.getId() || imageView6.getId() == imageView9.getId() || imageView6.getId() == imageView10.getId()
//                                    || imageView6.getId() == imageView11.getId() || imageView6.getId() == imageView12.getId()) {
//                                imageView6.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                    }
//                }
//
//
//                if(imageView7.isPressed() || imageView8.isPressed() || imageView9.isPressed() || imageView10.isPressed() || imageView11.isPressed() || imageView12.isPressed()){
//                    if(imageView7.getId() == imageView1.getId() || imageView7.getId() ==imageView2.getId() || imageView7.getId() ==imageView3.getId() || imageView7.getId() ==imageView4.getId()
//                            || imageView7.getId() ==imageView5.getId() || imageView7.getId() ==imageView6.getId()){
//                        if(imageView7.isPressed()) {
//                            imageView7.setVisibility(View.INVISIBLE);
//                        }
//                        if(imageView8.isPressed()) {
//                            if (imageView8.getId() == imageView1.getId() || imageView8.getId() == imageView2.getId() || imageView8.getId() == imageView3.getId() || imageView8.getId() == imageView4.getId()
//                                    || imageView8.getId() == imageView5.getId() || imageView8.getId() == imageView6.getId()) {
//                                imageView8.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView9.isPressed()) {
//                            if (imageView9.getId() == imageView1.getId() || imageView9.getId() == imageView2.getId() || imageView9.getId() == imageView3.getId() || imageView9.getId() == imageView4.getId()
//                                    || imageView9.getId() == imageView5.getId() || imageView9.getId() == imageView6.getId()) {
//                                imageView9.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView10.isPressed()) {
//                            if (imageView10.getId() == imageView1.getId() || imageView10.getId() == imageView2.getId() || imageView10.getId() == imageView3.getId() || imageView10.getId() == imageView4.getId()
//                                    || imageView10.getId() == imageView5.getId() || imageView10.getId() == imageView6.getId()) {
//                                imageView10.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView11.isPressed()) {
//                            if (imageView11.getId() == imageView1.getId() || imageView11.getId() == imageView2.getId() || imageView11.getId() == imageView3.getId() || imageView11.getId() == imageView4.getId()
//                                    || imageView11.getId() == imageView5.getId() || imageView11.getId() == imageView6.getId()) {
//                                imageView11.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                        if(imageView12.isPressed()) {
//                            if (imageView12.getId() == imageView1.getId() || imageView12.getId() == imageView2.getId() || imageView12.getId() == imageView3.getId() || imageView12.getId() == imageView4.getId()
//                                    || imageView12.getId() == imageView5.getId() || imageView12.getId() == imageView6.getId()) {
//                                imageView12.setVisibility(View.INVISIBLE);
//                            }
//                        }
//                    }
//                }


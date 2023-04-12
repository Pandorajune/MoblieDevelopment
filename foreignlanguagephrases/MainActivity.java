package com.example.foreignlanguagephrases;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView flagImageView;
    ArrayList<String> languageList = new ArrayList<>(Arrays.asList("Please select a Place", "China ", "France ", "Germany ", "Japan ", "Mexico "));
    String fileName;

    //String preparedLanguageList =  ;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        flagImageView = findViewById(R.id.imageView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, languageList);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String language = languageList.get(position);

                 fileName = language.toLowerCase().replaceAll(" ", "_flag").replaceAll("y", "");
                Log.d("DEBUG", "File Name= " + fileName);

                @SuppressLint("DiscouragedApi") int imageID = getResources().getIdentifier(fileName, "drawable", getPackageName());
                flagImageView.setImageResource(imageID);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //Fix below here
    @SuppressLint({"DiscouragedApi", "UseCompatLoadingForDrawables", "NonConstantResourceId"})
    public void click(View view) throws IOException {

        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;

        button1 = findViewById(R.id.excuseme);
        button2 = findViewById(R.id.ineedahotel);
        button3 = findViewById(R.id.ineedataxi);
        button4 = findViewById(R.id.howareyou);
        button5 = findViewById(R.id.howdoigettotheariport);
        button6 = findViewById(R.id.whendoesthetrainleave);

        char[] destArray = new char[2];

       fileName.getChars(0,2, destArray,0);

        String sound =  Arrays.toString(destArray).replace(",","").replace("[","").replace("]","").
                replaceAll(" ","").replace("me","sp") + "_excuseme";

        Log.d("DEBUG", "Sound ID: " + sound);

        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(sound, "raw", getPackageName()));

        //mediaPlayer = MediaPlayer.create(this, Uri.parse(sound));
        mediaPlayer.start();

    }
}
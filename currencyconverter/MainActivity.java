package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    Button clear;
    Button convert;

    TextView type;
    TextView converted;
    TextView USDEntered;

    String[] currencies = {" ","British Pound (GBP)", "Chinese Yuan (CNY)", "European Euro (EUR)", "Japanese Yen (JPY)", "Mexican Peso (MXN)",
            "Russian Ruble (RUB)", "Australian Dollar (AUD)", "Canadian Dollar (CAD)", "Swiss Franc (CHF)", "Indian Rupee (INR)"};




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        clear = findViewById(R.id.clearButton);
        convert = findViewById(R.id.convertButton);
        type = findViewById(R.id.typeOfCurrencey);
        converted = findViewById(R.id.convertedCurrency);
        USDEntered = findViewById(R.id.USD);


        USDEntered.setText("");
        type.setText("");
        converted.setText("");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,currencies);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                String typeOfCurrency = currencies[position];

                type.setText(typeOfCurrency);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void Click(){





    }

    //API URL: http://data.fixer.io/api/latest?access_key=9f7d228dbec4c8c73d426fa82103a1f1


    public void APISetUp() throws IOException {


        URL url = new URL("http://data.fixer.io/api/latest?access_key=9f7d228dbec4c8c73d426fa82103a1f1");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();

        //if(responseCode != 200){
        //throw new RuntimeException("HttpResponseCode: " + responseCode);
        //}else{
        //StringBuilder information = new StringBuilder();
        //Scanner scanner = new Scanner(url.openStream());
        //}




    }


}
package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.Format;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    TextView tipTextView;
    TextView totalTextView;
    EditText billAmountEditText;
    EditText tipPercentageEditText;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTextView = findViewById(R.id.tipTextView);
        totalTextView = findViewById(R.id.totalTextView);

        billAmountEditText = findViewById(R.id.billAmountEditText);
        tipPercentageEditText = findViewById(R.id.tipPercentageEditText);

    }

    public void calculateTip(View view) {

        Double dollarAmount = Double.parseDouble(billAmountEditText.getText().toString());
        Double percent = Double.parseDouble(tipPercentageEditText.getText().toString());

        Double mathPercent = (percent / 100) * dollarAmount;
        Double mathDollar = dollarAmount + mathPercent;

        tipTextView.setText(mathPercent.toString());
        totalTextView.setText(mathDollar.toString());

    }

}
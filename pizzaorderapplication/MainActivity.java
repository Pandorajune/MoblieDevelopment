package com.example.pizzaorderapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText phoneNumberEditText;

    RadioButton smallPizzaButton;
    RadioButton mediumPizzaButton;
    RadioButton largePizzaButton;

    RadioGroup sizeRadioGroup;
    RadioGroup crustRadioGroup;

    RadioButton thinCrustButton;
    RadioButton regularCrustButton;
    RadioButton deepDishButton;

    CheckBox pepperoniCheckBox;
    CheckBox sausageCheckBox;
    CheckBox oliveCheckBox;
    CheckBox mushroomCheckBox;
    CheckBox greenPepperCheckBox;
    CheckBox pineappleCheckBox;
    CheckBox onionCheckBox;
    CheckBox extraCheeseCheckBox;

    TextView orderSummaryTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText) ;
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);

        smallPizzaButton = findViewById(R.id.smallPizzaButton);
        mediumPizzaButton = findViewById(R.id.mediumPizzaButton);
        largePizzaButton = findViewById(R.id.largePizzaButton);

        thinCrustButton = findViewById(R.id.thinCrustButton);
        regularCrustButton = findViewById(R.id.regularCrustButton);
        deepDishButton = findViewById(R.id.deepDishButton);

        pepperoniCheckBox = findViewById(R.id.pepperoniCheckBox);
        sausageCheckBox = findViewById(R.id.sausageCheckBox);
        oliveCheckBox = findViewById(R.id.oliveCheckBox);
        mushroomCheckBox = findViewById(R.id.mushroomCheckBox);
        greenPepperCheckBox = findViewById(R.id.greenPepperCheckBox);
        pineappleCheckBox = findViewById(R.id.pineappleCheckBox);
        onionCheckBox = findViewById(R.id.onionCheckBox );
        extraCheeseCheckBox = findViewById(R.id.extraCheeseCheckBox);

        orderSummaryTextView = findViewById(R.id.orderSummaryTextView);
        orderSummaryTextView.setText("");

        sizeRadioGroup = findViewById(R.id.sizeRadioGroup);
        crustRadioGroup = findViewById(R.id.crustRadioGroup);

    }
    public void onCompleteButton(View view){

        ArrayList<String> optionsList = new ArrayList<>();

        String crust = "";
        String size = "";
        String order = "";

        boolean crustSelect = false;
        boolean sizeSelect = false;

        int selectedRadioButton = sizeRadioGroup.getCheckedRadioButtonId();
        int selectedRadioButton2 = crustRadioGroup.getCheckedRadioButtonId();

        if(selectedRadioButton != -1){
            sizeSelect = true;
            RadioButton selected = findViewById(selectedRadioButton);
            size = selected.getText().toString();
        }else{
            sizeSelect = false;
            Toast.makeText(this,"You need to choose a size", Toast.LENGTH_LONG).show();
        }

        if(selectedRadioButton2 != -1){
            crustSelect = true;
            RadioButton selected2 = findViewById(selectedRadioButton2);
            crust = selected2.getText().toString();
        }else{
            crustSelect = false;
            Toast.makeText(this,"You need to choose a crust type", Toast.LENGTH_LONG).show();
        }

        if(pepperoniCheckBox.isChecked()){
            optionsList.add("Pepperoni");
        }
        if(sausageCheckBox.isChecked()){
            optionsList.add("Sausage");
        }
        if(oliveCheckBox.isChecked()){
            optionsList.add("Olives");
        }
        if(mushroomCheckBox.isChecked()){
            optionsList.add("Mushrooms");
        }
        if(greenPepperCheckBox.isChecked()){
            optionsList.add("Green Peppers");
        }
        if(pineappleCheckBox.isChecked()){
            optionsList.add("Pineapple");
        }
        if(onionCheckBox.isChecked()){
            optionsList.add("Onions");
        }
        if(extraCheeseCheckBox.isChecked()){
            optionsList.add("Extra Cheese");
        }

        String listOfOptions = " ";
        if(!optionsList.isEmpty()){
            listOfOptions = listOfOptions + "and with ";
        }

        for(int i = 0; i < optionsList.size(); i++){
            if(i != optionsList.size() - 2){
                listOfOptions = listOfOptions + optionsList.get(i) + ", ";
            }else{
                listOfOptions = listOfOptions + optionsList.get(i) + " and ";
            }
        }

        order = "You ordered a " + size + " pizza with a " + crust + listOfOptions;

        if(sizeSelect == true && crustSelect == true){
            orderSummaryTextView.setText(order);
            Bundle data = new Bundle();
            data.putString("order", order);
            Intent newActivity = new Intent(this, secondOrder.class);
            newActivity.putExtras(data);
            startActivity(newActivity);
        }



    }
}
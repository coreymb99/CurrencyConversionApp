package com.example.currencyconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // begin listing variables

    double euro = 0.87263;
    double mex = 22.4586;
    double canadian = 1.35183;
    double dollarsEntered;
    double convertedCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Displays App Logo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        //final variables here
        final EditText userInput = (EditText) findViewById(R.id.hntRequest);
        final RadioButton rad1 = (RadioButton) findViewById(R.id.rad1);
        final RadioButton rad2 = (RadioButton) findViewById(R.id.rad2);
        final RadioButton rad3 = (RadioButton) findViewById(R.id.rad3);
        final TextView result = (TextView) findViewById(R.id.txtResult);

        //GUI Time
        Button button = (Button) findViewById(R.id.btnConvert);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Time to code the algorithms for the app
                dollarsEntered = Double.parseDouble(userInput.getText().toString());
                DecimalFormat tenth = new DecimalFormat("$###,###.00");
                if(rad1.isChecked()) {
                    if(dollarsEntered <= 100000) {
                        convertedCurrency = dollarsEntered * mex;
                        result.setText(tenth.format(convertedCurrency) + " Mexican Pesos");

                    } else {
                        Toast.makeText(MainActivity.this,"This app only converts US Dollars below $100,000", Toast.LENGTH_LONG).show();
                    }
                } //  rad 1
                if(rad2.isChecked()) {
                    if(dollarsEntered <= 100000) {
                        convertedCurrency = dollarsEntered * euro;
                        result.setText(tenth.format(convertedCurrency) + " Euros");

                    } else {
                        Toast.makeText(MainActivity.this,"This app only converts US Dollars below $100,000", Toast.LENGTH_LONG).show();
                    }
                } // end of rad 2
                if(rad3.isChecked()) {
                    if(dollarsEntered <= 100000) {
                        convertedCurrency = dollarsEntered * canadian;
                        result.setText(tenth.format(convertedCurrency) + " Canadian Dollars");

                    } else {
                        Toast.makeText(MainActivity.this,"This app only converts US Dollars below $100,000", Toast.LENGTH_LONG).show();
                    }
                }



            }


    });
    }// end of onCreate
}//  end of Main
//Corey Bartlett SPC ID: 2374833
//Did better on the naming scheme for my variables compared to last week.
//Note: Struggled on my Layout, but it works as intended still.
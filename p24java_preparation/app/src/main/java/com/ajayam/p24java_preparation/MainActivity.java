package com.ajayam.p24java_preparation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultant;
    String say ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       resultant = findViewById(R.id.resulttext);
       say = findViewById(R.id.say);

        long number = 554646364;
        say = ("I thankyou for your attention.");

        resultant.setText(String.valueOf(number));

        say.setText(String.valueOf(say));





    }
}
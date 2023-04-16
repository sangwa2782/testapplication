package com.ajayam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editWeight, editHeightFT, editHeightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout liMain;

        editWeight = findViewById(R.id.editWeight);
        editHeightFT = findViewById(R.id.editHeightFt);
        editHeightIn = findViewById(R.id.editHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        liMain = findViewById(R.id.liMain);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(editWeight.getText().toString());
                int ft = Integer.parseInt(editHeightFT.getText().toString());
                int in = Integer.parseInt(editHeightIn.getText().toString());


                int totalIn = ft * 12 + in;

                double totalCm = totalIn * 2.5;

                double totalM = totalCm / 100;

                double bmi = wt / (totalM * totalM);

                if (bmi > 25) {
                    txtResult.setText("You'r OverWeight!");
                    liMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                } else if (bmi < 18) {
                    txtResult.setText("You'r UnderWeight");
                    liMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                } else {
                    txtResult.setText("You'r Healthy");
                    liMain.setBackgroundColor(getResources().getColor(R.color.colorH));
                }
            }
        });



    }
}
package com.ajayam.customtoastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);

        // Default toast
       // Toast.makeText(getApplicationContext(),"This is my first Toast", Toast.LENGTH_LONG).show();

        //Custome Toast

        btnToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast toast = new Toast((getApplicationContext()));

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewContainer));

                toast.setView(view);

                TextView txtMsg = view.findViewById(R.id.txtMsg);

                txtMsg.setText("Message Sent Successfully");

                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();
            }
        });



    }
}
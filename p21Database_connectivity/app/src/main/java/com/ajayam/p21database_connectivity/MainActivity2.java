package com.ajayam.p21database_connectivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String sessionId = getIntent().getStringExtra("key");
        Log.d("TAG", "onCreate: " + sessionId);


    }
}
package com.ajayam.waycoolapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView homeBtmView;
    ImageButton getMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMap = findViewById(R.id.getMap);
        homeBtmView = findViewById(R.id.homeBtmView);

        //INTENT PASSING FOR MAP
        getMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iNextMap;
                iNextMap = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(iNextMap);
            }
        });
//

        homeBtmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id==R.id.nav_home){

                } else if (id==R.id.nav_category) {
                    Intent iNext;
                    iNext = new Intent(MainActivity.this, Categories.class);
                    startActivity(iNext);

                } else if (id==R.id.nav_search) {

                } else if (id==R.id.nav_premium) {

                } else {
                    Intent iNext;
                    iNext = new Intent(MainActivity.this, cart.class);
                    startActivity(iNext);
                }

                return true;
            }
        });



    }
}
package com.ajayam.waycoolapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Categories extends AppCompatActivity {

    BottomNavigationView categoryBtmView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        categoryBtmView = findViewById(R.id.categoryBtmView);

        // set home selected
        categoryBtmView.setSelectedItemId(R.id.nav_category);
        //INTENT PASSING FOR MAP
        categoryBtmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id==R.id.nav_home){
                    Intent iNext;
                    iNext = new Intent(Categories.this, MainActivity.class);
                    startActivity(iNext);

                } else if (id==R.id.nav_category) {


                } else if (id==R.id.nav_search) {

                } else if (id==R.id.nav_premium) {

                } else {
                    Intent iNext;
                    iNext = new Intent(Categories.this, cart.class);
                    startActivity(iNext);
                }

                return true;
            }
        });


    }
}
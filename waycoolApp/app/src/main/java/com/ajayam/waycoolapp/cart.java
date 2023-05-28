package com.ajayam.waycoolapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class cart extends AppCompatActivity {
    ArrayList<CartModel> arrCartObject = new ArrayList<>();
    BottomNavigationView cartBtmView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        cartBtmView = findViewById(R.id.cartBtmView);


        RecyclerView recyclerView = findViewById(R.id.recyclerCartObj);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrCartObject.add(new CartModel(R.drawable.c_orange_juice, "250 gram", "₹60", "Real Orange Juice", "1 pack"));
        arrCartObject.add(new CartModel(R.drawable.c_banana, "2 kg","₹160", "Banana", "2 packs"));
        arrCartObject.add(new CartModel(R.drawable.c_apple, "1 kg", "₹115", "Apple Fuji", "1 pack"));
        arrCartObject.add(new CartModel(R.drawable.c_skippy, "200 grams","₹45", "Skippy", "1 pack"));
        arrCartObject.add(new CartModel(R.drawable.c_sargento,  "100 grams","₹205", "Sargento", "1 pack"));
        arrCartObject.add(new CartModel(R.drawable.c_olpers,  "150 grams","₹80", "Olpers", "2 packs"));


        RecyclerCartAdapter adapter = new RecyclerCartAdapter(this, arrCartObject);
        recyclerView.setAdapter(adapter);



        // set home selected
        cartBtmView.setSelectedItemId(R.id.cart_cart);

        // Perform item selected listener
        cartBtmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
//
                if (id==R.id.cart_home){
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                } else if (id==R.id.cart_cart) {
                    return true;
                } else {

                }
                return false;
            }
        });





    }




}
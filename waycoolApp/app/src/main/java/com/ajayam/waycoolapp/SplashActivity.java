package com.ajayam.waycoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView textAnim;
    ImageView linId1, linId2,linId3, linId4,linId5, linId6,linId7, linId8,linId9, linId10,linId11, linId12,linId13, linId14, linId16,linId17, linId18,linId19, linId20,linId21, linId22, linId23, linId24,linId25, linId26;
    ImageView relId1, relId2,relId3,relId4,relId5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        linId1 = findViewById(R.id.linId1);
        linId2 = findViewById(R.id.linId2);
        linId3 = findViewById(R.id.linId3);
        linId4 = findViewById(R.id.linId4);
        linId5 = findViewById(R.id.linId5);
        linId6 = findViewById(R.id.linId6);
        linId7 = findViewById(R.id.linId7);
        linId8 = findViewById(R.id.linId8);
        linId9 = findViewById(R.id.linId9);
        linId10 = findViewById(R.id.linId10);
        linId11 = findViewById(R.id.linId11);
        linId12 = findViewById(R.id.linId12);
        linId13 = findViewById(R.id.linId13);
        linId14 = findViewById(R.id.linId14);
//        linId15 = findViewById(R.id.linId15);
        linId16 = findViewById(R.id.linId16);
        linId17 = findViewById(R.id.linId17);
        linId18 = findViewById(R.id.linId18);
        linId19 = findViewById(R.id.linId19);
        linId20 = findViewById(R.id.linId20);
        linId21 = findViewById(R.id.linId21);
        linId22 = findViewById(R.id.linId22);
        linId23 = findViewById(R.id.linId23);
        linId24 = findViewById(R.id.linId24);
        linId25 = findViewById(R.id.linId25);
        linId26 = findViewById(R.id.linId26);

        relId1 = findViewById(R.id.relId1);
        relId2 = findViewById(R.id.relId2);
        relId3 = findViewById(R.id.relId3);
        relId4 = findViewById(R.id.relId4);
        relId5 = findViewById(R.id.relId5);

        Animation fade = AnimationUtils.loadAnimation(this, R.anim.fade);

        linId1.startAnimation(fade);
        linId2.startAnimation(fade);
        linId3.startAnimation(fade);
        linId4.startAnimation(fade);
        linId5.startAnimation(fade);
        linId6.startAnimation(fade);
        linId7.startAnimation(fade);
        linId8.startAnimation(fade);
        linId9.startAnimation(fade);
        linId10.startAnimation(fade);
        linId11.startAnimation(fade);
        linId12.startAnimation(fade);
        linId13.startAnimation(fade);
        linId14.startAnimation(fade);
//        linId15.startAnimation(fade);
        linId16.startAnimation(fade);
        linId17.startAnimation(fade);
        linId18.startAnimation(fade);
        linId19.startAnimation(fade);
        linId20.startAnimation(fade);
        linId21.startAnimation(fade);
        linId22.startAnimation(fade);
        linId23.startAnimation(fade);
        linId24.startAnimation(fade);
        linId25.startAnimation(fade);
        linId26.startAnimation(fade);

        relId1.startAnimation(fade);
        relId2.startAnimation(fade);
        relId3.startAnimation(fade);
        relId4.startAnimation(fade);
        relId5.startAnimation(fade);






//        Animation slideup = AnimationUtils.loadAnimation(this, R.anim.slideup);


        textAnim = findViewById(R.id.txtAnim);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        textAnim.startAnimation(scale);







        Intent iHome = new Intent(SplashActivity.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(iHome);
            }
        }, 4000);


    }
}
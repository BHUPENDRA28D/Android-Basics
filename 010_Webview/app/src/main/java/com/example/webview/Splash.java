package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

        Animation topAnim, btmAnim;
        ImageView img;
        TextView logo, slogan;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
            btmAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

            img = findViewById(R.id.imageView);
            logo = findViewById(R.id.title);
            slogan = findViewById(R.id.subtittle);

            img.setAnimation(topAnim);
            logo.setAnimation(btmAnim);
            slogan.setAnimation(btmAnim);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(Splash.this, MainActivity.class);
                    Pair[] pairs = new Pair[2];
                    pairs[0] =new Pair<View,String>(img,"logo_img");
                    pairs[1] =new Pair<View,String>(logo,"logo_text");

                    ActivityOptions activityOptions =ActivityOptions.makeSceneTransitionAnimation(Splash.this,pairs);
                    startActivity(i, activityOptions.toBundle());
                    finish();
                }
            }, 5000);


        }
    }
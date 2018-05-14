package com.example.shubham.memory_game;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Handler h= new Handler();
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.iv);
        Animation ani = AnimationUtils.loadAnimation(MainActivity.this , R.anim.logo);
        img.startAnimation(ani);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(MainActivity.this,selectpage.class);
                startActivity(i);
            }
        },2000);

    }
}

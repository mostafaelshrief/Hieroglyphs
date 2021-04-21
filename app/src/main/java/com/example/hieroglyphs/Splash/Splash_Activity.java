package com.example.hieroglyphs.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.hieroglyphs.Main.MainActivity;
import com.example.hieroglyphs.R;

public class Splash_Activity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.image_splash);
        Glide.with(this)
                .load(R.drawable.mummy)
                .into(imageView);
        splashTimer();
        
    }

    private void splashTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivities(new Intent[]{new Intent(Splash_Activity.this, MainActivity.class)});
            }
        }, 6000);

    }
}
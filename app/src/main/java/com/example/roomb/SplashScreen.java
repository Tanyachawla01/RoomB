package com.example.roomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
     Animation topAnim,bottomAnim;
     TextView logo;
     ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);



        topAnim = AnimationUtils.loadAnimation(this,R.anim.top);
        bottomAnim =AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        image =findViewById(R.id.img);
        logo=findViewById(R.id.textView);

    }
}

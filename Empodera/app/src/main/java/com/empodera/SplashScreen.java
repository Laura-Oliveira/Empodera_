package com.empodera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends AppCompatActivity
{
    /* Timer Splash Screen */
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable()
        {
            /* THis method will run right after the execution of the splash finish */
            @Override
            public void run()
            {   /* The Main Activity will be started */
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

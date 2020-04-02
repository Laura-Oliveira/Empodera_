package com.empodera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = findViewById(R.id.activity_main);
        view.setBackgroundColor(getResources().getColor(R.color.color_background));
    }

    public void registerService(View view)
    {
        Intent registerServiceActivityObject = new Intent(this, RegisterServiceActivity.class);
        startActivity(registerServiceActivityObject);
    }

    public void searchWorker(View view)
    {
        Intent searchWorkerActivity = new Intent(this, SearchWorkerActivity.class);
        startActivity(searchWorkerActivity);
    }

    public void learnSubject(View view)
    {
        Intent learnSubjectActivityObject = new Intent(this, LearnSubjectActivity.class);
        startActivity(learnSubjectActivityObject);
    }
}

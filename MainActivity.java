package com.example.rob.final_v10;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity   {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.straight);
        mPlayer.start();

    }


    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.Beermenu)
        {
            Intent beerActivity = new Intent(this, ViewDatabase.class);
            startActivity(beerActivity);

        }
    }

    public void onButton2Click(View v)
    {
        if(v.getId()==R.id.Winemenu)
        {
            Intent wineActivity = new Intent(this, ViewWineData.class);
            startActivity(wineActivity);

        }
    }

    public void onButton3Click(View v)
    {
        if(v.getId()==R.id.Foodmenu)
        {
            Intent foodActivity = new Intent(this, ViewFoodData.class);
            startActivity(foodActivity);

        }
    }

    public void onButton4Click(View v)
    {
        if(v.getId()==R.id.Feedback)
        {
            Intent feedActivity = new Intent(this, Feedback.class);
            startActivity(feedActivity);

        }
    }
}


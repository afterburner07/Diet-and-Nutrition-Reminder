package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                nextActivity();
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
    void changeScreen()
    {
        ;
    }

    public void buttonForwardOnClick(View v)
    {
        nextActivity();
    }

    public void nextActivity()
    {
        Intent secondIntent=new Intent(this,SecondActivity.class);
        startActivity(secondIntent);
    }

    public void buttonExitOnClick(View v)
    {
        finish();
        System.exit(0);
    }
}

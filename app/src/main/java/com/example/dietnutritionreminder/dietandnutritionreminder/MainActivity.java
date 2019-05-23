package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void changeScreen()
    {
        ;
    }

    public void buttonForwardOnClick(View v)
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

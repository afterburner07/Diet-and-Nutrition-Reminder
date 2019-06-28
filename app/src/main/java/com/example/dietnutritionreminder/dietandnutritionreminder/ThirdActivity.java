package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void onClickBack(View v)
    {
//        getIntent().addFlags(getIntent().FLAG_ACTIVITY_CLEAR_TOP);
//        finish();
        super.finish();
//        onBackPressed();
//        finishActivity(0);
    }

    public void onClickForward(View v)
    {
        Intent intentFourth=new Intent(this,FourthActivity.class);
        startActivity(intentFourth);
    }
}

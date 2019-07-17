package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(SecondActivity.this,"Tap here to go to Settings",Toast.LENGTH_LONG).show();
                return false;
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                goToSettings();
            }
        });

    }

    public void goToSettings() {
        Intent intentSettings=new Intent(this, SettingsActivity.class);
        startActivity(intentSettings);
    }

    private void gotoLunchNutritionList(char selectedMeal) {
        Intent intentThird=new Intent(this,ThirdActivity.class);
        intentThird.putExtra("MealName",selectedMeal );
        startActivity(intentThird);
    }

    public void onClicktextMealName(View v) {
        mealList.Breakfast.defineVegetable();
        mealList.Breakfast.defineRice();
        mealList.Breakfast.defineMeat();
        mealList.Breakfast.defineFish();
        gotoLunchNutritionList('l');
    }

    public void onClicktextMealAfternoon(View v) {
        mealList.Afternoon.defineGreenTea();
        mealList.Afternoon.defineBiscuit();
        gotoLunchNutritionList('a');
//        mealList.
    }

    public void onClicktextMealDinner(View v) {
        mealList.Dinner.defineBread();
        mealList.Dinner.defineVegetable();
        mealList.Dinner.defineMilk();
        gotoLunchNutritionList('d');
    }

    public void onClicktextMealBreakfast(View v) {
        mealList.Breakfast.defineBread();
        mealList.Breakfast.defineVegetable();
        mealList.Breakfast.defineEgg();
        mealList.Breakfast.defineBanana();
        gotoLunchNutritionList('b');
    }


    public void buttonBackOnClick(View v)
    {
//        getIntent().addFlags(getIntent().FLAG_ACTIVITY_CLEAR_TOP);
//        finish();
//        super.finish();
//        onBackPressed();
//        finishActivity(0);
        finish();
        System.exit(0);
//        mealList.
    }

    public void buttonForwardOnClick(View v) {
        gotoLunchNutritionList('l');
    }

    public void onBackPressed()
    {
        finish();
        System.exit(0);
    }

}

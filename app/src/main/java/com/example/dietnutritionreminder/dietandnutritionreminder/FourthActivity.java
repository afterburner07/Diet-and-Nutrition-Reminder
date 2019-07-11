package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView textViewFoodName;
    public String foodName=new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        foodName=getIntent().getStringExtra("FoodName");
        textViewFoodName=(TextView) findViewById(R.id.textViewfoodName);
        textViewFoodName.setText(foodNameCheck());
    }

    public String foodNameCheck() {
        String returnMealName = new String();
        switch (foodName) {
            case "ch":
                returnMealName = "Chicken";
                break;
            case "ri":
                returnMealName = "Rice";
                break;
            case "fr":
                returnMealName = "Fruits";
                break;
            case "ve":
                returnMealName = "Vegetable";
                break;
            case "fi":
                returnMealName = "Fish";
                break;
            default:
                returnMealName = "Chicken";
        }
        return returnMealName;
    }

    public void onClickForward(View v)
    {
        ;
    }

    public void onClickBack(View v)
    {
        super.finish();
    }

}

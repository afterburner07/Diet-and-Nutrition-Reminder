package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    TextView textViewMealName;
    public char mealName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mealName=getIntent().getCharExtra("MealName",'l');
        textViewMealName=(TextView) findViewById(R.id.textViewMealName);
        textViewMealName.setText(mealNameCheck());
    }

    public String mealNameCheck() {
        String returnMealName=new String();
        switch (mealName)
        {
            case 'b':
                returnMealName="Breakfast";
                break;
            case 'l':
                returnMealName="Lunch";
                break;
            case 'a':
                returnMealName="Afternoon";
                break;
            case 'd':
                returnMealName="Dinner";
                break;
            default:
                returnMealName="Lunch";
        }
        return returnMealName;
    }

    public void onClicktextChicken(View v) {
        gotoNutritionChicken("ch");
    }

    public void onClicktextRice(View v) {
        gotoNutritionChicken("ri");
    }

    public void onClicktextFruits(View v) {
        gotoNutritionChicken("fr");
    }
    public void onClicktextVegetable(View v) {
        gotoNutritionChicken("ve");
    }

    public void onClicktextFish(View v) {
        gotoNutritionChicken("fi");
    }

    private void gotoNutritionChicken(String selectedFood) {
        Intent intentFourth=new Intent(this,FourthActivity.class);
        intentFourth.putExtra("FoodName",selectedFood );
        startActivity(intentFourth);
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
        gotoNutritionChicken("ch");
    }
}

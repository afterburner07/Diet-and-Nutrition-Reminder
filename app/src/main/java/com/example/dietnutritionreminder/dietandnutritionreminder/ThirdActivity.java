package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textViewMealName,textViewNutriotion1,textViewNutriotion2,
            textViewNutriotion3,textViewNutriotion4,textViewNutriotion5,
            textViewTotalCalories,textViewTotalFat ;
    public char mealName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mealName=getIntent().getCharExtra("MealName",'l');
        textViewMealName=(TextView) findViewById(R.id.textViewMealName);
        textViewNutriotion1=(TextView) findViewById(R.id.textViewNutrition1);
        textViewNutriotion2=(TextView) findViewById(R.id.textViewNutrition2);
        textViewNutriotion3=(TextView) findViewById(R.id.textViewNutrition3);
        textViewNutriotion4=(TextView) findViewById(R.id.textViewNutrition4);
        textViewNutriotion5=(TextView) findViewById(R.id.textViewNutrition5);
        textViewTotalCalories=(TextView) findViewById(R.id.textViewTotalCalories);
        textViewTotalFat=(TextView) findViewById(R.id.textViewTotalFat);
        textViewMealName.setText(mealNameCheck());
    }

    public String mealNameCheck() {
        Float totalCal,totalFat;
        String returnMealName=new String();
        switch (mealName)
        {
            case 'b':
                returnMealName="Breakfast";
                textViewNutriotion1.setText(mealList.Breakfast.food1);
                textViewNutriotion2.setText(mealList.Breakfast.food2);
                textViewNutriotion3.setText(mealList.Breakfast.food3);
                textViewNutriotion4.setText(mealList.Breakfast.food4);
                totalCal=mealList.totalCalories;
                mealList.totalCalories=0;
                totalFat=mealList.totalFat;
                mealList.totalFat=0;
                textViewTotalCalories.setText(Float.toString(totalCal));
                textViewTotalFat.setText(Float.toString(totalFat)+" gm");
                textViewNutriotion5.setVisibility(View.GONE);
                break;
            case 'l':
                returnMealName="Lunch";
                textViewNutriotion1.setText(mealList.Lunch.food1);
                textViewNutriotion2.setText(mealList.Lunch.food2);
                textViewNutriotion3.setText(mealList.Lunch.food3);
                textViewNutriotion4.setText(mealList.Lunch.food4);
                textViewNutriotion5.setVisibility(View.GONE);
                totalCal=mealList.totalCalories;
                mealList.totalCalories=0;
                totalFat=mealList.totalFat;
                mealList.totalFat=0;
                textViewTotalCalories.setText(Float.toString(totalCal));
                textViewTotalFat.setText(Float.toString(totalFat)+" gm");
                break;
            case 'a':
                returnMealName="Afternoon";
                textViewNutriotion1.setText(mealList.Afternoon.food1);
                textViewNutriotion2.setText(mealList.Afternoon.food2);
                textViewNutriotion3.setVisibility(View.GONE);
                textViewNutriotion4.setVisibility(View.GONE);
                textViewNutriotion5.setVisibility(View.GONE);
                totalCal=mealList.totalCalories;
                mealList.totalCalories=0;
                totalFat=mealList.totalFat;
                mealList.totalFat=0;
                textViewTotalCalories.setText(Float.toString(totalCal));
                textViewTotalFat.setText(Float.toString(totalFat)+" gm");
                break;
            case 'd':
                returnMealName="Dinner";
                textViewNutriotion1.setText(mealList.Dinner.food1);
                textViewNutriotion2.setText(mealList.Dinner.food2);
                textViewNutriotion3.setText(mealList.Dinner.food3);
                textViewNutriotion4.setVisibility(View.GONE);
                textViewNutriotion5.setVisibility(View.GONE);
                totalCal=mealList.totalCalories;
                mealList.totalCalories=0;
                totalFat=mealList.totalFat;
                mealList.totalFat=0;
                textViewTotalCalories.setText(Float.toString(totalCal));
                textViewTotalFat.setText(Float.toString(totalFat)+" gm");
                break;
            default:
                returnMealName="Lunch";
                textViewNutriotion1.setText(mealList.Lunch.food1);
                textViewNutriotion2.setText(mealList.Lunch.food2);
                textViewNutriotion3.setText(mealList.Lunch.food3);
                textViewNutriotion4.setText(mealList.Lunch.food4);
                textViewNutriotion5.setVisibility(View.GONE);
                totalCal=mealList.totalCalories;
                mealList.totalCalories=0;
                totalFat=mealList.totalFat;
                mealList.totalFat=0;
                textViewTotalCalories.setText(Float.toString(totalCal));
                textViewTotalFat.setText(Float.toString(totalFat)+" gm");
        }
        return returnMealName;
    }

    public void onClickNutrition1(View v) {
        gotoNutritionFoodValues(textViewNutriotion1.getText().toString());
    }

    public void onClickNutrition2(View v) {
        gotoNutritionFoodValues(textViewNutriotion2.getText().toString());
    }

    public void onClickNutrition3(View v) {
        gotoNutritionFoodValues(textViewNutriotion3.getText().toString());
    }
    public void onClickNutrition4(View v) {
        gotoNutritionFoodValues(textViewNutriotion4.getText().toString());
    }

    public void onClickNutrition5(View v) {
        gotoNutritionFoodValues(textViewNutriotion5.getText().toString());
    }

    private void gotoNutritionFoodValues(String selectedFood) {
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
        gotoNutritionFoodValues(textViewNutriotion1.getText().toString());
    }
}

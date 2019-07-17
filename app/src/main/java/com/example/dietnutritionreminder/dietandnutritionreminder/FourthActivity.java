package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView textViewFoodName,textViewCalories,textViewCarvs,textViewCholestrol,textViewPipit,
            textViewCalcium,textViewIron,textViewPotassium,textViewFat,
            textViewSodium,textViewProtein,textViewTransFat,textViewVitaminA,
            textViewVitaminC,textViewCarbohydrate,textViewSugar,textViewTransfat;
    public String foodName=new String();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        foodName=getIntent().getStringExtra("FoodName");
        textViewFoodName=(TextView) findViewById(R.id.textViewfoodName);
        textViewCalories=(TextView) findViewById(R.id.textViewCaloriesVal);
        textViewCarvs=(TextView) findViewById(R.id.textViewCarvsVal);
        textViewCholestrol=(TextView) findViewById(R.id.textViewCholestrolVal);
        textViewPipit=(TextView) findViewById(R.id.textViewPipitVal);
        textViewCalcium=(TextView) findViewById(R.id.textViewCalcioumVal);
        textViewIron=(TextView) findViewById(R.id.textViewIronVal);
        textViewPotassium=(TextView) findViewById(R.id.textViewPotassiumVal);
        textViewFat=(TextView) findViewById(R.id.textViewFatVal);
        textViewSodium=(TextView) findViewById(R.id.textViewSodiumVal);
        textViewProtein=(TextView) findViewById(R.id.textViewProteinVal);
        textViewTransFat=(TextView) findViewById(R.id.textViewTransFatVal);
        textViewVitaminA=(TextView) findViewById(R.id.textViewVitaminAVal);
        textViewVitaminC=(TextView) findViewById(R.id.textViewVitaminCVal);
        textViewCarbohydrate=(TextView) findViewById(R.id.textViewCarbohydrateVal);
        textViewSugar=(TextView) findViewById(R.id.textViewSugarVal);

        textViewFoodName.setText(foodNameCheck());
    }

    public String foodNameCheck() {
//        final String foodVegetable=mealList.foodVegetable.toLowerCase();
        Float calories,carvs,cholestrol,pipit,calcium,iron,potassium,fat,sodium,protein,transfat,vitaminA,vitaminC,
        carbohydrate,sugar;
        String returnMealName = new String();
        switch (foodName) {
            case "Bread":
                returnMealName = mealList.foodBread.toString();
                calories=mealList.calories;
                textViewCalcium.setText(Float.toString(calories));
                iron=mealList.iron;
                textViewIron.setText(Float.toString(iron));
                potassium=mealList.potassium;
                textViewPotassium.setText(Float.toString(potassium));
                break;
            case "Rice":
                returnMealName = mealList.foodRice.toString();
                calories=mealList.calories;
                textViewCalories.setText(Float.toString(calories));
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                sodium=mealList.sodium;
                textViewSodium.setText(Float.toString(sodium));
                carbohydrate=mealList.calories;
                textViewCarbohydrate.setText(Float.toString(carbohydrate));
                sugar=mealList.sugar;
                textViewSugar.setText(Float.toString(sugar));
                calcium=mealList.calcium;
                textViewCalcium.setText(Float.toString(calcium));
                break;
            case "Vegetable":
                returnMealName = mealList.foodVegetable.toString();
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                cholestrol=mealList.cholesterol;
                textViewCholestrol.setText(Float.toString(cholestrol));
                sodium=mealList.sodium;
                textViewSodium.setText(Float.toString(sodium));
                break;
            case "Egg":
                returnMealName = mealList.foodEgg.toString();
                calcium=mealList.calcium;
                textViewCalcium.setText(Float.toString(calcium));
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                cholestrol=mealList.cholesterol;
                textViewCholestrol.setText(Float.toString(cholestrol));
                sodium=mealList.sodium;
                textViewSodium.setText(Float.toString(sodium));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                break;
            case "Banana":
                returnMealName = mealList.foodBanana.toString();
                calcium=mealList.calcium;
                textViewCalcium.setText(Float.toString(calcium));
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                break;
            case "Guava":
                returnMealName = mealList.foodGuava.toString();
                calories=mealList.calories;
                textViewCalories.setText(Float.toString(calories));
                pipit=mealList.pipit;
                textViewPipit.setText(Float.toString(pipit));
                carbohydrate=mealList.calories;
                textViewCarbohydrate.setText(Float.toString(carbohydrate));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                break;
            case "Meat":
                returnMealName = mealList.foodMeat.toString();
                calories=mealList.calories;
                textViewCalories.setText(Float.toString(calories));
                carvs=mealList.carves;
                textViewCarvs.setText(Float.toString(carvs));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                break;
            case "Fish":
                returnMealName = mealList.foodFish.toString();
                calories=mealList.calories;
                textViewCalories.setText(Float.toString(calories));
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                cholestrol=mealList.cholesterol;
                textViewCholestrol.setText(Float.toString(cholestrol));
                break;
            case "Milk":
                returnMealName = mealList.foodMilk.toString();
                vitaminA=mealList.vitaminA;
                textViewVitaminA.setText(Float.toString(vitaminA));
                vitaminC=mealList.vitaminC;
                textViewVitaminC.setText(Float.toString(vitaminC));
                iron=mealList.iron;
                textViewIron.setText(Float.toString(iron));
                calcium=mealList.calcium;
                textViewCalcium.setText(Float.toString(calcium));
                sodium=mealList.sodium;
                textViewSodium.setText(Float.toString(sodium));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                break;
            case "Green Tea":
                returnMealName = mealList.foodGreenTea.toString();
                calories=mealList.calories;
                textViewCalories.setText(Float.toString(calories));
                transfat=mealList.transfat;
                textViewTransFat.setText(Float.toString(transfat));
                break;
            case "Biscuit":
                returnMealName = mealList.foodBiscuit.toString();
                sodium=mealList.sodium;
                textViewSodium.setText(Float.toString(sodium));
                protein=mealList.protein;
                textViewProtein.setText(Float.toString(protein));
                fat=mealList.fat;
                textViewFat.setText(Float.toString(fat));
                break;
            default:
                returnMealName = mealList.foodBread.toString();
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

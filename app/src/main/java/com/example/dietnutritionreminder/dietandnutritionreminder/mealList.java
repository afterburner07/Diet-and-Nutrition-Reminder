package com.example.dietnutritionreminder.dietandnutritionreminder;

public class mealList {
    public static String strthis=new String("Meal list");
    public static String foodBread=new String("Bread");
    public static String foodRice=new String("Rice");
    public static String foodVegetable=new String("Vegetable");
    public static String foodEgg=new String("Egg");
    public static String foodBanana=new String("Banana");
    public static String foodGuava=new String("Guava");
    public static String foodMeat=new String("Meat");
    public static String foodFish=new String("Fish");
    public static String foodMilk=new String("Milk");
    public static String foodGreenTea=new String("Green Tea");
    public static String foodBiscuit=new String("Biscuit");
    public static float calcium;
    public static float calciumVal;
    public static float iron;
    public static float ironVal;
    public static float potassium;
    public static float potassiumVal;
    public static float fat;
    public static float fatVal;
    public static float cholesterol;
    public static float cholesterolVal;
    public static float sodium;
    public static float sodiumVal;
    public static float protein;
    public static float proteinVal;
    public static float calories;
    public static float caloriesVal;
    public static float pipit;
    public static float pipitVal;
    public static float carbohydrate;
    public static float carbohydrateVal;
    public static float sugar;
    public static float sugarVal;
    public static float carves;
    public static float carvesVal;
    public static float transfat;
    public static float transfatVal;
    public static float vitaminA;
    public static float vitaminAVal;
    public static float vitaminC;
    public static float vitaminCVal;
    public static float totalCalories=0;
    public static float totalFat=0;
    public static void defineBread() {
        calcium=(float)76;
        calciumVal=calcium;
        iron=(float)1.7;
        ironVal=iron;
        potassium=(float)50;
        potassiumVal=potassium;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineVegetable() {
        fat=(float)4;
        cholesterol=(float)0;
        sodium=(float)97;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineEgg() {
        calcium=(float)78;
        fat=(float)5.3;
        cholesterol=(float)176;
        sodium=(float)6.2;
        protein=(float)6.3;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineBanana() {
        calcium=(float)78;
        fat=(float)0.45;
        protein=(float)1.48;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineGuava() {
        calories=(float)68.1;
        pipit=(float)1;
        carbohydrate=(float)14;
        protein=(float)2.6;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineLemon() {
        calories=(float)28.9;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineRice() {
        calories=(float)684.5;
        fat=(float)1;
        sodium=(float)0.5;
        carbohydrate=(float)142.9;
        sugar=(float)1.6;
        calcium=(float)42.6;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineMeat() {
        calories=(float)195;
        carves=(float)0;
        protein=(float)29.5;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineFish() {
        calories=(float)142;
        fat=(float)8;
        protein=(float)9;
        cholesterol=(float)27;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineGreenTea() {
        calories=(float)2;
        transfat=(float)0;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineBiscuit() {
        sodium=(float)2390;
        protein=(float)52;
        fat=(float)56;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static void defineMilk() {
        vitaminA=(float)0;
        vitaminC=(float)4.1;
        iron=(float)0.7;
        calcium=(float)24;
        sodium=(float)127;
        protein=(float)8.5;
        totalCalories+=calories;
        totalFat+=fat;
    }
    public static class Breakfast extends mealList {
        public static String food1=new String("Bread");
        public static String food2=new String("Vegetable");
        public static String food3=new String("Egg");
        public static String food4=new String("Banana");
    }
    public static class Morning extends mealList{
        public static String food1=new String("Guava");
        public static String food2=new String("Lemon");
    }
    public static class Lunch extends mealList{
        public static String food1=new String("Vegetable");
        public static String food2=new String("Rice");
        public static String food3=new String("Meat");
        public static String food4=new String("Fish");
    }
    public static class Afternoon extends mealList{
        public static String food1=new String("Green Tea");
        public static String food2=new String("Biscuit");
    }
    public static class Dinner extends mealList{
        public static String food1=new String("Bread");
        public static String food2=new String("Vegetable");
        public static String food3=new String("Milk");
    }

    }

    /**public static class bread {
        public static String foodName=new String("Bread");
        foods a =new foods();
        mealList.foods
    }
    public static class vegetable {
        public static String foodName=new String("Vegetable");
        mealList.foods veg=new mealList.foods();
        veg.
    }
    public static class egg {
        public static String foodName=new String("Egg");
    }
    public static class banana {
        public static String foodName=new String("Banana");
    }
    public static class guava {
        public static String foodName=new String("Guava");
    }
    public static class lemon {
        public static String foodName=new String("Lemon");
    }
    public static class rice {
        public static String foodName=new String("Rice");
    }
    public static class meat {
        public static String foodName=new String("Meat");
    }
    public static class fish {
        public static String foodName=new String("Fish");
    }
    public static class greentea {
        public static String foodName=new String("Green Tea");
    }
    public static class biscuit {
        public static String foodName=new String("Biscuit");
    }
    public static class milk {
        public static String foodName=new String("Milk");
    }


    public static class BreakfastList {
        public static String mealName=new String("Breakfast");
//        mealList.bread
    }
    public static class LunchList {
        public static String mealName=new String("Lunch");
    }
    public static class AfternoonList {
        public static String mealName=new String("Afternoon");
    }
    public static class DinnerList {
        public static String mealName=new String("Dinner");
    }*/
//}

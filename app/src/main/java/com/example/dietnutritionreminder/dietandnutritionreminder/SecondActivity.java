package com.example.dietnutritionreminder.dietandnutritionreminder;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
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
        gotoLunchNutritionList('l');
    }

    public void onClicktextMealAfternoon(View v) {
        gotoLunchNutritionList('a');
    }

    public void onClicktextMealDinner(View v) {
        gotoLunchNutritionList('d');
    }

    public void onClicktextMealBreakfast(View v) {
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
    }

    void showNotification(String title, String message) {
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("0",
                    "YOUR_CHANNEL_NAME",
                    NotificationManager.IMPORTANCE_HIGH);
            channel.setDescription("YOUR_NOTIFICATION_CHANNEL_DISCRIPTION");
            mNotificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), "0")
                .setSmallIcon(R.mipmap.ic_launcher) // notification icon
                .setContentTitle(title) // title for notification
                .setContentText(message)// message for notification
                .setAutoCancel(true); // clear notification after click
        Intent intent = new Intent(getApplicationContext(), notificationActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pi);
        mNotificationManager.notify(0, mBuilder.build());
    }

    public void buttonForwardOnClick(View v) {
//        gotoLunchNutritionList('l');
        showNotification("Title","Messages are here!");
    }

    /**private void createNotificationChannel() {
        ;
    }

    private void addNotification() {
        createNotificationChannel();
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder()
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentTitle("Notifications Example")
                        .setContentText("This is a test notification");

        Intent notificationIntent = new Intent(this, notificationActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }*/



    public void onBackPressed()
    {
        finish();
        System.exit(0);
    }

}

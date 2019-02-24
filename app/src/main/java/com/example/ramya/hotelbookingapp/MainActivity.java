package com.example.ramya.hotelbookingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotel);
        final Button book = findViewById(R.id.book_button);
        final Button moreInfo = findViewById(R.id.more_info);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookingIntent = new Intent(MainActivity.this, BookingActivity.class);
                bookingIntent.putExtra("Hotel_Name", "Hotel Metro");
                startActivity(bookingIntent);
                finish();
            }
        });

        moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moreInfo = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(moreInfo);
            }
        });

        Log.d(TAG, "On Create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ON Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ON Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ON Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ON Destroy");
    }

}

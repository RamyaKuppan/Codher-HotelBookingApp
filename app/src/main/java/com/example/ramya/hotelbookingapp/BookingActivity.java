package com.example.ramya.hotelbookingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        String hotel_name = getIntent().getStringExtra("Hotel_Name");
        TextView textView = findViewById(R.id.hotel_name);
        textView.setText(hotel_name + " Booked successfully");
    }
}

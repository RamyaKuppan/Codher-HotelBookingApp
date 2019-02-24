package com.example.ramya.hotelbookingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        RecyclerView recyclerView = findViewById(R.id.infoList);
        List<String> amenities = new ArrayList();
        amenities.add("Wifi");
        amenities.add("Spa");
        amenities.add("Bla");
        amenities.add("blu");
        amenities.add("Foo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        amenities.add("Boo");
        ItemAdapter adapter = new ItemAdapter(amenities);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager l = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(l);
    }
}

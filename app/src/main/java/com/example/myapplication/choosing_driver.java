package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class choosing_driver extends AppCompatActivity {
    Button stuff;
    Button food;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing_driver);

        stuff = findViewById(R.id.button2);
        food = findViewById(R.id.button4);

        stuff.setOnClickListener(v -> {
            Intent intent = new Intent( choosing_driver.this, stuff_drivers.class);
            startActivities(new Intent[]{intent});
        });
        food.setOnClickListener(v -> {
            Intent intent = new Intent( choosing_driver.this, food_drivers.class);
            startActivities(new Intent[]{intent});

    });
    }

    private void startActivities(Intent intent) {
    }

}

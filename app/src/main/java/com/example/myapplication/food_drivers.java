package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class food_drivers extends AppCompatActivity {
    Button adam;
    Button ahmed;
    Button omar;
    Button mohammed;
    Button ibrahim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_drivers);

        adam=findViewById(R.id.button9);
        ahmed=findViewById(R.id.button5);
        omar=findViewById(R.id.button6);
        mohammed=findViewById(R.id.button7);
        ibrahim=findViewById(R.id.button8);

        adam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( food_drivers.this, adam.class);
                startActivities(new Intent[]{intent});
            }
        });

        ahmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( food_drivers.this, ahmed.class);
                startActivities(new Intent[]{intent});
            }
        });
        omar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( food_drivers.this, omar.class);
                startActivities(new Intent[]{intent});
            }
        });
        mohammed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( food_drivers.this, mohammed.class);
                startActivities(new Intent[]{intent});
            }
        });
        ibrahim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( food_drivers.this, ibrahim.class);
                startActivities(new Intent[]{intent});
            }
        });
    }
}
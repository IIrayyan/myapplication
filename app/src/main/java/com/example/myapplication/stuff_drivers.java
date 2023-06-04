package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class stuff_drivers extends AppCompatActivity {

    Button mohanad;
    Button mazin;
    Button dawood;
    Button haitham;
    Button sami;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff_drivers);

        mohanad=findViewById(R.id.button11);
        mazin=findViewById(R.id.button14);
        dawood=findViewById(R.id.button12);
        haitham=findViewById(R.id.button13);
        sami=findViewById(R.id.button10);

        mohanad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( stuff_drivers.this, mohanad.class);
                startActivities(new Intent[]{intent});
            }
        });
        mazin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( stuff_drivers.this, mazin.class);
                startActivities(new Intent[]{intent});
            }
        });
        dawood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( stuff_drivers.this, dawood.class);
                startActivities(new Intent[]{intent});
            }
        });
        haitham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( stuff_drivers.this, haitham.class);
                startActivities(new Intent[]{intent});
            }
        });
        sami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( stuff_drivers.this, sami.class);
                startActivities(new Intent[]{intent});
            }
        });

    }
}
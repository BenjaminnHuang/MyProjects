package com.example.psycologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DriverMode extends AppCompatActivity {

    TextView MountainView;
    TextView LosAltos;
    TextView PaloAlto;
    TextView OtherCities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_mode);

        MountainView = findViewById(R.id.MountainView);
        LosAltos = findViewById(R.id.LosAltos);
        PaloAlto = findViewById(R.id.PaloAlto);
        OtherCities = findViewById(R.id.OtherCities);

        MountainView.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                goToMountainView();
            }
        });

        LosAltos.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
               goToLosAltos();
            }
        });

        PaloAlto.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                goToPaloAlto();
            }
        });

        OtherCities.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                goToOthers();
            }
        });
    }

    private void goToMountainView() {
        startActivity(new Intent(DriverMode.this, MountainViews.class));
    }

    private void goToLosAltos() {
        startActivity(new Intent(DriverMode.this, LosAltos.class));
    }

    private void goToPaloAlto() {
        startActivity(new Intent(DriverMode.this, PaloAlto.class));
    }

    private void goToOthers() {
        startActivity(new Intent(DriverMode.this, otherCities.class));
    }
}

package com.example.davidmgarcia6.animalschool;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        Button newSafari = (Button) findViewById(R.id.SafariLevel);
        assert newSafari != null;
        newSafari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newViewSafari = new Intent(v.getContext(),SafariView.class);
                startActivity(newViewSafari);
            }
        });

        Button newOcean = (Button) findViewById(R.id.OceanLevel);
        assert newOcean != null;
        newOcean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newViewOcean = new Intent(v.getContext(),OceanView.class);
                startActivity(newViewOcean);
            }
        });

        Button newForest = (Button) findViewById(R.id.ForestLevel);
        assert newForest != null;
        newForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newViewForest = new Intent(v.getContext(),ForestView.class);
                startActivity(newViewForest);
            }
        });

        Button newArctic = (Button) findViewById(R.id.ArctictLevel);
        assert newArctic != null;
        newArctic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newViewArctic = new Intent(v.getContext(),ArcticView.class);
                startActivity(newViewArctic);
            }
        });

        Button newStats = (Button) findViewById(R.id.StatLevel);
        assert newStats !=null;
        newStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newViewStats = new Intent(v.getContext(),StatsView.class);
                startActivity(newViewStats);
            }
        });
    }
}

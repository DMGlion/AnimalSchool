package com.example.davidmgarcia6.animalschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatsView extends AppCompatActivity {

    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_view);

        pieChart = (PieChart) findViewById(R.id.pieChart1);
        assert pieChart != null;
        pieChart.setDescription("Your Child's Score");
        pieChart.setDragDecelerationFrictionCoef(0.95f);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(UserScore.getQuizScore(),0));// User's Quiz Score
        entries.add(new Entry(4,1));// Number of Levels in the App
        entries.add(new Entry(UserScore.getNumGuesses(),2));// Number of incorrect guesses

        ArrayList<String> labels = new ArrayList<String>();
        labels.add(0,"# Correct Answers");
        labels.add(1,"# of Levels");
        labels.add(2,"# Incorrect Guesses");

        PieDataSet dataSet = new PieDataSet(entries,"Entries");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData data = new PieData(labels, dataSet); // initialize PieData
        pieChart.setData(data);
        pieChart.invalidate();
        pieChart.animateY(2000);

        pieChart.setDescription("User's Application Statistics");


    }
}

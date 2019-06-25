package com.example.davidmgarcia6.animalschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class StatsView extends AppCompatActivity {

    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_view);

        pieChart = findViewById(R.id.pieChart1);
        assert pieChart != null;
        Description description = new Description();
        description.setText("Your Child's Score");
        pieChart.setDescription(description);
        pieChart.setDragDecelerationFrictionCoef(0.95f);

        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(UserScore.getQuizScore(),"# Correct Answers"));// User's Quiz Score
        entries.add(new PieEntry(4,"# of Levels"));// Number of Levels in the App
        entries.add(new PieEntry(UserScore.getNumGuesses(),"# Incorrect Guesses"));// Number of incorrect guesses

        List<String> labels = new ArrayList<String>();
        labels.add(0,"# Correct Answers");
        labels.add(1,"# of Levels");
        labels.add(2,"# Incorrect Guesses");




        PieDataSet dataSet = new PieDataSet(entries,"Entries");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData data = new PieData(dataSet); // initialize PieData
        pieChart.setData(data);
        pieChart.invalidate();
        pieChart.animateY(2000);

        description.setText("User's Application Statistics");
        pieChart.setDescription(description);


    }
}

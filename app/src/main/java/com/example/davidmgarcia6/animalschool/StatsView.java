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

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(UserScore.getQuizScore(), 0));
        entries.add(new Entry(4f, 1));
//        entries.add(new Entry(6f, 2));
//        entries.add(new Entry(12f, 3));
//        entries.add(new Entry(18f, 4));
//        entries.add(new Entry(9f, 5));


        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Quiz Score\n");
        labels.add("Number of Levels");
//        labels.add("March");
//        labels.add("April");
//        labels.add("May");
//        labels.add("June");

        PieDataSet dataset = new PieDataSet(entries, "User's Stats");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData data = new PieData(labels, dataset); // initialize Piedata
        pieChart.setData(data);
        pieChart.invalidate();

        pieChart.setDescription("Description");


    }
}

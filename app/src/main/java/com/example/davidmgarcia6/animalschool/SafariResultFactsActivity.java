package com.example.davidmgarcia6.animalschool;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SafariResultFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safari_result_facts);

        //Code for redirecting to Facts screen is:
        //http://stackoverflow.com/questions/6304035/how-to-display-an-activity-automatically-after-5-seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(SafariResultFactsActivity.this, SafariView.class);
                SafariResultFactsActivity.this.startActivity(mainIntent);
                SafariResultFactsActivity.this.finish();
            }
        }, 4000);
    }
}

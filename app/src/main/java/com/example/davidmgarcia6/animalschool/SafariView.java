package com.example.davidmgarcia6.animalschool;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SafariView extends AppCompatActivity {

    private MediaPlayer mp;
    // The following are used for the shake detection
    // Taken from http://jasonmcreynolds.com/?p=388
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safari_view);

        Button giraff =(Button) findViewById(R.id.giraffbutton);
        assert giraff != null;
        giraff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(SafariView.this, R.raw.incorrect);
                mp.start();
            }
        });

        Button elephant = (Button) findViewById(R.id.elephantbutton);
        assert elephant != null;
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(SafariView.this, R.raw.incorrect);
                mp.start();
            }
        });

        Button lion = (Button) findViewById(R.id.lionbutton);
        assert lion != null;
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(SafariView.this, R.raw.winnero);
                mp.start();
                // Label Update will happen here

                //Code for redirecting to Facts screen is:
                //http://stackoverflow.com/questions/6304035/how-to-display-an-activity-automatically-after-5-seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        final Intent mainIntent = new Intent(SafariView.this, SafariResultFactsActivity.class);
                        SafariView.this.startActivity(mainIntent);
                        SafariView.this.finish();
                    }
                }, 1000);
            }
        });

        Button hyena = (Button) findViewById(R.id.hyenabutton);
        assert hyena != null;
        hyena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(SafariView.this, R.raw.incorrect);
                mp.start();
            }
        });
        // This needs to be inserted into the correct answer onClickListener
//        if (UserScore.getQuizScore() < 1){
//            UserScore.setQuizScore(1);
//            Toast.makeText(getApplicationContext(), "UserScore is now: " + UserScore.getQuizScore(), Toast.LENGTH_SHORT).show();
//        }

        // ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {
				/*
				 * The following method, "handleShakeEvent(count):" is a stub //
				 * method you would use to setup whatever you want done once the
				 * device has been shook.
				 */
                mp = MediaPlayer.create(SafariView.this, R.raw.lion);
                mp.start();

                handleShakeEvent(count);
            }

            private void handleShakeEvent(int count) {

                Toast.makeText(getApplicationContext(),"Shake Event Triggered " + count + " times",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        // Add the following line to register the Session Manager Listener onResume
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,	SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        // Add the following line to unregister the Sensor Manager onPause
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }

}

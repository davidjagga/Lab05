package com.jaggadavid.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int onCreateCount=0;
    int onResumeCount=0;
    int onPauseCount=0;
    int onStartCount=0;
    int onStopCount=0;
    int onDestroyCount=0;
    TextView create1, create2, resume1, resume2, pause1, pause2, start1, start2, stop1, stop2, destroy1, destroy2;
    SharedPreferences sh;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreateCount+=1;
        create1=findViewById(R.id.createView);
        create2=findViewById(R.id.createView1);
        resume1=findViewById(R.id.resumeView);
        resume2=findViewById(R.id.resumeView1);
        pause1=findViewById(R.id.pauseView);
        pause2=findViewById(R.id.pauseView1);
        start1=findViewById(R.id.startView);
        start2=findViewById(R.id.startView1);
        stop1=findViewById(R.id.stopView);
        stop2=findViewById(R.id.stopView1);
        destroy1=findViewById(R.id.destroyView);
        destroy2=findViewById(R.id.destroyView1);


    }

    @Override
    protected void onResume() {
        super.onResume();
        onResumeCount+=1;
    }

    @Override
    protected void onPause() {
        super.onPause();
        onPauseCount+=1;
    }

    @Override
    protected void onStart() {
        super.onStart();
        onStartCount+=1;
    }

    @Override
    protected void onStop() {
        super.onStop();
        onStopCount+=1;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onDestroyCount+=1;
    }

}
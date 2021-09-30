package com.jaggadavid.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int onCreateCount=0;
    int onResumeCount=0;
    int onPauseCount=0;
    int onStartCount=0;
    int onStopCount=0;
    int onDestroyCount=0;
    /**
      **/



    TextView onCreateView;
    TextView onCreateStatic;
    TextView onResumeView;
    TextView onResumeStatic;
    TextView onPauseView;
    TextView onPauseStatic;
    TextView onStartView;
    TextView onStartStatic;
    TextView onStopView;
    TextView onStopStatic;
    TextView onDestroyView;
    TextView onDestroyStatic;




    SharedPreferences sh;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreateView=findViewById(R.id.createView);
        onCreateStatic=findViewById(R.id.createView1);
        onResumeView=findViewById(R.id.resumeView);
        onResumeStatic=findViewById(R.id.resumeView1);
        onPauseView=findViewById(R.id.pauseView);
        onPauseStatic=findViewById(R.id.pauseView1);
        onStartView=findViewById(R.id.startView);
        onStartStatic=findViewById(R.id.startView1);
        onStopView=findViewById(R.id.stopView);
        onStopStatic=findViewById(R.id.stopView1);
        onDestroyView=findViewById(R.id.destroyView);
        onDestroyStatic=findViewById(R.id.destroyView1);

        onCreateCount = 0;
        onResumeCount = 0;
        onPauseCount = 0;
        onStartCount = 0;
        onStopCount = 0;
        onDestroyCount = 0;



        sh = getSharedPreferences("com.jaggadavid.lab05.shared", MODE_PRIVATE);
        edit = sh.edit();

        setBasePreferences();

        onCreateCount+=1;
        edit.putInt("onCreate", sh.getInt("onCreate", onCreateCount)+1).apply();
        onCreateView.setText("onCreate: "+onCreateCount+"");
        onCreateStatic.setText("onCreate: "+sh.getInt("onCreate", onCreateCount)+"");

    }


    public void setBasePreferences(){

        onCreateStatic.setText("onCreate: "+sh.getInt("onCreate", onCreateCount)+"");
        onResumeStatic.setText("onResume: "+sh.getInt("onResume", onResumeCount)+"");
        onPauseStatic.setText("onPause: "+sh.getInt("onPause", onPauseCount)+"");
        onStartStatic.setText("onStart: "+sh.getInt("onStart", onStartCount)+"");
        onStopStatic.setText("onStop: "+sh.getInt("onStop", onStopCount)+"");
        onDestroyStatic.setText("onDestroy: "+sh.getInt("onDestroy", onDestroyCount)+"");

        onCreateView.setText("onCreate: "+onCreateCount+"");
        onResumeView.setText("onResume: "+onResumeCount+"");
        onPauseView.setText("onPause: "+onPauseCount+"");
        onStartView.setText("onStart: "+onStartCount+"");
        onStopView.setText("onStop: "+onStopCount+"");
        onDestroyView.setText("onDestroy: "+onDestroyCount+"");
    }



    @Override
    protected void onResume(){
        super.onResume();
        onResumeCount+=1;
        edit.putInt("onResume", sh.getInt("onPause", onPauseCount)+1).apply();
        onResumeView.setText("onResume: "+onResumeCount+"");
        onResumeStatic.setText("onResume: "+sh.getInt("onResume", onResumeCount)+"");

    }
    @Override
    protected void onPause(){

        onPauseCount+=1;
        edit.putInt("onPause", sh.getInt("onPause", onPauseCount)+1).apply();
        onPauseView.setText("onPause: "+onPauseCount+"");
        onPauseStatic.setText("onPause: "+sh.getInt("onPause", onPauseCount)+"");

        super.onPause();
    }
    @Override
    protected void onStart(){
        super.onStart();
        onStartCount+=1;
        edit.putInt("onStart", sh.getInt("onStart", onStartCount)+1).apply();
        onStartView.setText("onStart: "+onStartCount+"");
        onStartStatic.setText("onStart: "+sh.getInt("onStart", onStartCount)+"");

    }
    @Override
    protected void onStop(){

        onStopCount+=1;
        edit.putInt("onStop", sh.getInt("onStop", onStopCount)+1).apply();
        onStopView.setText("onStop: "+onStopCount+"");
        onStopStatic.setText("onStop: "+sh.getInt("onStop", onStopCount)+"");

        super.onStop();
    }
    @Override
    protected void onDestroy(){

        onDestroyCount+=1;
        edit.putInt("onDestroy", sh.getInt("onDestroy", onDestroyCount)+1).apply();
        onDestroyView.setText("onDestroy: "+onDestroyCount+"");
        onDestroyStatic.setText("onDestroy: "+sh.getInt("onDestroy", onDestroyCount)+"");
        super.onDestroy();
        Log.i("destroyed", "destroyed");

    }

    public void resetData(View view) {

        edit.putInt("onCreate", 0).apply();
        edit.putInt("onResume", 0).apply();
        edit.putInt("onPause", 0).apply();
        edit.putInt("onStart", 0).apply();
        edit.putInt("onStop", 0).apply();
        edit.putInt("onDestroy", 0).apply();

        onCreateCount = 0;
        onResumeCount = 0;
        onPauseCount = 0;
        onStartCount = 0;
        onStopCount = 0;
        onDestroyCount = 0;


        onCreateStatic.setText("onCreate: "+sh.getInt("onCreate", onCreateCount)+"");
        onResumeStatic.setText("onResume: "+sh.getInt("onResume", onResumeCount)+"");
        onPauseStatic.setText("onPause: "+sh.getInt("onPause", onPauseCount)+"");
        onStartStatic.setText("onStart: "+sh.getInt("onStart", onStartCount)+"");
        onStopStatic.setText("onStop: "+sh.getInt("onStop", onStopCount)+"");
        onDestroyStatic.setText("onDestroy: "+sh.getInt("onDestroy", onDestroyCount)+"");

        onCreateView.setText("onCreate: "+onCreateCount+"");
        onResumeView.setText("onResume: "+onResumeCount+"");
        onPauseView.setText("onPause: "+onPauseCount+"");
        onStartView.setText("onStart: "+onStartCount+"");
        onStopView.setText("onStop: "+onStopCount+"");
        onDestroyView.setText("onDestroy: "+onDestroyCount+"");
    }
}
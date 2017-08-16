package com.example.abhinav.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Abhinav on 8/11/2017.
 */

public class ActivityD extends Activity {


    TextView textView;
    static int counter=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.v("ActivityD","on create");
        counter++;
        setContentView(R.layout.activity_d);
        textView=(TextView)findViewById(R.id.textView4);
        textView.setText("I am ActivityD "+Integer.toString(counter));

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("ActivityD","on start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ActivityD","on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ActivityD","on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ActivityD","on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ActivityD","on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ActivityD","on destroy");
    }
}

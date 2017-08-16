package com.example.abhinav.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abhinav on 8/9/2017.
 */

public class ActivityB extends Activity implements View.OnClickListener {

    Button button1;
    Button button2;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("ActivityB","on new intent");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Activity B","on create");
        setContentView(R.layout.activity_b);
        button1=(Button)findViewById(R.id.button4);
        button2=(Button)findViewById(R.id.button5);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Activity B","on start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Activity B","on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Activity B","on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Activity B","on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Activity B","on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Activity B","on destroy");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button4)
        {
            Intent intent=new Intent(this,ActivityC.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else if(v.getId()==R.id.button5)
        {
            Intent intent=new Intent(this,ActivityD.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}

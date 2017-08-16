package com.example.abhinav.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Abhinav on 8/11/2017.
 */

public class ActivityC extends Activity implements View.OnClickListener {

    Button button1;
    Button button2;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("ActivityC","on new intent");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("ActivityC","on create");
        setContentView(R.layout.activity_c);
        button1=(Button)findViewById(R.id.button6);
        button2=(Button)findViewById(R.id.button7);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("ActivityC","on start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("ActivityC","on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("ActivityC","on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("ActivityC","on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("ActivityC","on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("ActivityC","on destroy");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button6)
        {
            Intent intent=new Intent(this,ActivityD.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.button7){

            Intent intent=new Intent(this,ActivityB.class);
            //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }
}

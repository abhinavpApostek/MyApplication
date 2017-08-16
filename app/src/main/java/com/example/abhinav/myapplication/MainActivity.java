package com.example.abhinav.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("mainactivity","on new intent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Activity a","on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Activity a","on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Activity a","on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Activity a","on restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Activity a","on destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Activity a","on pause");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.v("Activity a","on create");
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button)
        {
            Intent intent=new Intent(this,ActivityB.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else if(v.getId()==R.id.button2)
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Exit")
                    .setMessage("Are you sure you want to exit")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        }
        else if(v.getId()==R.id.button3)
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}

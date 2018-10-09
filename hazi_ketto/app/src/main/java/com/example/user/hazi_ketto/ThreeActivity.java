package com.example.user.hazi_ketto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity {
    final String tag = "Status ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        Log.d(tag, "MainActiviti three on Create");
        Toast.makeText(this, "MainActiviti Three on Create", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " MA3 On start");
        Toast.makeText(this, " MA3 On start", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "MA3 Resume");
        Toast.makeText(this, "MA3 Resume", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "MA3 Paused");
        Toast.makeText(this, "MA3 Paused", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "MA3 Stoped");
        Toast.makeText(this, "MA3 Stoped", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "MA3 Destroy");
        Toast.makeText(this, "MA3 Destroy", Toast.LENGTH_SHORT).show();

    }
}

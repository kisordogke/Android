package com.example.user.hazi_ketto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    final String tag = "Status ";
    Button btnstart;
    Button btnfinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnstart = (Button) findViewById(R.id.btnStart);
        btnfinish = (Button) findViewById(R.id.btnFinish);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThreeActivity.class);
                startActivity(intent);
            }
        });
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                finish();
            }
        });


        Log.d(tag, "MainActiviti two on Create");
        Toast.makeText(this, "MainActiviti Two on Create", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " MA2 On start");
        Toast.makeText(this, " MA2 On start", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "MA2 Resume");
        Toast.makeText(this, "MA2 Resume", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "MA2 Paused");
        Toast.makeText(this, "MA2 Paused", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "MA2 Stoped");
        Toast.makeText(this, "MA2 Stoped", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "MA2 Destroy");
        Toast.makeText(this, "MA2 Destroy", Toast.LENGTH_SHORT).show();

    }


}

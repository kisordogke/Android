package com.example.user.hazi_ketto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String tag = "Status ";
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                startActivity(intent);
            }
        });

        Log.d(tag, "MainActiviti one on Create");
        Toast.makeText(this, "MainActiviti one on Create", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, " MA1 On start");
        Toast.makeText(this, " MA1 On start", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "MA1 Resume");
        Toast.makeText(this, "MA1 Resume", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "MA1 Paused");
        Toast.makeText(this, "MA1 Paused", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "MA1 Stoped");
        Toast.makeText(this, "MA1 Stoped", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "MA1 Destroy");
        Toast.makeText(this, "MA1 Destroy", Toast.LENGTH_SHORT).show();
    }

}
package com.example.user.hazinegy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detali);

       //Integer savedExtra4= Integer.valueOf(getIntent().getStringExtra("kep"));
       //ImageView myText4=(ImageView)findViewById(R.id.kepId);
        String savedExtra = getIntent().getStringExtra("vas_ertek");
        TextView myText = (TextView) findViewById(R.id.dVasarlas);
        String savedExtra2 = getIntent().getStringExtra("el_ertek");
        TextView myText2 = (TextView) findViewById(R.id.dElad);
        String savedExtra3 = getIntent().getStringExtra("nev");
        TextView myText3 = (TextView) findViewById(R.id.dNameId);
        myText.setText(savedExtra);
        myText2.setText(savedExtra2);
        myText3.setText(savedExtra3);
        //myText4.setImageLevel(savedExtra4);
    }
}

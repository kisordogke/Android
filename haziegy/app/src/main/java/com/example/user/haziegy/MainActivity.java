package com.example.user.haziegy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1 = (EditText) findViewById(R.id.editText);
        final EditText szam2 = (EditText) findViewById(R.id.editText2);
        final Button plusz = (Button) findViewById(R.id.button);
        final Button minusz = (Button) findViewById(R.id.button2);
        final Button szorzas = (Button) findViewById(R.id.button3);
        final Button osztas = (Button) findViewById(R.id.button4);
        final TextView tv = (TextView) findViewById(R.id.textView2);

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered = Double.parseDouble(szam1.getText().toString()) + Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(ered));

                } catch (NumberFormatException e) {

                }
            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered = Double.parseDouble(szam1.getText().toString()) - Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(ered));
                } catch (NumberFormatException e) {

                }
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered = Double.parseDouble(szam1.getText().toString()) * Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(ered));
                } catch (NumberFormatException e) {

                }
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double ered = Double.parseDouble(szam1.getText().toString()) / Double.parseDouble(szam2.getText().toString());
                    tv.setText(Double.toString(ered));
                } catch (NumberFormatException e) {

                }
            }
        });
    }
}

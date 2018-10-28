package com.example.user.hazinegy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] infoArray = {"Euro", "USA dolar", "Angol lira", "Ausztriai dolar", "Kanadai dolar", "Svajci frank", "Dan korona", "Magyar forint"};
    Integer[] imageArray = {
            R.drawable.eur,
            R.drawable.usa,
            R.drawable.gbp,
            R.drawable.aud,
            R.drawable.can,
            R.drawable.chf,
            R.drawable.dnn,
            R.drawable.hun
    };
    ListView listView;
    String[] vasarlasArray = {"4.55", "3.22", "6.00", "3.50", "5.80", "6.70", "2.69", "0.15"};
    String[] eladasArray = {"4.70", "3.40", "6.30", "3.70", "5.95", "6.90", "2.99", "0.18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter lista = new CustomListAdapter(this, nameArray, infoArray, imageArray, vasarlasArray, eladasArray);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(lista);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), Detali.class);
                Integer kep = imageArray[position];
                intent.putExtra("kep", kep);
                String message = vasarlasArray[position];
                intent.putExtra("vas_ertek", message);
                String message2 = eladasArray[position];
                intent.putExtra("el_ertek", message2);
                String message3 = nameArray[position];
                intent.putExtra("nev", message3);
                startActivity(intent);

            }
        });
    }
}

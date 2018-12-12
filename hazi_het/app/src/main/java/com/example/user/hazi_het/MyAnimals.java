package com.example.user.hazi_het;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MyAnimals extends AppCompatActivity {
    private RecyclerView rvAllat;
    private AnimalsAdapter animals_adapter;
    private List<Animals> allat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_animals_activity);

        rvAllat = (RecyclerView) findViewById(R.id.recycler_view);

        rvAllat.setHasFixedSize(true);

        final GridLayoutManager layoutManager = new GridLayoutManager(MyAnimals.this, 1);

        rvAllat.setLayoutManager(layoutManager);

        allat = Animals.getAnimals();

        animals_adapter = new AnimalsAdapter(MyAnimals.this, allat);

        rvAllat.setAdapter(animals_adapter);
    }
}
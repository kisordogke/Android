package com.example.user.hazi_het;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class DetalisActivity extends AppCompatActivity {

    public static final String EXTRA_ANIMAL = "EXTRA_ANIMAL";
    private Animals animals;
    private ImageView ivAnimal;
    private TextView tvName;
    private TextView tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);

        ivAnimal = (ImageView)findViewById(R.id.ivAnimal);
        tvName = (TextView)findViewById(R.id.tvName);
        tvDesc =(TextView)findViewById(R.id.tvDescription);

        animals = (Animals) getIntent().getExtras().getSerializable(EXTRA_ANIMAL);

        Glide.with(DetalisActivity.this).load(animals.getaDrawable()).apply(RequestOptions.centerCropTransform()).into(ivAnimal);
        tvName.setText(animals.getNev());
        tvDesc.setText(animals.getDesc());

    }
}

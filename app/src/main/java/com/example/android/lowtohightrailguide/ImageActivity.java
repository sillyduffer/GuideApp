package com.example.android.lowtohightrailguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        int id = getIntent().getIntExtra("extraImage", 0);

        ImageView imageView = (ImageView) findViewById(R.id.act_image);

        imageView.setImageResource(id);

        String description = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        TextView descriptionView =  (TextView) findViewById(R.id.details_description);

        descriptionView.setText(description);

        String title = getIntent().getStringExtra("extraTitle");

        TextView titleView = (TextView) findViewById(R.id.details_title);

        titleView.setText(title);

    }
}

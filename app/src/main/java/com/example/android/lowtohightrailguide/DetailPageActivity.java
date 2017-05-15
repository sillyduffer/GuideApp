package com.example.android.lowtohightrailguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        int id = getIntent().getIntExtra("extraImage", 0);

        ImageView imageView = (ImageView) findViewById(R.id.act_image);

        if (id != 0) {
            imageView.setImageResource(id);
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        String description = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        TextView descriptionView = (TextView) findViewById(R.id.details_description);

        descriptionView.setText(description);

        String title = getIntent().getStringExtra("extraTitle");

        TextView titleView = (TextView) findViewById(R.id.details_title);

        titleView.setText(title);

    }
}

package com.example.android.lowtohightrailguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        int id = getIntent().getIntExtra(Intent.EXTRA_TEXT, 0);

        ImageView imageView = (ImageView) findViewById(R.id.act_image);

        imageView.setImageResource(id);

    }
}

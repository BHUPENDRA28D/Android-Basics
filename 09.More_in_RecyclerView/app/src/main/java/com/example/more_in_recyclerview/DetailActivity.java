package com.example.more_in_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView image;
    TextView header,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        image = findViewById(R.id.dImage);
        desc =findViewById(R.id.desc_desc);
        header =findViewById(R.id.desc_header);

        //featching data in this 3
        image.setImageResource(getIntent().getIntExtra("image",0));
        header.setText(getIntent().getStringExtra("name"));
        desc.setText(getIntent().getStringExtra("desc"));

    }
}
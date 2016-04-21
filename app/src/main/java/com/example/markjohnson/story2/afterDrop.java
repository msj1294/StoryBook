package com.example.markjohnson.story2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class afterDrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_drop);

        ImageView houseChoice;
        houseChoice = (ImageView) findViewById(R.id.houseChoice);

        int image = getIntent().getIntExtra("houseChoice",0);
        houseChoice.setTag(image);
        houseChoice.setImageResource(image);
    }
}

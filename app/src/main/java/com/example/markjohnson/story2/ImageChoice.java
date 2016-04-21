package com.example.markjohnson.story2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//import
//static Stringimage_string;
public class ImageChoice extends AppCompatActivity {
    public  String image_string;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image_string= "wolf_1";
        setContentView(R.layout.imagechoice);
        ImageButton button_1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton button_2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton button_3  = (ImageButton)findViewById(R.id.imageButton3);
        final Button next_button = (Button)findViewById(R.id.next_button);

        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ImageChoice2.class);
                i.putExtra("wolf",  image_string);
                startActivity(i);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_string="wolf_1";
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_string= "wolf_2";
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_string= "wolf_3";
                next_button.setVisibility(View.VISIBLE);
            }
        });
    }



}
package com.example.markjohnson.story2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//import
<<<<<<< HEAD
//static String wolf_string;
public class ImageChoice extends AppCompatActivity {
    public  String wolf_string;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wolf_string= "wolf_1";
        setContentView(R.layout.imagechoice);
        final ImageButton button_1 = (ImageButton)findViewById(R.id.imageButton);
        final ImageButton button_2 = (ImageButton)findViewById(R.id.imageButton2);
        final ImageButton button_3  = (ImageButton)findViewById(R.id.imageButton3);
=======
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
>>>>>>> kevin
        final Button next_button = (Button)findViewById(R.id.next_button);

        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                Intent i = new Intent(ImageChoice.this, StoryViewActivity.class);
                i.putExtra("wolf",wolf_string);
=======
                Intent i = new Intent(getApplicationContext(),ImageChoice2.class);
                i.putExtra("wolf",  image_string);
>>>>>>> kevin
                startActivity(i);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                wolf_string="wolf_1";
=======
                image_string="wolf_1";
>>>>>>> kevin
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                wolf_string = "wolf_2";
=======
                image_string= "wolf_2";
>>>>>>> kevin
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                wolf_string = "wolf_3";
=======
                image_string= "wolf_3";
>>>>>>> kevin
                next_button.setVisibility(View.VISIBLE);
            }
        });
    }



}

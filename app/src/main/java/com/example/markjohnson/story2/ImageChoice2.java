package com.example.markjohnson.story2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Kevin on 4/18/16.
 */
public class ImageChoice2 extends AppCompatActivity{
    public  String image_2_string;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image_2_string= "girl_1";
        setContentView(R.layout.imagechoice);
        ImageButton button_1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton button_2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton button_3  = (ImageButton)findViewById(R.id.imageButton3);
        TextView txt=(TextView)findViewById(R.id.textView);
        txt.setText("Select the girl you want to see in the story");
        button_1.setImageResource(getResources().getIdentifier("girl_1","drawable","com.example.markjohnson.story2"));
        button_2.setImageResource(getResources().getIdentifier("girl_2","drawable","com.example.markjohnson.story2"));
        button_3.setImageResource(getResources().getIdentifier("girl_3","drawable","com.example.markjohnson.story2"));
        final Button next_button = (Button)findViewById(R.id.next_button);

        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),StoryViewActivity.class);
                Bundle extras = getIntent().getExtras();
                String image_1_string=new String(extras.getString("wolf"));
                i.putExtra("wolf",image_1_string);
                i.putExtra("girl",image_2_string);
                startActivity(i);
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_2_string="girl_1";
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_2_string = "girl_2";
                next_button.setVisibility(View.VISIBLE);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image_2_string = "girl_3";
                next_button.setVisibility(View.VISIBLE);
            }
        });
    }
}


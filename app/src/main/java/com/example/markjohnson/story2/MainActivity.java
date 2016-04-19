package com.example.markjohnson.story2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;



public class MainActivity extends AppCompatActivity{

    TextView mainTextView;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = (TextView) findViewById(R.id.main_textview);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
    }

    public void buttonOneAction(View view){
        startActivity(new Intent(MainActivity.this, StoryButtonActivity.class));
    }

    public void buttonTwoAction(View view){

    }


}

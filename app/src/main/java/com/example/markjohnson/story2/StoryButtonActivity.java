package com.example.markjohnson.story2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;



public class StoryButtonActivity extends AppCompatActivity {

    TextView mainTextView;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_list);
        mainTextView = (TextView) findViewById(R.id.story_list_textview);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ImageChoice.class);
                startActivity(i);
            }
        });
    }

    //public void llrhButton(View view) {
    //    startActivity(new Intent(StoryButtonActivity.this, ImageChoice.class));
    //}
}

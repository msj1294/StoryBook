package com.example.markjohnson.story2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by markjohnson on 4/17/16.
 */
public class StoryViewActivity extends AppCompatActivity {
    TextView mainTextView;
    Button button1;
    LRRH llrhStory = new LRRH();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lrrh_basic);
        mainTextView = (TextView) findViewById(R.id.llrh_textview);
        button1 = (Button) findViewById(R.id.button1);
        Bundle extras = getIntent().getExtras();
        ImageView image_1 = (ImageView)findViewById(R.id.lrrh_image1);
        ImageView image_2 = (ImageView)findViewById(R.id.llrh_image2);
        image_1.setImageResource(getResources().getIdentifier(extras.getString("wolf"),"drawable","com.example.markjohnson.story2"));
        image_2.setImageResource(getResources().getIdentifier(extras.getString("girl"),"drawable","com.example.markjohnson.story2"));

    }

    public void nextButton(View view) {
        String storyLine = llrhStory.nextLine();
        if(storyLine!=null){
            mainTextView.setText(storyLine);
        }
        else{
            startActivity(new Intent(StoryViewActivity.this, MainActivity.class));
        }
    }
}

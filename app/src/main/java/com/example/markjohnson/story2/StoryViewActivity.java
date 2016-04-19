package com.example.markjohnson.story2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }

    public void nextButton(View view) {
        mainTextView.setText(llrhStory.nextLine());
    }
}

package com.example.markjohnson.story2;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DragAndDrop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_and_drop);

        ImageView wolf, house, hut, cabin;
        final TextView choice;

        wolf=(ImageView)findViewById(R.id.wolf);
        house=(ImageView)findViewById(R.id.house);
        hut=(ImageView)findViewById(R.id.hut);
        cabin=(ImageView)findViewById(R.id.cabin);
        house.setTag(R.drawable.house);
        cabin.setTag(R.drawable.log_cabin);
        hut.setTag(R.drawable.hut);


        final class ChoiceTouchListener implements View.OnTouchListener {
            public boolean onTouch(View view, MotionEvent motionEvent){
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    //setup drag
                    ClipData data = ClipData.newPlainText("", "");
                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

                    view.startDrag(data, shadowBuilder, view, 0);
                    return true;
                }
                else
                    return false;
            }
        }

        class ChoiceDragListener implements View.OnDragListener {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                //handle drag events
                switch (event.getAction()) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        //no action necessary
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        //no action necessary
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        //no action necessary
                        break;
                    case DragEvent.ACTION_DROP:
                        //handle the dragged view being dropped over a drop view
                        View view = (View) event.getLocalState();
                        //view.setVisibility(View.INVISIBLE);


                        //Image that is being dropped on
                        ImageView dropTarget = (ImageView) v;

                        ImageView dropped = (ImageView) view;
                        //story.setHouseChoice(dropTarget.getDrawable());
                        //dropped.setImageDrawable(story.getHouseChoice());

                        Intent i = new Intent(DragAndDrop.this, afterDrop.class);
                        int rid = (int) dropTarget.getTag();
                        i.putExtra("houseChoice", rid);
                        startActivity(i);
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:
                        //no action necessary
                        break;
                    default:
                        break;
                }
                return true;
            }
        }

        wolf.setOnTouchListener(new ChoiceTouchListener());
        house.setOnDragListener(new ChoiceDragListener());
        hut.setOnDragListener(new ChoiceDragListener());
        cabin.setOnDragListener(new ChoiceDragListener());
    }
}

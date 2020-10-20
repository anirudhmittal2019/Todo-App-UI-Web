package com.example.mc2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.util.TypedValue;
import android.widget.*;
import android.os.Bundle;
import android.view.*;
import android.widget.NumberPicker.OnValueChangeListener;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView text;
    View fullView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.text_view_id);
        fullView = (View) findViewById(R.id.screen);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        text.setText("Button clicked");
                        return;
                    }
                }
        );

        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        text.setText("Long button click");
                        return true;
                    }
                }
        );

        fullView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();
                Toast.makeText(MainActivity.this, "Screen touched", Toast.LENGTH_LONG).show();
                return true;
            }
        });


    }


}

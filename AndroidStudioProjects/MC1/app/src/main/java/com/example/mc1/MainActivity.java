package com.example.mc1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.util.TypedValue;
import android.widget.*;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.NumberPicker.OnValueChangeListener;

public class MainActivity extends AppCompatActivity {

    TextView text;

    String[] colors ={"Black","Red","Green","Blue","Yellow"};
    String[] sizes = {"8","12","16","32","48"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text_view_id);

        NumberPicker color = (NumberPicker)findViewById(R.id.color);
        color.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
        color.setMinValue(0);
        color.setMaxValue(colors.length-1);
        color.setDisplayedValues(colors);
        color.setOnValueChangedListener(new OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                int c = picker.getValue();
                switch (c){
                    case 0:
                        text.setTextColor(Color.BLACK);
                        break;
                    case 1:
                        text.setTextColor(Color.RED);
                        break;
                    case 2:
                        text.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        text.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        text.setTextColor(Color.YELLOW);
                        break;
                }

                //displayMessage();
            }
        });


        NumberPicker size = (NumberPicker)findViewById(R.id.size);
        size.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
        size.setMinValue(0);
        size.setMaxValue(sizes.length-1);
        size.setDisplayedValues(sizes);
        size.setOnValueChangedListener(new OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                int c = picker.getValue();;
                text.setTextSize(TypedValue.COMPLEX_UNIT_DIP,Integer.parseInt(sizes[c]));
                //displayMessage();
            }
        });

    }

//    private void displayMessage() {
//
//        text.setText("111 Pranati");
//    }
}

package com.example.mycalculator;

import android.view.View;
import android.widget.TextView;

public class ClearOnClick implements View.OnClickListener {
    TextView textView;
    TextView textView1;

    public ClearOnClick(TextView textView,TextView textView1) {
        this.textView = textView;
        this.textView1 = textView1;
    }

    @Override
    public void onClick(View v) {
        textView1.setText("");
        textView.setText("");
    }
}

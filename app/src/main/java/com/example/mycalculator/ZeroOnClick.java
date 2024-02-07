package com.example.mycalculator;

import android.view.View;
import android.widget.TextView;

public class ZeroOnClick implements View.OnClickListener {
    TextView textView;

    public ZeroOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("0");
        textView.setText(newString);
    }
}

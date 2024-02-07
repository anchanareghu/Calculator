package com.example.mycalculator;

import android.view.View;
import android.widget.TextView;

public class PiOnClick implements View.OnClickListener {
    TextView textView;

    public PiOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("π");
        textView.setText(newString);
    }
}

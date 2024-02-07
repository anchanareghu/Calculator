package com.example.mycalculator;

import android.view.View;
import android.widget.TextView;

public class FactorialOnClick implements View.OnClickListener{
    TextView textView;
    public FactorialOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("!");
        textView.setText(newString);
    }
}

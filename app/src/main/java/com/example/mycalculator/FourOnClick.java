package com.example.mycalculator;

import android.view.View;
import android.widget.TextView;

public class FourOnClick implements View.OnClickListener {

    TextView textView;

    public FourOnClick(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onClick(View v) {
        String existingString = textView.getText().toString();
        String newString = existingString.concat("4");
        textView.setText(newString);
    }
}

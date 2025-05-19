package com.amrutha.task1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Hello World!");
        textView.setTextSize(28);
        textView.setPadding(30, 200, 30, 30);

        setContentView(textView);
    }
}

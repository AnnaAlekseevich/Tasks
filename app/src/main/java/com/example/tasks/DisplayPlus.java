package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayPlus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_plus);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_SECOND);
        TextView tW = new TextView(this);
        tW.setTextSize(45);
        tW.setText(message);

    }
}

package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // получаем сообщение из объекта Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Создаем текстовое поле
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // устанавливаем текстовое поле в системе компановки activity
        setContentView(textView);
    }
}

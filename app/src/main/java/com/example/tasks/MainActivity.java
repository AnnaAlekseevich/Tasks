package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    public final static String EXTRA_SECOND = "EXTRA_SECOND";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Метод обработки нажатия на кнопку
    public void sendMessage(View view){
        // действия, совершаемые после нажатия на кнопку
        // создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.GetText);
        // Получаем текст данного текстового поля
        String message = editText.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ
        // второй параметр - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        // запуск Activity
        startActivity(intent);
    }

    public void plusMessage(View view){

        Intent intent = new Intent(this, DisplayPlus.class);
        EditText edText = (EditText) findViewById(R.id.GetText2);
        String sendMessage = edText.getText().toString();
        intent.putExtra(EXTRA_SECOND, sendMessage);
        startActivity(intent);
    }

}

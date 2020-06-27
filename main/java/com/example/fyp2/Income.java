package com.example.fyp2;

import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.text.InputType;
//import android.view.inputmethod.EditorInfo;
//import android.view.inputmethod.InputConnection;
//import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class Income extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

       // EditText editText = findViewById(R.id.editText);
       // MyKeyboard keyboard = findViewById(R.id.keyboard);
       // editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
       // editText.setTextIsSelectable(true);

        //InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
       // keyboard.setInputConnection(ic);
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class page2 extends AppCompatActivity {
    public Button returnButton;
    public EditText passwordEdittext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        returnButton=findViewById(R.id.returnButton);
        passwordEdittext = findViewById(R.id.passwordEdittext);
    }
}
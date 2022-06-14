package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btnenter;
    public Button btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnenter=findViewById(R.id.btnenter);
        btnexit = findViewById(R.id.btnexit);
        btnenter.setText("Enter");
        btnexit.setText("Exit");
    }
}
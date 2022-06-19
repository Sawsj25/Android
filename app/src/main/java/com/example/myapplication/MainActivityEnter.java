package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private Button exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterButton.setText("Enter");
            }
        });
    }

    private void findViews() {
        enterButton=findViewById(R.id.enterButton);
        exitButton = findViewById(R.id.exitButton);
        enterButton.setText("Enter");
        exitButton.setText("Exit");
        getString(R.string.app_name);
    }
}
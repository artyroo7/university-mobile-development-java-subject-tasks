package com.example.lab1_arthurlysenko;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.textView);
        this.button = findViewById(R.id.button);
    }

    public void onBtnClick(View view) {
        this.textView.setText("PARTY MODE ON!");
        this.button.setTextColor(Color.BLACK);
        this.button.setText("TURN OFF");
        this.button.setBackgroundColor(Color.YELLOW);
        //this.textView.setTextColor(Color.WHITE);
    }


}
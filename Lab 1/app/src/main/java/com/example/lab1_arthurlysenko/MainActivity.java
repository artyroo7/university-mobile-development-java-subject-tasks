package com.example.lab1_arthurlysenko;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textView = findViewById(R.id.textView);
        this.button = findViewById(R.id.button);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
        this.button9 = findViewById(R.id.button9);
        this.button10 = findViewById(R.id.button10);
        this.button11 = findViewById(R.id.button11);
        this.button12 = findViewById(R.id.button12);
    }

    public void onBtnClick(View view) {
        this.textView.setText("PARTY MODE ON!");
        this.button.setTextColor(Color.BLACK);
        this.textView.setTextColor(Color.MAGENTA);
        this.button.setText("TURN OFF");
        this.button.setBackgroundColor(Color.YELLOW);
        this.button2.setBackgroundColor(Color.YELLOW);
        this.button3.setBackgroundColor(Color.GREEN);
        this.button5.setBackgroundColor(Color.CYAN);
        this.button6.setBackgroundColor(Color.RED);
        this.button7.setBackgroundColor(Color.MAGENTA);
        this.button8.setBackgroundColor(Color.LTGRAY);
        this.button9.setBackgroundColor(Color.BLUE);
        this.button10.setBackgroundColor(Color.RED);
        this.button11.setBackgroundColor(Color.YELLOW);
        this.button12.setBackgroundColor(Color.CYAN);
    }

    public void onBtnClick1(View view) {
        this.button.setTextColor(Color.BLACK);
        this.button.setBackgroundColor(Color.WHITE);
        this.button4.setTextColor(Color.BLACK);
        this.button4.setBackgroundColor(Color.WHITE);
        this.textView.setTextColor(Color.BLUE);
    }
}
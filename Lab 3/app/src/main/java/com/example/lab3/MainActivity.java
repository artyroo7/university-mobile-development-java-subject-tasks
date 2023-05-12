package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    int index = 0;
    String sign1 = "";
    String sign2 = "";
    String number1 = "";
    String number2 = "";
    double final_number;
    String sign_equal = "";

    private EditText display;
    TextCounter tc = new TextCounter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
    }

    public void updateText(String strToAdd, String sign_equal2) {
            String oldStr = display.getText().toString();
            int cursorPos = display.getSelectionStart();
            String leftStr = oldStr.substring(0, cursorPos);
            String rightStr = oldStr.substring(cursorPos);
            if (sign_equal2 != "=") {
                display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
                display.setSelection(cursorPos + 1);
            }
    }

    public void updateVariables() {
        display.setText(String.valueOf(final_number));
        for (int i = 0; i < String.valueOf(final_number).length(); i++){
            updateText("", "");
        }
        updateText(sign2, sign_equal);
        sign1 = sign2;
        sign2 = "";
        number1 = String.valueOf(final_number);
    }

    public void back_BTN(View view){
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if (cursorPos != 0 && textLen != 0)
        {
            SpannableStringBuilder selection  = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }
    }
    public void clear_BTN(View view){
        number1 = "";
        number2 = "";
        sign1 = "";
        sign2 = "";
        sign_equal = "";
        index = 0;
        display.setText("");
    }
    public void square_root_BTN(View view){
        updateText("√", "");
        sign1 = "√";
        index = 1;
        number2 = "1";
        sign_equal = "=";
        final_number = tc.result(number1, number2, sign1);
        updateVariables();
        number2 = "";
    }
    public void division_BTN(View view){
        updateText("÷", "");
        if (index != 0) {
            if (sign_equal == "="){
                sign1 = "÷";
            }
            else
            {
                sign2 = "÷";
            }
            index = 1;
            if (number2 != "") {
                final_number = tc.result(number1, number2, sign1);
                updateVariables();
            }
            number2 = "";
        }
        else {
            sign1 = "÷";
            index = 1;
        }
    }
    public void multiplication_BTN(View view){
        updateText("x", "");
        if (index != 0) {
            if (sign_equal == "="){
                sign1 = "x";
            }
            else
            {
                sign2 = "x";
            }
            index = 1;
            if (number2 != "") {
                final_number = tc.result(number1, number2, sign1);
                updateVariables();
            }
            number2 = "";
        }
        else {
            sign1 = "x";
            index = 1;
        }
    }
    public void substraction_BTN(View view){
        updateText("-", "");
        if (index != 0) {
            if (sign_equal == "="){
                sign1 = "-";
            }
            else
            {
                sign2 = "-";
            }
            index = 1;
            if (number2 != "") {
                final_number = tc.result(number1, number2, sign1);
                updateVariables();
            }
            number2 = "";
        }
        else {
            sign1 = "-";
            index = 1;
        }
    }
    public void sum_BTN(View view) {
        updateText("+", "");
        if (index != 0) {
            if (sign_equal == "="){
                sign1 = "+";
            }
            else
            {
                sign2 = "+";
            }
            index = 1;
            if (number2 != "") {
                final_number = tc.result(number1, number2, sign1);
                updateVariables();
            }
            number2 = "";
        }
        else {
            sign1 = "+";
            index = 1;
        }
    }
    public void one_BTN(View view){
        updateText("1", "");
        if (index != 0){
            number2 = number2 + "1";
        }
        else{
            number1 = number1 + "1";
        }
    }
    public void two_BTN(View view){
        updateText("2", "");
        if (index != 0){
            number2 = number2 + "2";
        }
        else{
            number1 = number1 + "2";
        }
    }
    public void three_BTN(View view){
        updateText("3", "");
        if (index != 0){
            number2 = number2 + "3";
        }
        else{
            number1 = number1 + "3";
        }
    }
    public void four_BTN(View view){
        updateText("4", "");
        if (index != 0){
            number2 = number2 + "4";
        }
        else{
            number1 = number1 + "4";
        }
    }
    public void five_BTN(View view){
        updateText("5", "");
        if (index != 0){
            number2 = number2 + "5";
        }
        else{
            number1 = number1 + "5";
        }
    }
    public void six_BTN(View view){
        updateText("6", "");
        if (index != 0){
            number2 = number2 + "6";
        }
        else{
            number1 = number1 + "6";
        }
    }
    public void seven_BTN(View view){
        updateText("7", "");
        if (index != 0){
            number2 = number2 + "7";
        }
        else{
            number1 = number1 + "7";
        }
    }
    public void eight_BTN(View view){
        updateText("8", "");
        if (index != 0){
            number2 = number2 + "8";
        }
        else{
            number1 = number1 + "8";
        }
    }
    public void nine_BTN(View view){
        updateText("9", "");
        if (index != 0){
            number2 = number2 + "9";
        }
        else{
            number1 = number1 + "9";
        }
    }
    public void zero_BTN(View view){
        updateText("0", "");
        if (index != 0){
            number2 = number2 + "0";
        }
        else{
            number1 = number1 + "0";
        }
    }
    public void dot_BTN(View view){
        updateText(".", "");
        if (index != 0){
            number2 = number2 + ".";
        }
        else{
            number1 = number1 + ".";
        }
    }
    public void equals_BTN(View view) {
        if (number1 != "" && number2 != "") {
            sign_equal = "=";
            final_number = tc.result(number1, number2, sign1);
            updateVariables();
        }
        number2 = "";
    }
    public void just_button(View view){ }

}
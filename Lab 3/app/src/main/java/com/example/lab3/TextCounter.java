package com.example.lab3;

public class TextCounter {

    static double number_11;
    static double number_22;
    static double number_33;

    public static boolean isNumeric(String text) {
        try {
            Double.parseDouble(text);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static double result(String number11, String number22, String sign11){

        if (isNumeric(number11) == true && isNumeric(number22) == true && number11.length() < 10 && number22.length() < 10) {
            if (sign11 == "+") {
                number_11 = Math.round(Float.parseFloat(number11));
                number_22 = Math.round(Float.parseFloat(number22));
                number_33 = number_11 + number_22;
            } else if (sign11 == "-") {
                number_11 = Math.round(Float.parseFloat(number11));
                number_22 = Math.round(Float.parseFloat(number22));
                number_33 = number_11 - number_22;
            } else if (sign11 == "x") {
                number_11 = Math.round(Float.parseFloat(number11));
                number_22 = Math.round(Float.parseFloat(number22));
                number_33 = number_11 * number_22;
            } else if (sign11 == "÷") {
                number_11 = Math.round(Float.parseFloat(number11));
                number_22 = Math.round(Float.parseFloat(number22));
                number_33 = number_11 / number_22;
            } else if (sign11 == "√") {
                number_11 = Double.parseDouble(number11);
                number_33 = Math.pow(number_11, 0.5);
            }
            else
            {
                return 0;
            }
            return number_33;
        }
        else{
            return 0;
        }
    }

}

package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operationScreen(int number){
        TextView first = findViewById(R.id.operation_screen);
        first.append(String.valueOf(number));
    }
//    public void resultScreen(int number){
//        TextView first = findViewById(R.id.result_screen);
//        first.append(String.valueOf(number));
//    }
    public void displaySign(String sign) {
        TextView signs = (TextView) findViewById(R.id.operation_screen);
        signs.append(sign);
    }
    public void display(int number) {
        TextView result = (TextView) findViewById(R.id.result_screen);
        result.setText("" + number);
    }
    public void displayO() {
        TextView result = (TextView) findViewById(R.id.operation_screen);
        result.setText("");
    }

        public void btn_one(View v) {
        int one = 1;
        operationScreen(one);
    }
    public void btn_two(View v) {
        int two = 2;
        operationScreen(two);
    }
    public void btn_three(View v) {
        int three = 3;
        operationScreen(three);
    }
    public void btn_four(View v) {
        int four = 4;
        operationScreen(four);
    }
    public void btn_five(View v) {
        int five = 5;
        operationScreen(five);
    }
    public void btn_six(View v) {
        int six = 6;
        operationScreen(six);
    }
    public void btn_seven(View v) {
        int seven = 7;
        operationScreen(seven);
    }
    public void btn_eight(View v) {
        int eight = 8;
        operationScreen(eight);
    }
    public void btn_nine(View v) {
        int nine = 9;
        operationScreen(nine);
    }
    public void btn_zero(View v) {
        int zero = 0;
        operationScreen(zero);
    }

    public void btn_addition(View v) {
        String addition = "+";
        displaySign(addition);
    }
    public void btn_dot(View v) {
        String dot = ".";
        displaySign(dot);
    }
    public void btn_subtraction(View v) {
        String subtraction = "-";
        displaySign(subtraction);
    }
    public void btn_multiplication(View v) {
        String multiplication = "x";
        displaySign(multiplication);
    }
    public void btn_division(View v) {
        String division = "/";
        displaySign(division);
    }
    public void btn_power(View v) {
        String power = "^";
        displaySign(power);
    }
    public void btn_clear(View v) {
        displayO();
        TextView signs = (TextView) findViewById(R.id.result_screen);
        signs.setText("");
    }
    public void btn_del(View v) {
        TextView first = findViewById(R.id.operation_screen);
        String exp = first.getText().toString();
        TextView signs = (TextView) findViewById(R.id.operation_screen);
        if (exp == "") {
            signs.setText("");
        }
        exp = exp.substring(0, exp.length() - 1);
        signs.setText(exp);
    }
    public void btn_equality(View v) {
        TextView first = findViewById(R.id.operation_screen);
        String exp = first.getText().toString();
        if (exp.contains("+")) {
            String[] list = exp.split("\\+");
            String one = list[0];
            String two = list[1];

            int add1 = Integer.parseInt(one.trim());
            int add2 = Integer.parseInt(two.trim());

            int result = add1 + add2;

            display(result);
        } else if (exp.contains("x")) {
            String[] list = exp.split("x");
            String one = list[0];
            String two = list[1];

            int add1 = Integer.parseInt(one.trim());
            int add2 = Integer.parseInt(two.trim());

            int result = add1 * add2;

            display(result);
        } else if (exp.contains("/")) {
            String[] list = exp.split("/");
            String one = list[0];
            String two = list[1];

            int add1 = Integer.parseInt(one.trim());
            int add2 = Integer.parseInt(two.trim());

            int result = add1 / add2;

            display(result);
        } else if (exp.contains("-")) {
            String[] list = exp.split("-");
            String one = list[0];
            String two = list[1];

            int add1 = Integer.parseInt(one.trim());
            int add2 = Integer.parseInt(two.trim());

            int result = add1 - add2;

            display(result);
        } else if (exp.contains("^")) {
            String[] list = exp.split("^");
            String one = list[0];
            String two = list[1];

            int add1 = Integer.parseInt(one.trim());
            int add2 = Integer.parseInt(two.trim());

            double result = Math.pow(add1, add2);
            int results = (int) result;
            display(results);
        }

    }
}

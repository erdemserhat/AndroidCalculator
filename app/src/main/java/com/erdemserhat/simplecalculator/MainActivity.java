package com.erdemserhat.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static TextView text_process, text_result;
    Button add_button,minus_button, multiply_button ,divide_button,result_button;
    String process;
    ArrayList <String> list = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_process=findViewById(R.id.text_processes);
        text_result=findViewById(R.id.text_result);
        add_button=findViewById(R.id.add_button);
        minus_button=findViewById(R.id.minus_button);
        multiply_button=findViewById(R.id.multiply_button);
        divide_button=findViewById(R.id.divide_button);
        result_button=findViewById(R.id.result_button);
        text_result.setText("");
        text_process.setText("");
        process="";
        control();


    }
    public void one(View view){

        process=text_process.getText().toString();
        process+="1";
        text_process.setText(process);
        control();

    }

    public void two(View view){
        process+="2";
        text_process.setText(process);
        control();
    }

    public void three(View view){
        process+="3";
        text_process.setText(process);
        control();
    }

    public void four(View view){
        process+="4";
        text_process.setText(process);
        control();
    }

    public void five(View view){
        process+="5";
        text_process.setText(process);
        control();
    }

    public void six(View view){
        process+="6";
        text_process.setText(process);
        control();
    }

    public void seven(View view){
        process+="7";
        text_process.setText(process);
        control();
    }

    public void eight(View view){
        process+="8";
        text_process.setText(process);
        control();
    }

    public void nine(View view){
        process+="9";
        text_process.setText(process);
        control();
    }

    public void zero(View view){
        process+="0";
        text_process.setText(process);
        control();
    }

    public void add(View view){
        process+="+";
        text_process.setText(process);

        control();
    }

    public void minus(View view){
        process+="-";
        text_process.setText(process);
        control();
    }

    public void multiply(View view){
        process+="x";
        text_process.setText(process);
        // if(process.charAt(process.length())=='x' ||)
        control();
    }

    public void divide(View view){
        process+="/";
        text_process.setText(process);
        control();
    }



    public void backspace(View view){

        process=text_process.getText().toString();
        if(process.length()==0) return;

        process=text_process.getText().toString();
        if(process.length()!=0) {
            process = process.substring(0, process.length() - 1);
            text_process.setText(process);
            control();
        }

    }

    public void reset(View view){
        process="";
        text_process.setText(process);
        text_result.setText(process);
        add_button.setEnabled(true);
        minus_button.setEnabled(true);
        multiply_button.setEnabled(true);
        divide_button.setEnabled(true);

    }
    //
    public void calculate(View view){
        if(text_process.getText().toString().length()==0) return;
        process=text_process.getText().toString();
        control();
        String process = text_process.getText().toString();
        text_result.setText("="+Calculate.convert(process));


    }



    public void control(){
        if(process.length()==0) return;
        if(process.charAt(process.length()-1)=='+' || process.charAt(process.length()-1)=='-' || process.charAt(process.length()-1)=='/' ||
                process.charAt(process.length()-1)=='x'){
            add_button.setEnabled(false);
            minus_button.setEnabled(false);
            multiply_button.setEnabled(false);
            divide_button.setEnabled(false);
            result_button.setEnabled(false);
        }else{
            add_button.setEnabled(true);
            minus_button.setEnabled(true);
            multiply_button.setEnabled(true);
            divide_button.setEnabled(true);
            result_button.setEnabled(true);



        }

    }





}
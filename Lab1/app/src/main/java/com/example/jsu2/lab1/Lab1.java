package com.example.jsu2.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class Lab1 extends AppCompatActivity {

    int number = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    public void incrementButtonClicked(View v) {
        number = number + 1;
        display(number);

    }

    private void display(int number) {

    }
}

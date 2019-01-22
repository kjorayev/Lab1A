package com.example.jsu2.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    int number = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void demoButtonIncrement(View v){

    }

    public void demoButtonDecrement(View v){
        TextView t = (TextView) findViewById(R.id.number);
        t.setText(number - 1);
    }
}

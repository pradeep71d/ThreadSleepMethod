package com.example.javademo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SleepMethod1 t1 = new SleepMethod1();
        SleepMethod1 t2=new SleepMethod1();
        t1.start();// here we are starting two threads
        t2.start();
    }
}

package com.appuno_camilordgz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String name = "Camilo Rodriguez Gomez";
    int age = 17;
    char gender = 'M';
    float height = (float)1.78;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
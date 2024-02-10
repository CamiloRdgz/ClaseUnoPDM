package com.project001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Calculator extends AppCompatActivity {

    Button go_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        go_menu = findViewById(R.id.go_menu);
        go_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_main_menu();
            }
        });
    }

    public void go_main_menu() {
        Intent menu_screen = new Intent(this, MainActivity.class);
        startActivity(menu_screen);
    }
}

package com.project001;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
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

        //INPUT - RESULT
        TextView input = (TextView) findViewById(R.id.input);
        TextView result = (TextView) findViewById(R.id.result);

        //NUMBERS
        Button num0 = (Button) findViewById(R.id.num0);
        Button num1 = (Button) findViewById(R.id.num1);
        Button num2 = (Button) findViewById(R.id.num2);
        Button num3 = (Button) findViewById(R.id.num3);
        Button num4 = (Button) findViewById(R.id.num4);
        Button num5 = (Button) findViewById(R.id.num5);
        Button num6 = (Button) findViewById(R.id.num6);
        Button num7 = (Button) findViewById(R.id.num7);
        Button num8 = (Button) findViewById(R.id.num8);
        Button num9 = (Button) findViewById(R.id.num9);
        Button point = (Button) findViewById(R.id.point);

        //OPERATIONS
        Button opadd = (Button) findViewById(R.id.opadd);
        Button opsub = (Button) findViewById(R.id.opsub);
        Button opmult = (Button) findViewById(R.id.opmult);
        Button opdiv = (Button) findViewById(R.id.opdiv);
        Button clear = (Button) findViewById(R.id.clear);
        Button equals = (Button) findViewById(R.id.equals);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num0.getText().toString());
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num1.getText().toString());
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num2.getText().toString());
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num3.getText().toString());
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num4.getText().toString());
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num5.getText().toString());
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num6.getText().toString());
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num7.getText().toString());
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num8.getText().toString());
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + num9.getText().toString());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + point.getText().toString());
            }
        });
        opadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + opadd.getText().toString());
            }
        });
        opsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + opsub.getText().toString());
            }
        });
        opmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + opmult.getText().toString());
            }
        });
        opdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString() + opdiv.getText().toString());
            }
        });


    }

    public void go_main_menu() {
        Intent menu_screen = new Intent(this, MainActivity.class);
        startActivity(menu_screen);
    }


}

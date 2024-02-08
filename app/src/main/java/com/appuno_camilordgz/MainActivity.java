package com.appuno_camilordgz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String name = "Camilo Rodriguez Gomez";
    int age = 17;
    char gender = 'M';
    float height = (float)1.78;

    TextView username;
    Button btn1, btn2;  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.user);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                username.setText("Button 1 Pressed");
                Toast.makeText(this, "Button 1 Pressed", Toast.LENGTH_SHORT);
            }
        })

        btn2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                username.setText("Button 2 Pressed")
                Toast.makeText(this, "Button 2 Pressed", Toast.LENGTH_SHORT);
            }
        })
    }
}
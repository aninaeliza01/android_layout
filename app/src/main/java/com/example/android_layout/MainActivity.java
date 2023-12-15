package com.example.android_layout;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button linear=findViewById(R.id.bt1);
        Button relative=findViewById(R.id.bt2);
        Button grid=findViewById(R.id.bt3);
        Button frame=findViewById(R.id.bt4);
        Button constraint=findViewById(R.id.bt5);
        Button table=findViewById(R.id.bt6);
        View.OnClickListener click=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = ((Button) v).getText().toString();
                Toast.makeText(MainActivity.this, "select " + value, Toast.LENGTH_LONG).show();
            }
        };
        linear.setOnClickListener(click);
        relative.setOnClickListener(click);
        grid.setOnClickListener(click);
        frame.setOnClickListener(click);
        constraint.setOnClickListener(click);
        table.setOnClickListener(click);
    }
}
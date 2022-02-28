package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Lab2_2a extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_2a);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(Lab2_2a.this, "Ban da click", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
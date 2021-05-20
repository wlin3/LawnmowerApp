package com.example.lawnmower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CircleLawn extends AppCompatActivity {

    private Button Multiply;
    private EditText Radius;
    private TextView Total;

    public void back(View view) {
        Intent i = new Intent(this,LawnCost.class);
        startActivity(i);
    }
    Float square = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_lawn);

        Multiply = findViewById(R.id.calculate);
        Radius = findViewById(R.id.radius);
        Total = findViewById(R.id.Total);

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputValue= Integer.parseInt(Radius.getText().toString());
                square=inputValue*inputValue*Math.PI;
            }

        });

    }}
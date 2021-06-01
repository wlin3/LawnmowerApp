package com.example.lawnmower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TriangleLawn extends AppCompatActivity {

    private Button Multiply;
    private EditText First;
    private EditText Second;
    private EditText Third;
    private TextView Total;

    public void back(View view) {
        Intent i = new Intent(this,LawnCost.class);
        startActivity(i);
    }
    float square = 1.0F;
    double S = square;
    double A = square;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_lawn);

        Multiply = findViewById(R.id.calculate);
        First = findViewById(R.id.first);
        Second = findViewById(R.id.second);
        Third= findViewById(R.id.third);
        Total = findViewById(R.id.Total);

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(First.getText().toString());
                float second = Float.parseFloat(Second.getText().toString());
                float third = Float.parseFloat(Third.getText().toString());
                S = (first+second+third)/2;
                A = Math.sqrt(S*(S - first)*(S-second)*(S-third));
                Total.setText("Total is:\n" +S+" \nAcres");
            }

        });

    }}
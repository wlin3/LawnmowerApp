package com.example.lawnmower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RectangleLawn extends AppCompatActivity {

    private Button Multiply;
    private EditText Width;
    private EditText Length;
    private TextView Total;

    public void back(View view) {
        Intent i = new Intent(this,LawnCost.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_lawn);

        Multiply = findViewById(R.id.calculate);
        Width = findViewById(R.id.width);
        Length = findViewById(R.id.length);
        Total = findViewById(R.id.Total);

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a,b,c;
                a= Double.parseDouble(Length.getText() .toString());
                b= Double.parseDouble(Width.getText() .toString());
                c= a*b;
                Total.setText("Total is:\n" +c+" \nAcres");
            }

         });

}}
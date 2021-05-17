package com.example.lawnmower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RectangleLawn extends AppCompatActivity {

    EditText length;
    EditText width;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_lawn);

        width = findViewById(R.id.width);
        length = findViewById(R.id.length);

        }
    }


}
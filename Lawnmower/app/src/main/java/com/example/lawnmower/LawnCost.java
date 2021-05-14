package com.example.lawnmower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LawnCost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lawn_cost);
    }
    public void Rectangle(View view) {
        Intent i = new Intent(this,RectangleLawn.class);
        startActivity(i);
    }
    public void Circle(View view) {
        Intent i = new Intent(this,CircleLawn.class);
        startActivity(i);
    }
    public void Triangle(View view) {
        Intent i = new Intent(this,TriangleLawn.class);
        startActivity(i);
    }
}
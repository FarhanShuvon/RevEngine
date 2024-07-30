package com.example.revengine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProductsDisplay extends AppCompatActivity {

    private Button btnCars, btnMotorbikes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_display);

        btnCars = findViewById(R.id.btn_cars);
        btnMotorbikes = findViewById(R.id.btn_motorbikes);

        btnCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductsDisplay.this, Cars.class);
                startActivity(intent);
            }
        });

        btnMotorbikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductsDisplay.this, Motorbikes.class);
                startActivity(intent);
            }
        });
    }
}
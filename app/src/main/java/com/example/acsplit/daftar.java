package com.example.acsplit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class daftar extends AppCompatActivity {
    ImageView go, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        go = findViewById(R.id.go);
        back = findViewById(R.id.back);

        go.setOnClickListener(View -> {
            Intent intent = new Intent(daftar.this, daftar1.class);
            startActivity(intent);
            finish();
        });
        back.setOnClickListener(View -> {
            Intent intent = new Intent(daftar.this, MainActivity.class);
            startActivity(intent);
            finish();
        });


    }
}
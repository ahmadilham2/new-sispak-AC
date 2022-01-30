package com.example.acsplit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class daftar1 extends AppCompatActivity {
    ImageView back, go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar1);

        go = findViewById(R.id.go);
        back = findViewById(R.id.back);

        go.setOnClickListener(View -> {
            Intent intent = new Intent(daftar1.this, daftar2.class);
            startActivity(intent);
            finish();
        });
        back.setOnClickListener(View -> {
            Intent intent = new Intent(daftar1.this, daftar.class);
            startActivity(intent);
            finish();
        });
    }
}
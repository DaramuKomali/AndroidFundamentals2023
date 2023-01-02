package com.vvit.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button helloToast = findViewById(R.id.id_hello_toast);
        Button storeKeeper = findViewById(R.id.id_score_keeper);
        helloToast.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HelloToast.class);
            startActivity(intent);
            finish();
        });
        storeKeeper.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ScoreKeeper.class);
            startActivity(intent);
            finish();
        });
    }
}
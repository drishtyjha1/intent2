package com.example.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onExplicitIntentClicked(View view) {
        startActivity(new Intent(MainActivity.this,expliciteIntent.class));
    }
    public void onImplicitIntentClicked(View view)
    {
        startActivity(new Intent(MainActivity.this,implicitIntent.class));
    }
}
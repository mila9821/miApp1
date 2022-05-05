package com.example.miapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void actividad2(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void salir(View view) {
        finish();
    }

    public void actividad1(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }
}
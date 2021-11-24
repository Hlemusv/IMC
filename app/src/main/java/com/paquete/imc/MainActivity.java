package com.paquete.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargarActividadIMC(View view) {
        Intent i = new Intent(this , IMC.class   );
        startActivity(i);
    }

    public void ordenar(View view) {
        Intent i = new Intent(this, Pizza.class);
        startActivity(i);
    }
}
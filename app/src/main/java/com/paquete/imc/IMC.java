package com.paquete.imc;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IMC extends AppCompatActivity {
    EditText edtPeso, edtEstatura;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_frm_imc);

        edtPeso     = findViewById(R.id.edtPeso);
        edtEstatura = findViewById(R.id.edtEstatura);
        txtResultado= findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        double peso = Double.parseDouble(edtPeso.getText().toString());
        double est  = Double.parseDouble(edtEstatura.getText().toString());

        double resultado = peso/ (est * est);

        txtResultado.setText("Su IMC es:"+ resultado);
    }
}

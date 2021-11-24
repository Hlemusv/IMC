package com.paquete.imc;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pizza extends AppCompatActivity {
    RadioButton rbV, rbS, rbH;
    CheckBox chEE, chGF;
    TextView txtR;
    Spinner spSauce;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_pizza);

        rbV     = findViewById(R.id.rbVegetarian);
        rbS     = findViewById(R.id.rbSuprem);
        rbH     = findViewById(R.id.rbHawaiian);

        chEE    = findViewById(R.id.chExtraCheese);
        chGF    = findViewById(R.id.chGluten);

        spSauce = findViewById(R.id.spSauce);

        txtR    = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        double acumuladorTotal;
        if(rbS.isChecked()){
            acumuladorTotal = 1000;
        }else if(rbV.isChecked()){
            acumuladorTotal =  700;
        }else{
            acumuladorTotal =  800;
        }

        String opcionS = spSauce.getSelectedItem().toString();
        if(opcionS.equals("Tomato $150")){
            acumuladorTotal = acumuladorTotal + 150;
        }else if(opcionS.equals("Barbeque $160")){
            acumuladorTotal = acumuladorTotal + 160;
        }else{
            acumuladorTotal = acumuladorTotal + 140;
        }

        if(chEE.isChecked()){
            acumuladorTotal = acumuladorTotal + 200;
        }

        if(chGF.isChecked()){
            acumuladorTotal = acumuladorTotal + 100;
        }
        txtR.setText("el total a pagar:"+ acumuladorTotal);
    }
}

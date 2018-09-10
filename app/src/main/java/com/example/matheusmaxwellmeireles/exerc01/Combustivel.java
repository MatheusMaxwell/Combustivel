package com.example.matheusmaxwellmeireles.exerc01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Combustivel extends Activity implements View.OnClickListener {

    Button btnVerif;
    EditText edTextAlcool;
    EditText edTextGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustivel);

        btnVerif = findViewById(R.id.btnVerificar);

        btnVerif.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(compensaAlcool())
            Toast.makeText(this, "Compensa Alcool.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Compensa Gasolina.", Toast.LENGTH_LONG).show();
    }

    public boolean compensaAlcool () {
        edTextAlcool = findViewById(R.id.txtAlco);
        edTextGasolina = findViewById(R.id.txtGas);
        double alcool = Double.parseDouble(edTextAlcool.getText().toString());
        double gasolina = Double.parseDouble(edTextGasolina.getText().toString());
        if ((alcool / gasolina) <= 0.7) return true;

        return false;
    }
}

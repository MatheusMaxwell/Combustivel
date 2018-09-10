package com.example.matheusmaxwellmeireles.exerc01;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Autonomia extends Activity implements View.OnClickListener {

    Button btnVerif;
    EditText txtKm;
    EditText txtL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomia);

        btnVerif = findViewById(R.id.btnVerificar);
        btnVerif.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, returnResult()+" km/L", Toast.LENGTH_LONG).show();
    }

    public double returnResult (){
        txtKm = findViewById(R.id.txtKm);
        txtL = findViewById(R.id.txtL);
        double km = Double.parseDouble(txtKm.getText().toString());
        double litros = Double.parseDouble(txtL.getText().toString());

        return km/litros;
    }
}

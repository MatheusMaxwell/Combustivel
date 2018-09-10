package com.example.matheusmaxwellmeireles.exerc01;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import  android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnComb;
    Button btnAuto;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAuto = findViewById(R.id.btnAutonomia);
        btnAuto.setOnClickListener(this);

        btnComb = findViewById(R.id.btnCombustivel);
        btnComb.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnCombustivel:
                intent = new Intent(this, Combustivel.class);
                startActivity(intent);
                break;
            case R.id.btnAutonomia:
                intent = new Intent(this, Autonomia.class);
                startActivity(intent);
                break;
        }

    }
}

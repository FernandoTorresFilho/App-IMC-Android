package com.example.questo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.pow;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt1 = findViewById(R.id.btCalcular);
        bt1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        EditText edPeso = findViewById(R.id.ed_peso);
        EditText edAltura = findViewById(R.id.ed_altura);

        Double edPeso1 = Double.parseDouble(edPeso.getText().toString());
        Double edAltura1 = Double.parseDouble(edAltura.getText().toString());

        Double resultadoimc = edPeso1 / pow(edAltura1,2);
        TextView resultado =  findViewById(R.id.tv_resultado);

        if (resultadoimc < 18.5) {
            resultado.setText(String.valueOf("Baixo Peso " + resultadoimc));
        }

        if (resultadoimc>24.9){
            resultado.setText(String.valueOf("Obesidade " + resultadoimc));
        }
        else {
            resultado.setText(String.valueOf("Peso Normal " + resultadoimc));
        }

    }
}


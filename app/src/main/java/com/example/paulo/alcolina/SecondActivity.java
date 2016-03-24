package com.example.paulo.alcolina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText valorAlc, valorGas;
    private String resultado;
    private Double valorEtanol, valorGasolina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        valorAlc = (EditText) findViewById(R.id.campo_etanol);
        valorGas = (EditText) findViewById(R.id.campo_gasolina);

        resultado = "";
    }

    public void calcular(View view){
        valorEtanol = Double.parseDouble(valorAlc.getText().toString());
        valorGasolina = Double.parseDouble(valorGas.getText().toString());

        resultado = calcula(valorEtanol, valorGasolina);

        Intent thirdActivity = new Intent(this, ThirdActivity.class);
        thirdActivity.putExtra("resultado", resultado);
        startActivity(thirdActivity);
    }

    private String calcula(Double alcool, Double gasolina){
        String retorno;
        Double var = alcool/gasolina;

        if(var < 0.7){
            retorno = "álcool";
        }else{
            retorno = "gasolina";
        }
        return retorno;
    }
}

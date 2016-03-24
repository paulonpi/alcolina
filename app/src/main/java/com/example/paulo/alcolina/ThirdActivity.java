package com.example.paulo.alcolina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        TextView t = (TextView) findViewById(R.id.txt_vantagem);
        t.setText(resultado);
    }

    public void startSecondActive(View view){
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }
}

package com.example.doctorApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PagoActivity extends AppCompatActivity {

    EditText titular,nTarjeta, digitos, fecha;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

        nTarjeta = findViewById(R.id.nTarjeta);
        titular = findViewById(R.id.titular);
        fecha = findViewById(R.id.fecha);
        digitos = findViewById(R.id.digitos);

        siguiente = (Button)findViewById(R.id.btnEntrar);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
              Intent siguiente = new Intent(PagoActivity.this, MainActivity.class);
              startActivity(siguiente);
            }
        });

    }
}


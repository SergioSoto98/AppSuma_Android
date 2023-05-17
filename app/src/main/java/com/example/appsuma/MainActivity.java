package com.example.appsuma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1;
    private EditText etNumber2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MANDAMOS A LLAMAR LOS ID DE LA VISTA GRAFICA DE LA APP
        etNumber1 = (EditText) findViewById(R.id.txt_Number1);
        etNumber2 = (EditText) findViewById(R.id.txt_Number2);
        tvResultado = (TextView) findViewById(R.id.txt_Resultado);
    }

    //ESTE METODO REALIZA LA OPERACION DE LA SUMA
    public void Sumar(View view) {
        String valor1 = etNumber1.getText().toString();
        String valor2 = etNumber2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int suma = numero1 + numero2;

        String resultado = String.valueOf(suma);
        tvResultado.setText(resultado);
    }
}
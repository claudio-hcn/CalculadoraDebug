package com.example.calculadoradebug;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText nro1, nro2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nro1 = (EditText) findViewById(R.id.nro1);
        nro2 = (EditText) findViewById(R.id.nro2);
        resultado = (TextView) findViewById(R.id.resultado);

    }

    public void sumar(View view) {
        try {

            String valor1 = nro1.getText().toString();
            String valor2 = nro2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int suma = n1 + n2;
            String resu = String.valueOf(suma);
            resultado.setText(resu);
            Log.d("suma", "boton suma presionado");
        } catch (Exception e) {
            Toast.makeText(this, (R.string.excepcion), Toast.LENGTH_SHORT).show();
        }


    }

    public void restar(View view) {
        try {
            String valor1 = nro1.getText().toString();
            String valor2 = nro2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int rest = n1 - n2;
            String resu = String.valueOf(rest);
            resultado.setText(resu);
            Log.d("resta", "boton resta presionado");
        } catch (Exception e) {
            Toast.makeText(this, (R.string.excepcion), Toast.LENGTH_SHORT).show();
        }

    }

    public void multiplicar(View view) {
        try {
            String valor1 = nro1.getText().toString();
            String valor2 = nro2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            int mult = n1 * n2;
            String resu = String.valueOf(mult);
            resultado.setText(resu);
            Log.d("multiplicación", "boton multiplicación presionado");
        } catch (Exception e) {
            Toast.makeText(this, (R.string.excepcion), Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View view) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#0.##");
            String valor1 = nro1.getText().toString();
            String valor2 = nro2.getText().toString();
            float n1 = Float.parseFloat(valor1);
            float n2 = Float.parseFloat(valor2);
            float div = n1 / n2;
            String resu = decimalFormat.format(div);
            resultado.setText(resu);
            Log.d("division", "boton division presionado");
        } catch (Exception e) {
            Toast.makeText(this, (R.string.excepcion), Toast.LENGTH_SHORT).show();
        }

    }
}
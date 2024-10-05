package com.example.contadordeclicsborjaag;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int contadortodos;
    int contador1;
    int contador2;
    int contador3;
    int contador4;
    TextView sumaDeClics;
    Button resetAllContador;
    TextView contadorDeClics1;
    Button aumentarElContador1;
    Button reset1;
    TextView contadorDeClics2;
    Button aumentarElContador2;
    Button reset2;
    TextView contadorDeClics3;
    Button aumentarElContador3;
    Button reset3;
    TextView contadorDeClics4;
    Button aumentarElContador4;
    Button reset4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumaDeClics = findViewById(R.id.sumaDeClics);
        resetAllContador = findViewById(R.id.resetAllContador);


        resetAllContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1 = 0;
                contadorDeClics1.setText("" + contador1 + "");
                contador2 = 0;
                contadorDeClics2.setText("" + contador2 + "");
                contador3 = 0;
                contadorDeClics3.setText("" + contador3 + "");
                contador4 = 0;
                contadorDeClics4.setText("" + contador4 + "");
                contadortodos = 0;
                sumaDeClics.setText("" + contadortodos + "");
            }
        });

        contadorDeClics1 = findViewById(R.id.contadorDeClics1);
        aumentarElContador1 = findViewById(R.id.aumentarElContador1);
        reset1 = findViewById(R.id.reset1);

        aumentarElContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos++;
                sumaDeClics.setText("" + contadortodos + "");
                contador1++;
                contadorDeClics1.setText("" + contador1 + "");
            }
        });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos -= contador1;
                sumaDeClics.setText("" + contadortodos + "");
                contador1 = 0;
                contadorDeClics1.setText("" + contador1 + "");
            }
        });

        contadorDeClics2 = findViewById(R.id.contadorDeClics2);
        aumentarElContador2 = findViewById(R.id.aumentarElContador2);
        reset2 = findViewById(R.id.reset2);

        aumentarElContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos++;
                sumaDeClics.setText("" + contadortodos + "");
                contador2++;
                contadorDeClics2.setText("" + contador2 + "");
            }
        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos -= contador2;
                sumaDeClics.setText("" + contadortodos + "");
                contador2 = 0;
                contadorDeClics2.setText("" + contador2 + "");
            }
        });

        contadorDeClics3 = findViewById(R.id.contadorDeClics3);
        aumentarElContador3 = findViewById(R.id.aumentarElContador3);
        reset3 = findViewById(R.id.reset3);

        aumentarElContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos++;
                sumaDeClics.setText("" + contadortodos + "");
                contador3++;
                contadorDeClics3.setText("" + contador3 + "");
            }
        });

        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos -= contador3;
                sumaDeClics.setText("" + contadortodos + "");
                contador3 = 0;
                contadorDeClics3.setText("" + contador3 + "");
            }
        });

        contadorDeClics4 = findViewById(R.id.contadorDeClics4);
        aumentarElContador4 = findViewById(R.id.aumentarElContador4);
        reset4 = findViewById(R.id.reset4);

        aumentarElContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos++;
                sumaDeClics.setText("" + contadortodos + "");
                contador4++;
                contadorDeClics4.setText("" + contador4 + "");
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadortodos -= contador4;
                sumaDeClics.setText("" + contadortodos + "");
                contador4 = 0;
                contadorDeClics4.setText("" + contador4 + "");
            }
        });
    }
}
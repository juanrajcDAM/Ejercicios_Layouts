package com.htcdiurno.ejercicios_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar_Login (View view){
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
    }

    public void mostrar_Numeros (View view){
        Intent intent = new Intent (this, Numeros.class);
        startActivity(intent);
    }

    public void mostrar_CalculadoraAntigua (View view){
        Intent intent = new Intent (this, CalculadoraAntigua.class);
        startActivity(intent);
    }


    public void mostrar_CalculadoraNueva (View view){
        Intent intent = new Intent (this, CalculadoraNueva.class);
        startActivity(intent);
    }

}

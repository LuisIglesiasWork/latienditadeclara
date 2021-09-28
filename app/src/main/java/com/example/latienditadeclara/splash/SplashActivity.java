package com.example.latienditadeclara.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.latienditadeclara.MainActivity;
import com.example.latienditadeclara.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(3000);
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    //En Este Activity se Cargaran los Datos de las Imagenes y publicaciones que tenga en todas las Redes Sociales.
    //No se cambiara de Activty hasta que termine la Carga.
    //se Tendra en cuenta el Acceso a internet.
}
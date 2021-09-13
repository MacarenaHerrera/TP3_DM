package com.herrera.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import modelo.Pelicula;

public class VistaDetallada extends AppCompatActivity {
    private  TextView tvTitulo, tvDescripcion, tvActores, tvDirector, tv1, tv2;
    private ImageView ivFoto;
    Pelicula pelicula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_detallada);
        iniciarVista();
        setear();
    }

    public void iniciarVista(){
        tvDescripcion = findViewById(R.id.tvDescripcion);
        tvActores = findViewById(R.id.tvActores);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvDirector = findViewById(R.id.tvDirector);
        ivFoto = findViewById(R.id.ivFoto);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
    }

    public  void setear(){
        tvTitulo.setText(getIntent().getExtras().getString("titulo"));
        tvDescripcion.setText(getIntent().getExtras().getString("descripcion"));
        tvActores.setText(getIntent().getExtras().getString("actores"));
        tvDirector.setText(getIntent().getExtras().getString("director"));
        ivFoto.setImageResource(getIntent().getExtras().getInt("foto"));
    }


}
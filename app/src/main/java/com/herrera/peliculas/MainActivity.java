package com.herrera.peliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import modelo.Pelicula;

public class MainActivity extends AppCompatActivity {
private RecyclerView rvPelicula;
private  PeliculaAdapter adapter;
Pelicula pelicula = new Pelicula();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPelicula = findViewById(R.id.rvPeliculas);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, true);
        rvPelicula.setLayoutManager(gridLayoutManager);
        adapter=new PeliculaAdapter(pelicula.obtenerPeliculas(),this, getLayoutInflater());
        rvPelicula.setAdapter(adapter);
    }
}
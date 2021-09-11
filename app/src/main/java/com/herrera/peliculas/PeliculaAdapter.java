package com.herrera.peliculas;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import modelo.Pelicula;

    public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private ArrayList<Pelicula> peliculas;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(ArrayList<Pelicula> peliculas, Context context, LayoutInflater layoutInflater) {
        this.peliculas = peliculas;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }
    
        @NonNull
        @Override
        //referenciar a la vista item y pasársela al ViewHolder.
        public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
            return new ViewHolder(view);
    }

        @Override
        //se ejecuta por cada item de la lista
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.tvTitulo.setText(peliculas.get(position).getTitulo());
    holder.tvDescripcion.setText(peliculas.get(position).getDescripcion());
    holder.ivFoto.setImageResource(peliculas.get(position).getFoto());

    holder.btDetalles.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        peliculas.get(position).getActores();
        peliculas.get(position).getDirector();
        }
    });
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView tvTitulo, tvDescripcion;
        private ImageView ivFoto;
        private Button btDetalles;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            btDetalles = itemView.findViewById(R.id.btDetalle);
        }
    }
}

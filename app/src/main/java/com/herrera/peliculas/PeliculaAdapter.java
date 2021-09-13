package com.herrera.peliculas;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
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

            final Pelicula pelicula = peliculas.get(position);

        holder.tvTitulo.setText(pelicula.getTitulo());
                holder.tvDescripcion.setText(pelicula.getDescripcion());
                    holder.ivFoto.setImageResource(pelicula.getFoto());


                    holder.btDetalles.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(context, VistaDetallada.class);
                            i.putExtra("titulo", pelicula.getTitulo());
                            i.putExtra("descripcion", pelicula.getDescripcion());
                            i.putExtra("foto", pelicula.getFoto());
                            i.putExtra("actores", pelicula.getActores());
                            i.putExtra("director", pelicula.getDirector());

                        context.startActivity(i);
                        }
                    });
        }


    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView tvTitulo, tvDescripcion,tvActores, tvDirector;
        private ImageView ivFoto;
        private Button btDetalles;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitul);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcio);
            ivFoto = itemView.findViewById(R.id.ivFot);
            btDetalles = itemView.findViewById(R.id.btDetalle);
            tvActores = itemView.findViewById(R.id.tvActores);
            tvDirector = itemView.findViewById(R.id.tvDirector);
        }
    }
}

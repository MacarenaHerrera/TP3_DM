package modelo;

import com.herrera.peliculas.R;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula  {
    private String titulo;
    private int foto;
    private String descripcion;
    private String actores;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int foto, String descripcion, String actores, String director) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.actores = actores;
        this.director = director;


    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList <Pelicula> obtenerPeliculas(){
        ArrayList<Pelicula> lista = new ArrayList<Pelicula>();

        lista.add(new Pelicula("Shrek", R.drawable.shrek, "Excelente pelicula infantil, apta para toda la familia. Con humor y carisma en cada escena.", "Brad y Jolie", "Joaquin Sabina"));
        lista.add(new Pelicula("Buscando a Nemo", R.drawable.buscandoanemo, "Primera película de pixar, cuenta la historia de una padre que con tal de encontrar a su hijo recorre todo el oceano contra todo pronóstico.", "Brad y Jolie", "Joaquin Sabina"));
        lista.add(new Pelicula("La Sirenita", R.drawable.lasirenita, "Clásico de Disney, una princesa no conforme con la vida que llevaba decide cambiar su mayor don con tal de cumplir su sueño", "Brad y Jolie", "Joaquin Sabina"));
        lista.add(new Pelicula("Moana", R.drawable.moana,"Vivaz, divertida, revolucionara. Moana es una pelicula que muestra la vida de una niña encerrada en una isla que quiere ir mucho más allá.", "Brad y Jolie", "Joaquin Sabina"));

        return lista;
    }
}

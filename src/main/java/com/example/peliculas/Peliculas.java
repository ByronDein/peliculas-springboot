package com.example.peliculas;

public class Peliculas {
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private Number año;
    private String sipnosis;

    public Peliculas(int id, String titulo, String director, String genero, Number año, String sipnosis) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.año = año;
        this.sipnosis = sipnosis;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public Number getAño() {
        return año;
    }

    public String getSipnosis() {
        return sipnosis;
    }
}

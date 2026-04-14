package com.example.peliculas.service;

import java.util.List;
import java.util.Optional;

import com.example.peliculas.model.Peliculas;

public interface PeliculasService {
    List<Peliculas> getAllPeliculas();
    Optional<Peliculas> getPeliculaById(Long id);


    Peliculas savePelicula(Peliculas pelicula);
    Peliculas updatePelicula(Long id,Peliculas pelicula);
    void deletePeliculaById(Long id);
}

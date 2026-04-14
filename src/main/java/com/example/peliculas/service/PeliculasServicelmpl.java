package com.example.peliculas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.repository.PeliculasRepository;

@Service
public class PeliculasServicelmpl implements PeliculasService {
    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Peliculas> getPeliculaById(Long id) {
        return peliculasRepository.findById(id);
    }

    @Override
    public Peliculas savePelicula(Peliculas pelicula) {
        return peliculasRepository.save(pelicula);
    }

    @Override
    public Peliculas updatePelicula(Long id, Peliculas pelicula) {
        if(peliculasRepository.existsById(id)) {
            pelicula.setId(id);
            return peliculasRepository.save(pelicula);
        }
        else {
            return null;
        }
    }

    @Override
    public void deletePeliculaById(Long id) {
        peliculasRepository.deleteById(id);
    }

}

package com.example.peliculas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.peliculas.model.Peliculas;
import com.example.peliculas.service.PeliculasService;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Peliculas> getPeliculas() {
        return peliculasService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Peliculas> getPeliculaById(@PathVariable Long id) { 
        return peliculasService.getPeliculaById(id);
    }

    @PostMapping
    public Peliculas savePelicula(@RequestBody Peliculas pelicula) {
        return peliculasService.savePelicula(pelicula);
    }

    @PutMapping("/{id}")
    public Peliculas updatePelicula(@PathVariable Long id, @RequestBody Peliculas pelicula) {
        return peliculasService.updatePelicula(id, pelicula);
    }

    @DeleteMapping("/{id}")
    public void deletePeliculaById(@PathVariable Long id) {
        peliculasService.deletePeliculaById(id);
    }

}

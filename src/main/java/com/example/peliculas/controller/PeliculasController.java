package com.example.peliculas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Optional<Peliculas> getPeliculaById(@PathVariable Long id) { // <- CAMBIAR AQUÍ
        return peliculasService.getPeliculaById(id);
    }

}

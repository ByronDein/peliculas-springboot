package com.example.peliculas;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController() {
        peliculas.add(new Peliculas(1, "El Padrino", "Francis Ford Coppola", "Crimen", 1972, "La historia de la familia Corleone, una de las más poderosas familias mafiosas de Nueva York."));
        peliculas.add(new Peliculas(2, "El Caballero Oscuro", "Christopher Nolan", "Acción", 2008, "Batman se enfrenta a su mayor enemigo, el Joker, quien busca sumir a Gotham en el caos."));
        peliculas.add(new Peliculas(3, "Pulp Fiction", "Quentin Tarantino", "Crimen", 1994, "Una serie de historias entrelazadas que giran en torno a la vida de varios personajes en Los Ángeles."));
        peliculas.add(new Peliculas(4, "Batan", "Bruce wayne", "Accion", 2005, "Batman se enfrenta a su mayor enemigo, el Joker, quien busca sumir a Gotham en el caos."));
        peliculas.add(new Peliculas(5, "Pulp Fiction", "Quentin Tarantino", "Crimen", 1994, "Una serie de historias entrelazadas que giran en torno a la vida de varios personajes en Los Ángeles."));
    }

    @PostMapping("peliculas")
    public List<Peliculas> createPelicula(@RequestBody Peliculas pelicula) {
        peliculas.add(pelicula);

        return peliculas;
    }

    @GetMapping("peliculas")
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    @GetMapping("peliculas/{id}")
    public Peliculas getPeliculaById(@PathVariable int id) {
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }

    @DeleteMapping("peliculas/{id}")
    public List<Peliculas> deletePeliculaById(@PathVariable int id) {
        peliculas.removeIf(pelicula -> pelicula.getId() == id);
        return peliculas;

    }

}

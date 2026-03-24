package com.Bibloteca.Proyecto.De.Bibloteca.Controller;


import com.Bibloteca.Proyecto.De.Bibloteca.Model.Libro;
import com.Bibloteca.Proyecto.De.Bibloteca.Services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }

    @GetMapping("AñoLista")
    public List<Libro> getTotalLibrosAnio(@PathVariable int year){return libroService.getTotalLibrosPorAnio(year); }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) { return libroService.updateLibro(libro); }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/buscar/autor/{autor:.+}")
    public List<Libro> buscarPorAutor(@PathVariable String autor) { return libroService.buscarPorAutor(autor); }

    @GetMapping("/reportes/masAntiguo")
    public Libro getMoreOld(){ return libroService.getMoreOld();}

    @GetMapping("/reportes/masNuevo")
    public Libro getMoreNew(){ return libroService.getMoreNew();}
}

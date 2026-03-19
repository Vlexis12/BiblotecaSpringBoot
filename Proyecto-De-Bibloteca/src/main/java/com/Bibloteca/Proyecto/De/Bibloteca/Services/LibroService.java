package com.Bibloteca.Proyecto.De.Bibloteca.Services;

import com.Bibloteca.Proyecto.De.Bibloteca.Model.Libro;
import com.Bibloteca.Proyecto.De.Bibloteca.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired

    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return  libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorID(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "Producto Eliminado";
    }
}

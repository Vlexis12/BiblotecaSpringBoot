package com.Bibloteca.Proyecto.De.Bibloteca.Services;

import com.Bibloteca.Proyecto.De.Bibloteca.Model.Prestamos;
import com.Bibloteca.Proyecto.De.Bibloteca.Repository.PrestamosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    private PrestamosRepository repo;
    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    public List<Prestamos> listarTodo(){
        return repo.obtenerTodos();
    }

    public Prestamos CreaPrestamo(Prestamos p){
        repo.guardar(p);
        return p;
    }

    public Prestamos verUno(int id){
        return repo.buscarPorId(id);
    }

    public Prestamos actualizarPrestamo(int id, Prestamos p){
        return repo.actualizar(id, p);
    }

    public boolean borrarPrestamo(int id){
        return repo.eliminar(id);
    }
}

package com.Bibloteca.Proyecto.De.Bibloteca.Controller;

import com.Bibloteca.Proyecto.De.Bibloteca.Model.Prestamos;
import com.Bibloteca.Proyecto.De.Bibloteca.Services.PrestamoService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService service;

    @GetMapping
    public List<Prestamos> listaPrestamos(){
        return service.listarTodo();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prestamos guardar(@RequestBody Prestamos p) {
        return service.CreaPrestamo(p);
    }

    @GetMapping("/{id}")
    public Prestamos obtenerUno(@PathVariable int id){
    return service.verUno(id);
    }

    @PutMapping("/{id}")
    public Prestamos actualizar(@PathVariable int id, @RequestBody Prestamos p){
        return service.actualizarPrestamo(id, p);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable int id){
        service.borrarPrestamo(id);
    }
}

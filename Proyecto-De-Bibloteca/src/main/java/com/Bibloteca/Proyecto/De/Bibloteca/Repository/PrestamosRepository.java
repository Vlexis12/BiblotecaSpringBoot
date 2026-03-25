package com.Bibloteca.Proyecto.De.Bibloteca.Repository;

import com.Bibloteca.Proyecto.De.Bibloteca.Model.Prestamos;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PrestamosRepository {
    private List<Prestamos> listaPrestamos = new ArrayList<>();
    private int contadorId = 1;

    public List<Prestamos> obtenerTodos(){
        return listaPrestamos;
    }

    public Prestamos guardar(Prestamos nuevoPrestamo){
        nuevoPrestamo.setId_prestamo(contadorId);
        listaPrestamos.add(nuevoPrestamo);
        contadorId++;{
            return null;
        }
    }

    public Prestamos buscarPorId(int IdBuscado){
        for (Prestamos p : listaPrestamos){
            if (p.getId_prestamo()== IdBuscado){
                return p;
            }
        }
        return null;
    }

    public Prestamos actualizar(int id, Prestamos datosNuevos){
        for (Prestamos p : listaPrestamos){
            if (p.getId_prestamo()== id){
                p.setId_libro(datosNuevos.getId_libro());
                p.setRun_solicitante(datosNuevos.getRun_solicitante());
                p.setFecha_entrega(datosNuevos.getFecha_entrega());
                p.setCantidad_dias(datosNuevos.getCantidad_dias());
                p.setMultas(datosNuevos.getMultas());
                return p;
            }
        }
        return null;
    }
    public boolean eliminar(int id){
        for (Prestamos p: listaPrestamos){
            if (p.getId_prestamo()==id){
                listaPrestamos.remove(p);
                return true;
            }
        }
        return false;
    }
}

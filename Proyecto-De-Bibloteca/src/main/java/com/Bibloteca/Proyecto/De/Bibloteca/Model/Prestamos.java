package com.Bibloteca.Proyecto.De.Bibloteca.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prestamos {
    private Integer id_prestamo;
    private Integer id_libro;
    private String run_solicitante;
    private Date fecha_solicitud = new Date();
    private Date fecha_entrega = null;
    private Integer cantidad_dias;
    private Integer multas = 0;

}

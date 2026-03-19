package com.Bibloteca.Proyecto.De.Bibloteca.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // Genera Getters and Setters, toString...
@AllArgsConstructor // Genera Constructor en todos los campos
@NoArgsConstructor // Genera un Constructor vacio(Sin Argumentos)
public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}

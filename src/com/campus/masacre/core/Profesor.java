package com.campus.masacre.core;

/**
 * Representa al profesor personalizado por el usuario, asociado a un
 * departamento académico específico. Es un objeto de datos simple (POJO)
 * generado por las fábricas concretas (Abstract Factory).
 */
public class Profesor {

    private final String nombre;
    private final String departamento;

    public Profesor(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nombre + " (Departamento de " + departamento + ")";
    }
}

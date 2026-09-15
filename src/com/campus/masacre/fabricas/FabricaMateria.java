package com.campus.masacre.fabricas;

import com.campus.masacre.core.Arma;
import com.campus.masacre.core.Profesor;

/**
 * Interfaz de Abstract Factory. Define el contrato para crear una "familia"
 * de objetos relacionados (un Profesor de un área específica y su arsenal
 * temático de 6 armas), sin acoplar el código cliente a las clases concretas.
 */
public interface FabricaMateria {

    /**
     * Crea el profesor asociado a esta materia/departamento.
     *
     * @param nombre nombre personalizado ingresado por el usuario
     * @return instancia de Profesor con el departamento correcto
     */
    Profesor crearProfesor(String nombre);

    /**
     * Crea el arsenal completo (6 armas) correspondiente a esta materia,
     * delegando la instanciación puntual de cada arma en Factory Methods
     * concretos.
     *
     * @return arreglo de 6 objetos Arma listos para usarse
     */
    Arma[] crearArmas();

    /** @return nombre legible de la materia/departamento representado. */
    String getNombreMateria();
}

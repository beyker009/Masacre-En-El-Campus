package com.campus.masacre.fabricas;

import com.campus.masacre.armas.matematicas.CompasMetalico;
import com.campus.masacre.armas.matematicas.LapiceroTactico;
import com.campus.masacre.armas.matematicas.PupitreEscolar;
import com.campus.masacre.armas.matematicas.ReglaMadera;
import com.campus.masacre.armas.matematicas.TransportadorMetalico;
import com.campus.masacre.armas.matematicas.VentiladorPedestal;
import com.campus.masacre.core.Arma;
import com.campus.masacre.core.Profesor;

/**
 * Fábrica concreta (Abstract Factory) para el departamento de Matemáticas.
 * También expone el Factory Method {@link #crearArma(String)} que encapsula
 * la instanciación puntual de cada una de las 6 armas de esta familia.
 */
public class FabricaMatematicas implements FabricaMateria {

    private static final String MATERIA = "Matemáticas";

    @Override
    public Profesor crearProfesor(String nombre) {
        return new Profesor(nombre, MATERIA);
    }

    @Override
    public Arma[] crearArmas() {
        return new Arma[] {
            crearArma("COMPAS"),
            crearArma("REGLA"),
            crearArma("LAPICERO"),
            crearArma("TRANSPORTADOR"),
            crearArma("PUPITRE"),
            crearArma("VENTILADOR")
        };
    }

    @Override
    public String getNombreMateria() {
        return MATERIA;
    }

    /**
     * Factory Method: dado un identificador textual, instancia la subclase
     * concreta de {@link Arma} correspondiente al área de Matemáticas, sin
     * exponer el detalle de construcción al código cliente.
     *
     * @param tipo identificador del arma a construir (p. ej. "COMPAS")
     * @return instancia concreta expuesta como abstracción {@link Arma}
     * @throws IllegalArgumentException si el tipo no pertenece a esta familia
     */
    private Arma crearArma(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "COMPAS" -> new CompasMetalico();
            case "REGLA" -> new ReglaMadera();
            case "LAPICERO" -> new LapiceroTactico();
            case "TRANSPORTADOR" -> new TransportadorMetalico();
            case "PUPITRE" -> new PupitreEscolar();
            case "VENTILADOR" -> new VentiladorPedestal();
            default -> throw new IllegalArgumentException(
                    "Tipo de arma desconocido para Matemáticas: " + tipo);
        };
    }
}

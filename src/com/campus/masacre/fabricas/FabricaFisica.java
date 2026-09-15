package com.campus.masacre.fabricas;

import com.campus.masacre.armas.fisica.CableExtension;
import com.campus.masacre.armas.fisica.EngrapadoraIndustrial;
import com.campus.masacre.armas.fisica.LanzallamasCasero;
import com.campus.masacre.armas.fisica.PenduloAcero;
import com.campus.masacre.armas.fisica.ProyectorAula;
import com.campus.masacre.armas.fisica.TermoMetalico;
import com.campus.masacre.core.Arma;
import com.campus.masacre.core.Profesor;

/**
 * Fábrica concreta (Abstract Factory) para el departamento de Física.
 * También expone el Factory Method {@link #crearArma(String)} que encapsula
 * la instanciación puntual de cada una de las 6 armas de esta familia.
 */
public class FabricaFisica implements FabricaMateria {

    private static final String MATERIA = "Física";

    @Override
    public Profesor crearProfesor(String nombre) {
        return new Profesor(nombre, MATERIA);
    }

    @Override
    public Arma[] crearArmas() {
        return new Arma[] {
            crearArma("TERMO"),
            crearArma("PENDULO"),
            crearArma("PROYECTOR"),
            crearArma("CABLE"),
            crearArma("LANZALLAMAS"),
            crearArma("ENGRAPADORA")
        };
    }

    @Override
    public String getNombreMateria() {
        return MATERIA;
    }

    /**
     * Factory Method: dado un identificador textual, instancia la subclase
     * concreta de {@link Arma} correspondiente al área de Física.
     *
     * @param tipo identificador del arma a construir (p. ej. "TERMO")
     * @return instancia concreta expuesta como abstracción {@link Arma}
     * @throws IllegalArgumentException si el tipo no pertenece a esta familia
     */
    private Arma crearArma(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "TERMO" -> new TermoMetalico();
            case "PENDULO" -> new PenduloAcero();
            case "PROYECTOR" -> new ProyectorAula();
            case "CABLE" -> new CableExtension();
            case "LANZALLAMAS" -> new LanzallamasCasero();
            case "ENGRAPADORA" -> new EngrapadoraIndustrial();
            default -> throw new IllegalArgumentException(
                    "Tipo de arma desconocido para Física: " + tipo);
        };
    }
}

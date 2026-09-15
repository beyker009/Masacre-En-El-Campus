package com.campus.masacre.fabricas;

import com.campus.masacre.armas.ingenieria.BisturiMaquetacion;
import com.campus.masacre.armas.ingenieria.CautinElectrico;
import com.campus.masacre.armas.ingenieria.CuterPesado;
import com.campus.masacre.armas.ingenieria.HachaIncendio;
import com.campus.masacre.armas.ingenieria.MartilloGrande;
import com.campus.masacre.armas.ingenieria.Motosierra;
import com.campus.masacre.core.Arma;
import com.campus.masacre.core.Profesor;

/**
 * Fábrica concreta (Abstract Factory) para el departamento de Ingeniería.
 * También expone el Factory Method {@link #crearArma(String)} que encapsula
 * la instanciación puntual de cada una de las 6 armas de esta familia.
 */
public class FabricaIngenieria implements FabricaMateria {

    private static final String MATERIA = "Ingeniería";

    @Override
    public Profesor crearProfesor(String nombre) {
        return new Profesor(nombre, MATERIA);
    }

    @Override
    public Arma[] crearArmas() {
        return new Arma[] {
            crearArma("BISTURI"),
            crearArma("CAUTIN"),
            crearArma("MARTILLO"),
            crearArma("MOTOSIERRA"),
            crearArma("HACHA"),
            crearArma("CUTER")
        };
    }

    @Override
    public String getNombreMateria() {
        return MATERIA;
    }

    /**
     * Factory Method: dado un identificador textual, instancia la subclase
     * concreta de {@link Arma} correspondiente al área de Ingeniería.
     *
     * @param tipo identificador del arma a construir (p. ej. "MARTILLO")
     * @return instancia concreta expuesta como abstracción {@link Arma}
     * @throws IllegalArgumentException si el tipo no pertenece a esta familia
     */
    private Arma crearArma(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "BISTURI" -> new BisturiMaquetacion();
            case "CAUTIN" -> new CautinElectrico();
            case "MARTILLO" -> new MartilloGrande();
            case "MOTOSIERRA" -> new Motosierra();
            case "HACHA" -> new HachaIncendio();
            case "CUTER" -> new CuterPesado();
            default -> throw new IllegalArgumentException(
                    "Tipo de arma desconocido para Ingeniería: " + tipo);
        };
    }
}

package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: una engrapadora industrial de oficina. */
public class EngrapadoraIndustrial extends Arma {

    public EngrapadoraIndustrial() {
        super("Engrapadora Industrial", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante toma la engrapadora industrial metálica del escritorio del laboratorio...",
            "Verifica el riel cargado con grapas gruesas de acero y avanza hacia {PROFESOR}.",
            "Prensa al docente contra la mesa sujetándolo fuertemente por la parte posterior de la cabeza."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante coloca la base de la engrapadora directamente sobre la frente de {PROFESOR} "
             + "y descarga el resorte con fuerza. La primera grapa perfora el hueso frontal liberando un chorro de sangre; "
             + "sin dudarlo, acciona el mecanismo repetidamente clavando una serie de grapas metálicas "
             + "a lo largo de los párpados y la boca del docente, sellándole el rostro por completo "
             + "hasta que la cabeza de {PROFESOR} queda inerte perforada contra el tablero de madera.";
    }
}

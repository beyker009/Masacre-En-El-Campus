package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: una regla de madera de metro. */
public class ReglaMadera extends Arma {

    public ReglaMadera() {
        super("Regla de Madera", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante toma la regla de madera pesada de un metro que descansaba junto a la pizarra...",
            "Camina a pasos firmes por el frente del aula, ubicándose justo detrás del asiento de {PROFESOR}.",
            "Levanta el instrumento de madera con ambas manos por encima de su cabeza marcando impulso."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante asesta un impacto brutal en la nuca a {PROFESOR} con la regla pesada. "
             + "La madera se astilla con estruendo contra la base de su cráneo, dejándolo desplomado e inerte sobre el escritorio.";
    }
}

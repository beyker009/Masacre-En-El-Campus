package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: un pesado pupitre escolar de madera y metal. */
public class PupitreEscolar extends Arma {

    public PupitreEscolar() {
        super("Pupitre Escolar", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante arrastra un pesado pupitre de hierro fundido produciendo un chirrido ensordecedor...",
            "Se aproxima lentamente a la tarima mientras {PROFESOR} escribe ecuaciones en la pizarra.",
            "Sujeta la estructura metálica por la base y la eleva por encima de sus hombros."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante deja caer el pesado pupitre con toda su fuerza sobre la espalda de {PROFESOR}, "
             + "partiéndole la columna vertebral de un solo golpe e incrustándolo contra el suelo del aula.";
    }
}

package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: un lapicero reconvertido en herramienta táctica. */
public class LapiceroTactico extends Arma {

    public LapiceroTactico() {
        super("Lapicero Táctico", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante camina hacia el estrado sosteniendo la hoja de examen reprobado...",
            "Se posiciona a pocos centímetros de {PROFESOR} simulando pedir una revisión de nota.",
            "Empuña el lapicero táctico reforzado oculto firmemente en su mano derecha."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "Con un movimiento veloz, el estudiante clava el lapicero táctico directamente en la cuenca ocular de {PROFESOR}, "
             + "atravesando la zona con precisión hasta fijar su cabeza contra la hoja de respuestas.";
    }
}

package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: un compás de metal escolar. */
public class CompasMetalico extends Arma {

    public CompasMetalico() {
        super("Compás Metálico", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante se levanta de su asiento en silencio...",
            "Avanza lentamente por el pasillo central del aula hacia la mesa de {PROFESOR}.",
            "Saca el compás metálico pesado del estuche y ajusta la punta fija de acero."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "Al llegar frente al escritorio, el estudiante asesta una perforación directa con las puntas del compás "
             + "sobre la yugular de {PROFESOR}, haciéndolo girar en 360 grados sobre su cuello hasta dejar derramada "
             + "toda la sangre sobre los exámenes reprobados.";
    }
}

package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: un termo metálico de laboratorio. */
public class TermoMetalico extends Arma {

    public TermoMetalico() {
        super("Termo Metálico", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante toma el termo de acero reforzado por el asa, notando la temperatura extrema en la superficie...",
            "Avanza con paso firme por el pasillo del laboratorio hasta quedar frente al escritorio de {PROFESOR}.",
            "Desenrosca la tapa superior liberando una densa columna de vapor hirviendo."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante vierte el contenido hirviendo del termo directamente sobre los ojos y rostro de {PROFESOR}, "
             + "quien cae de espaldas al suelo emitiendo desgarradores alaridos mientras la piel se le desprende. "
             + "Aprovechando su vulnerabilidad, el estudiante agarra el pesado cilindro de acero por la base "
             + "y descarga tres golpes contundentes sobre su cabeza, fracturándole el frontal y dejando el cuerpo inmóvil "
             + "en medio de un charco de líquido y sangre.";
    }
}

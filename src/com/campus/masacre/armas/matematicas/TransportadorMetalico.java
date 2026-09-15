package com.campus.masacre.armas.matematicas;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Matemáticas: un transportador metálico de precisión. */
public class TransportadorMetalico extends Arma {

    public TransportadorMetalico() {
        super("Transportador Metálico", "Matemáticas");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante saca un transportador de acero rígido con bordes biselados del estuche...",
            "Avanza en absoluto silencio hacia la pizarra, colocándose a espaldas de {PROFESOR}.",
            "Empuña el arco metálico con fuerza, alineando la hoja afilada con la garganta del docente."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante clava el borde afilado del transportador directamente en la yugular de {PROFESOR} "
             + "y ejerce presión rasgando el cuello en un arco perfecto de 180 grados. "
             + "La sangre brota a borbotones manchando la pizarra, mientras el docente intenta vanamente retener la hemorragia "
             + "antes de desplomarse convulsivamente en un charco rojo sobre la tarima.";
    }
}

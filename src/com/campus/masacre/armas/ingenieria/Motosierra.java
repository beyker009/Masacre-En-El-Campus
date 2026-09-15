package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: una motosierra usada en talleres de construcción. */
public class Motosierra extends Arma {

    public Motosierra() {
        super("Motosierra", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante tira con fuerza del cable de arranque de la motosierra hasta que el motor ruge con potencia...",
            "El ensordecedor ruido llena el laboratorio mientras la cadena dentada gira a máxima velocidad.",
            "Avanza empuñando la herramienta por el asa hacia la tarima donde {PROFESOR} intenta retroceder."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante hunde la cadena en movimiento directamente sobre el hombro y el pecho de {PROFESOR}. "
             + "Los dientes de acero desgarran la ropa, despedazan la piel y trituran las costillas en un segundo, "
             + "proyectando una lluvia de sangre y tejido sobre las mesas de laboratorio. "
             + "La cuchilla atraviesa el torso verticalmente hasta que el cuerpo de {PROFESOR} se desploma dividida e inerte sobre las baldosas.";
    }
}

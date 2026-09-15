package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: un lanzallamas casero construido para una demostración de combustión. */
public class LanzallamasCasero extends Arma {

    public LanzallamasCasero() {
        super("Lanzallamas Casero", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante saca una lata de solvente en aerosol de alta presión y un encendedor de soplete...",
            "Avanza por el pasillo del laboratorio hacia el escritorio de {PROFESOR}.",
            "Acciona la chispa del encendedor y la coloca directamente frente a la boquilla del bote."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante presiona la válvula al máximo y proyecta una llamarada de dos metros sobre la cara de {PROFESOR}. "
             + "El calor extremo derrite la piel y el cabello en cuestión de segundos; {PROFESOR} colapsa al suelo gritando "
             + "mientras las llamas le calcinan las vías respiratorias. El estudiante mantiene el chorro de fuego "
             + "sobre el rostro del docente hasta que los gritos cesan y el cuerpo queda inmóvil y carbonizado entre los pupitres.";
    }
}

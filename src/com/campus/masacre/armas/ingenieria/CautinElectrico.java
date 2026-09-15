package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: un cautín eléctrico de taller. */
public class CautinElectrico extends Arma {

    public CautinElectrico() {
        super("Cautín Eléctrico", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante desconecta de la estación de trabajo un cautín con la punta al rojo vivo...",
            "Avanza por el pasillo entre mesas de reactivos sosteniendo el instrumento por el mango aislante.",
            "Se coloca detrás de {PROFESOR}, quien revisa una tabla periódica en su escritorio."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante clava la punta incandescente del cautín directamente en la mejilla de {PROFESOR}, "
             + "quemando a través de la piel y el músculo con un siseo sofocante. Acto seguido, arrastra la punta "
             + "ardiente hacia la mejilla opuesta cruzando la cavidad bucal; {PROFESOR} colapsa retorciéndose de dolor "
             + "mientras el humo de tejido cauterizado llena el aire del laboratorio hasta que cae inerte sobre las baldosas.";
    }
}

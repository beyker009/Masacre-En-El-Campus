package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: un bisturí usado para cortar maquetas. */
public class BisturiMaquetacion extends Arma {

    public BisturiMaquetacion() {
        super("Bisturí de Maquetación", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante toma un bisturí fino con hoja de acero inoxidable del kit de disección...",
            "Se desliza sigilosamente entre las mesas de reactivos hasta quedar al lado del escritorio de {PROFESOR}.",
            "Sujeta el mango metálico con la firmeza y precisión de un cirujano."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante sujeta la cabeza de {PROFESOR} hacia atrás e incrusta la fina hoja del bisturí "
             + "directamente en la manzana de Adán. Con un corte horizontal rápido y seco, secciona la tráquea "
             + "y los vasos sanguíneos principales del cuello; {PROFESOR} colapsa sobre la mesa intentando contener "
             + "el flujo con las manos, mientras la sangre baña los microscopios y las guías de laboratorio "
             + "hasta que cesan sus espasmos.";
    }
}

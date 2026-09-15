package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: un cúter pesado de uso industrial. */
public class CuterPesado extends Arma {

    public CuterPesado() {
        super("Cúter Pesado", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante desliza el seguro de un cúter pesado de acero inoxidable...",
            "Hace salir la cuchilla segmentada produciendo varios chasquidos metálicos consecutivos.",
            "Avanza rápidamente hacia el escritorio donde {PROFESOR} revisa unos reportes."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante toma a {PROFESOR} del cabello y pasa la hoja afilada del cúter de lado a lado por su cuello. "
             + "La cuchilla de acero rasga la piel y secciona la vena yugular al instante; el estudiante ejerce más presión "
             + "prolongando el corte hacia el hombro mientras {PROFESOR} convulsiona en el suelo tratando de detener el sangrado, "
             + "hasta que el cuerpo queda totalmente inmóvil en medio del charco rojo.";
    }
}

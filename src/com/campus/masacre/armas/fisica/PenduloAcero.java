package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: un péndulo de acero usado en demostraciones. */
public class PenduloAcero extends Arma {

    public PenduloAcero() {
        super("Péndulo de Acero", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante desengancha del soporte del laboratorio una esfera de acero macizo atada a un cable de tungsteno...",
            "Se posiciona al costado del escritorio de {PROFESOR} sosteniendo la bola metálica pesada a la altura del hombro.",
            "Alinea la trayectoria de oscilación directo hacia la cabeza del docente y la suelta con impulso adicional."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "La masa de acero describe un arco acelerado e impacta de lleno en el hueso temporal de {PROFESOR}. "
             + "El golpe fractura el cráneo con un chasquido seco y proyecta pedazos de hueso y masa encefálica "
             + "contra la pizarra de física. {PROFESOR} cae de costado sobre la mesa, mientras el péndulo "
             + "continúa oscilando de lado a lado, goteando sangre sobre sus apuntes de clase.";
    }
}

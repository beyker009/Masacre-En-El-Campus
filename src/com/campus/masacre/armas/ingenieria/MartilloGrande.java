package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: un martillo grande de taller mecánico. */
public class MartilloGrande extends Arma {

    public MartilloGrande() {
        super("Martillo Grande", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante levanta un martillo grande con masa de acero reforzada...",
            "Sujeta el largo mango con ambas manos ajustando el agarre.",
            "Avanza decididamente por el laboratorio hacia el escritorio de {PROFESOR}."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante balancea el martillo grande de lado y descarga la masa de acero directamente en el parietal de {PROFESOR}. "
             + "El impacto destroza el hueso lateral proyectando esquirlas y tejido contra los reactivos de la mesa. "
             + "Sin dar tiempo a reacción, asesta un segundo golpe descendente en el rostro, aplastando el tabique "
             + "y dejando el cuerpo del docente inerte sobre el piso de baldosas.";
    }
}

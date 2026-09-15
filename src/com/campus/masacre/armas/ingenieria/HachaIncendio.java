package com.campus.masacre.armas.ingenieria;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Ingeniería: un hacha de emergencia contra incendios. */
public class HachaIncendio extends Arma {

    public HachaIncendio() {
        super("Hacha de Incendio", "Ingeniería");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante rompe el cristal del gabinete de incendios del laboratorio...",
            "Extrae el hacha de emergencia de mango de fibra y hoja de acero afilada.",
            "Avanza con paso pesado hacia la tarima alzando el filo por encima de su cabeza."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante descarga el hacha de emergencia con fuerza descomunal sobre el hombro de {PROFESOR}, "
             + "partiendo la clavícula y cercenando músculos hasta incrustar la hoja profundamente en su tórax. "
             + "Con un tirón violento la desengancha y asesta un segundo impacto directo en el cráneo del docente, "
             + "dividiéndolo al medio y dejando caer el cuerpo inerte sobre el piso de baldosas.";
}
}

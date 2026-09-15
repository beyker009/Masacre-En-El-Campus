package com.campus.masacre.armas.fisica;

import com.campus.masacre.core.Arma;

/** Arma temática del área de Física: un proyector de aula pesado y antiguo. */
public class ProyectorAula extends Arma {

    public ProyectorAula() {
        super("Proyector de Aula", "Física");
    }

    @Override
    protected String[] obtenerLineasAnimacion() {
        return new String[] {
            "El estudiante arranca el proyector encendido de su soporte de techo, dejando los cables echando chispas...",
            "Sosteniendo el pesado aparato ardiente con ambas manos, avanza hacia la mesa de {PROFESOR}.",
            "Alinea el lente hirviente y las esquinas metálicas reforzadas a la altura del rostro del docente."
        };
    }

    @Override
    protected String obtenerNarrativaImpacto() {
        return "El estudiante estrella la esquina metálica del proyector contra el rostro de {PROFESOR}, "
             + "partiéndole la mandíbula al primer golpe y arrojándolo al suelo. Acto seguido, presiona la lente "
             + "y la rejilla de ventilación ardiente directamente sobre su cara; el calor extremo le abrasa "
             + "los ojos y la piel mientras el estudiante descarga dos pisadas sobre el chasis del aparato, "
             + "aplastando la cabeza de {PROFESOR} contra las baldosas bajo la estructura destrozada del proyector.";
    }
}

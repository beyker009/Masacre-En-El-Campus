package com.campus.masacre.builder;

import com.campus.masacre.core.Arma;
import com.campus.masacre.core.ConsolaUtil;
import com.campus.masacre.core.LectorEntrada;
import com.campus.masacre.core.Profesor;

public class Partida {

    private Profesor profesorActual;
    private Arma[] armasDisponibles;

    public Partida() {}

    public Partida(Profesor profesor, Arma[] armas) {
        this.profesorActual = profesor;
        this.armasDisponibles = armas;
    }

    public void setProfesorActual(Profesor profesor) {
        this.profesorActual = profesor;
    }

    public void setArmasDisponibles(Arma[] armas) {
        this.armasDisponibles = armas;
    }

    public void iniciar() {
        if (profesorActual == null || armasDisponibles == null) {
            return;
        }

        // Recuadro informativo del Objetivo
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.println(" DEPARTAMENTO: " + ConsolaUtil.BLANCO_NEGRITA + profesorActual.getDepartamento().toUpperCase() + ConsolaUtil.RESET);
        System.out.println(" PROFESOR OBJETIVO: " + ConsolaUtil.ROJO + profesorActual.getNombre() + ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();

        boolean enArsenal = true;
        while (enArsenal) {
            System.out.println("\n--- ARSENAL DISPONIBLE EN " + profesorActual.getDepartamento().toUpperCase() + " ---");

            for (int i = 0; i < armasDisponibles.length; i++) {
                System.out.println(" " + ConsolaUtil.VERDE + "[" + (i + 1) + "]" + ConsolaUtil.RESET + " " + armasDisponibles[i].getNombre());
            }
            System.out.println(" " + ConsolaUtil.ROJO + "[" + (armasDisponibles.length + 1) + "]" + ConsolaUtil.RESET + " Volver al menú de departamentos\n");

            int opcionVolver = armasDisponibles.length + 1;
            int seleccion = LectorEntrada.leerEnteroEnRango("Elige un arma (1-" + opcionVolver + "): ", 1, opcionVolver);

            if (seleccion == opcionVolver) {
                enArsenal = false;
            } else {
                Arma armaSeleccionada = armasDisponibles[seleccion - 1];
                armaSeleccionada.ejecutarSecuencia(profesorActual.getNombre());
            }
        }
    }
}
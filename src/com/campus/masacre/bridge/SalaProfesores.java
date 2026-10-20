package com.campus.masacre.bridge;

import com.campus.masacre.core.ConsolaUtil;

/** Concrete Implementation (Bridge): la sala de profesores del campus. */
public class SalaProfesores implements LugarEjecucion {

    @Override
    public void prepararAmbiente() {
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.println(ConsolaUtil.AZUL_CYAN + " ESCENARIO: SALA DE PROFESORES" + ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.formatearTextoMultilinea(
                "Huele a cafe recalentado y a examenes sin calificar. Sobre la mesa central "
              + "descansan pilas de parciales y una cafetera que gotea con desgano.", 84), 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public void aplicarEfectoEntorno(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.AMARILLO + ConsolaUtil.formatearTextoMultilinea(
                "Los demas docentes guardan un silencio incomodo. Las notas pendientes de "
              + nombreProfesor + " quedan esparcidas por la mesa y la cafetera sigue goteando.", 84)
              + ConsolaUtil.RESET, 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public String getNombreLugar() {
        return "Sala de Profesores";
    }
}

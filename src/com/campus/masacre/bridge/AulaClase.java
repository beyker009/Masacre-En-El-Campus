package com.campus.masacre.bridge;

import com.campus.masacre.core.ConsolaUtil;

/** Concrete Implementation (Bridge): un aula de clase del campus. */
public class AulaClase implements LugarEjecucion {

    @Override
    public void prepararAmbiente() {
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.println(ConsolaUtil.AZUL_CYAN + " ESCENARIO: AULA DE CLASE" + ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.formatearTextoMultilinea(
                "Pupitres en fila, una pizarra llena de formulas y el reloj de pared marcando "
              + "la hora del parcial. El aula esta vacia, salvo por el escritorio del docente.", 84), 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public void aplicarEfectoEntorno(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.AMARILLO + ConsolaUtil.formatearTextoMultilinea(
                "La campana suena a lo lejos. En la pizarra queda a medias la ultima formula de "
              + nombreProfesor + " y el aula vuelve a su silencio de siempre.", 84)
              + ConsolaUtil.RESET, 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public String getNombreLugar() {
        return "Aula de Clase";
    }
}

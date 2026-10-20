package com.campus.masacre.bridge;

import com.campus.masacre.core.ConsolaUtil;

/** Concrete Implementation (Bridge): la sala de cómputo del campus. */
public class SalaComputo implements LugarEjecucion {

    @Override
    public void prepararAmbiente() {
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.println(ConsolaUtil.AZUL_CYAN + " ESCENARIO: SALA DE COMPUTO" + ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.formatearTextoMultilinea(
                "Filas de monitores encendidos iluminan la sala con un brillo azulado. "
              + "El aire acondicionado ruge y los ventiladores de las torres zumban sin parar.", 84), 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public void aplicarEfectoEntorno(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.AMARILLO + ConsolaUtil.formatearTextoMultilinea(
                "Todos los monitores parpadean y un aviso de \"Error fatal\" se repite en cada pantalla. "
              + "El proyecto sin guardar de " + nombreProfesor + " se pierde para siempre.", 84)
              + ConsolaUtil.RESET, 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public String getNombreLugar() {
        return "Sala de Computo";
    }
}

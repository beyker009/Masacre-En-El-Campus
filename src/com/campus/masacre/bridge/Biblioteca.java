package com.campus.masacre.bridge;

import com.campus.masacre.core.ConsolaUtil;

/** Concrete Implementation (Bridge): la biblioteca del campus. */
public class Biblioteca implements LugarEjecucion {

    @Override
    public void prepararAmbiente() {
        System.out.println();
        ConsolaUtil.separadorPunteado();
        System.out.println(ConsolaUtil.AZUL_CYAN + " ESCENARIO: BIBLIOTECA" + ConsolaUtil.RESET);
        ConsolaUtil.separadorPunteado();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.formatearTextoMultilinea(
                "El silencio de la biblioteca es absoluto. Entre los estantes polvorientos, "
              + "solo se escucha el zumbido de una lampara fluorescente y el roce de las paginas.", 84), 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public void aplicarEfectoEntorno(String nombreProfesor) {
        System.out.println();
        ConsolaUtil.imprimirConEfectoTipeo(ConsolaUtil.AMARILLO + ConsolaUtil.formatearTextoMultilinea(
                "Nadie levanta la vista. La bibliotecaria apenas susurra \"silencio, por favor\" mientras "
              + "los libros de la mesa de " + nombreProfesor + " quedan sellados para siempre.", 84)
              + ConsolaUtil.RESET, 15);
        ConsolaUtil.pausa(400);
    }

    @Override
    public String getNombreLugar() {
        return "Biblioteca";
    }
}

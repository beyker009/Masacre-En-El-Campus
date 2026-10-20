package com.campus.masacre.bridge;

/**
 * Abstraction (patrón Bridge, estilo Refactoring.Guru). Ofrece el control de
 * alto nivel de un escenario y delega el trabajo real en el objeto
 * {@link LugarEjecucion} que mantiene como referencia (el "puente").
 *
 * <p>La jerarquía de escenarios (esta clase y sus refinamientos) varía de
 * forma independiente a la jerarquía de lugares (implementaciones), y ambas
 * quedan desacopladas de la clase {@code Arma}.</p>
 */
public class EscenarioJuego {

    protected LugarEjecucion lugar;

    public EscenarioJuego(LugarEjecucion lugar) {
        this.lugar = lugar;
    }

    /** Operación de la abstracción: delega en el lugar (antes del arma). */
    public void abrirEscena() {
        lugar.prepararAmbiente();
    }

    /** Operación de la abstracción: delega en el lugar (después del arma). */
    public void cerrarEscena(String nombreProfesor) {
        lugar.aplicarEfectoEntorno(nombreProfesor);
    }

    public String getNombreLugar() {
        return lugar.getNombreLugar();
    }
}

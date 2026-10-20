package com.campus.masacre.bridge;

/**
 * Implementation (patrón Bridge, estilo Refactoring.Guru). Declara la
 * interfaz común de todos los lugares del campus donde puede ocurrir una
 * ejecución. La abstracción ({@link EscenarioJuego}) solo conoce esta
 * interfaz, nunca las clases concretas de cada lugar.
 */
public interface LugarEjecucion {

    /** Proyecta el ambiente temático del lugar ANTES de usar el arma. */
    void prepararAmbiente();

    /**
     * Proyecta el efecto del entorno DESPUÉS de usar el arma.
     *
     * @param nombreProfesor nombre del profesor objetivo
     */
    void aplicarEfectoEntorno(String nombreProfesor);

    /** @return nombre legible del lugar (para menús). */
    String getNombreLugar();
}
